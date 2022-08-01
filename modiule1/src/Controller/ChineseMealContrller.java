package Controller;

import com.jfoenix.controls.JFXTextField;
import db.ChineseMealDatabase;
import db.DoubleRoomDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.ChineseMeal;
import model.DoubleRoom;
import view.tm.ChineseMealTM;

import java.util.Optional;

public class ChineseMealContrller {
    public JFXTextField txtName;
    public JFXTextField txtPrice;
    public TableView<ChineseMealTM> tableChineseMeal;
    public TableColumn colName;
    public TableColumn colPrice;
    public TableColumn colDelete;
    
    
    public void initializer() {

        colName.setCellValueFactory(new PropertyValueFactory("Name"));
        colPrice.setCellValueFactory(new PropertyValueFactory("Price"));
        colDelete.setCellValueFactory(new PropertyValueFactory("btn"));
        loadAllChineseMeal();

        tableChineseMeal.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setData(newValue);
        });
    }

    private void setData(ChineseMealTM tm) {

        txtName.setText(tm.getName());
        txtPrice.setText(String.valueOf(tm.getPrice()));

    }


    private void loadAllChineseMeal() {

            ObservableList<ChineseMealTM> obList = FXCollections.observableArrayList();

            for (ChineseMeal D : ChineseMealDatabase.ChineseMealTable
            ) {
                Button btn = new Button("Delete");

                ChineseMeal tm = new ChineseMeal(D.getName(), D.getPrice(), btn);
                obList.add(tm);

                btn.setOnAction((event -> {

                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                            "Are You Sure?",
                            ButtonType.YES, ButtonType.NO);
                    Optional<ButtonType> buttonType = alert.showAndWait();
                    if (buttonType.get().equals(ButtonType.YES)) {
                        ChineseMealDatabase.ChineseMealTable.remove(D);
                        obList.remove(tm);
                    }
                }));
            }
            tableChineseMeal.setItems(obList);

        }


        public void onClickActionSave (ActionEvent actionEvent){

            ChineseMeal D1 = new ChineseMeal(
                    txtName.getText(),
                    Double.parseDouble(txtPrice.getText())
            );
            ChineseMealDatabase.ChineseMealTable.add(D1);
            loadAllChineseMeal();

    }

    }

