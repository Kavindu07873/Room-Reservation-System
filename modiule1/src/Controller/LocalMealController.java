package Controller;

import com.jfoenix.controls.JFXTextField;
import db.LocalMealDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.LocalMeal;
import view.tm.LocalMealTM;

import java.util.Optional;

public class LocalMealController {
    public JFXTextField txtName;
    public JFXTextField txtPrice;
    public TableView<LocalMealTM> tblLocalMeal;
    public TableColumn colName;
    public TableColumn colPrice;
    public TableColumn colDelete;


    public void Initializer() {
        colName.setCellValueFactory(new PropertyValueFactory<>("Name"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("Price"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));
    loadAllLocalMeal();

        tblLocalMeal.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setData(newValue);

        });
    }

    private void setData(LocalMealTM tm) {


        txtName.setText(tm.getName());
        txtPrice.setText(String.valueOf(tm.getPrice()));

    }

    private void loadAllLocalMeal() {

            ObservableList<LocalMealTM> obList = FXCollections.observableArrayList();

            for (LocalMeal D : LocalMealDatabase.LocalMealTable
            ) {
                Button btn = new Button("Delete");

                LocalMealTM tm = new LocalMealTM(D.getName(), D.getPrice(), btn);
                obList.add(tm);

                btn.setOnAction((event -> {

                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                            "Are You Sure?",
                            ButtonType.YES, ButtonType.NO);
                    Optional<ButtonType> buttonType = alert.showAndWait();
                    if (buttonType.get().equals(ButtonType.YES)) {
                        LocalMealDatabase.LocalMealTable.remove(D);
                        obList.remove(tm);
                    }
                }));
            }
            tblLocalMeal.setItems(obList);
        }


    public void btnSaveOnAction(ActionEvent actionEvent) {


        LocalMeal D1 = new LocalMeal(
                txtName.getText(),
                Double.parseDouble(txtPrice.getText())
        );
        LocalMealDatabase.LocalMealTable.add(D1);
            loadAllLocalMeal();
    }

}


