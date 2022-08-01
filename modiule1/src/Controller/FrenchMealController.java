package Controller;

import com.jfoenix.controls.JFXTextField;
import db.DoubleRoomDatabase;
import db.FrenchMealDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.DoubleRoom;
import model.FrenchMeal;
import view.tm.DoubleRoomtm;
import view.tm.FrenchMealTM;

import java.util.Observable;
import java.util.Optional;

public class FrenchMealController {
    public TableView<FrenchMealTM> tableFrenchMeal;
    public JFXTextField txtName;
    public JFXTextField txtPrice;
    public TableColumn colName;
    public TableColumn colPrice;
    public TableColumn colDelete;

    public void initializer(){

        colName.setCellValueFactory(new PropertyValueFactory("Name"));
      colPrice.setCellValueFactory(new PropertyValueFactory("Price"));
        colDelete.setCellValueFactory(new PropertyValueFactory("btn"));
        loadAllFrenchMeal();

        tableFrenchMeal.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            setData(newValue);
        } );
    }

    private void setData(FrenchMealTM tm ) {

       txtName.setText(tm.getName());
        txtPrice.setText(String.valueOf(tm.getPrice()));

    }

    private void loadAllFrenchMeal() {

        ObservableList<FrenchMealTM> obList = FXCollections.observableArrayList();


        for (FrenchMeal D: FrenchMealDatabase.FrenchMealTable
        ) {
            Button btn = new Button("Delete");

            FrenchMealTM tm = new FrenchMealTM(D.getName(), D.getPrice(),btn);

            obList.add(tm);

            btn.setOnAction((event -> {

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                        "Are You Sure?",
                        ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)) {


                   FrenchMealDatabase.FrenchMealTable.remove(D);
                    obList.remove(tm);
                }

            }));



        }
        tableFrenchMeal.setItems(obList);


    }

    public void OnClickActionSave(ActionEvent actionEvent) {

        FrenchMeal D1 = new FrenchMeal(
                txtName.getText(),
                Double.parseDouble(txtPrice.getText())

                        );
        FrenchMealDatabase.FrenchMealTable.add(D1);
        loadAllFrenchMeal();

    }

}
