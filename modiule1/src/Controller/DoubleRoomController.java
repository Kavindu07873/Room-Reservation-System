package Controller;


import com.jfoenix.controls.JFXTextField;
import db.DoubleRoomDatabase;
import db.QuadroomDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.DoubleRoom;
import model.Quadroom;
import model.Rooms;
import view.tm.DoubleRoomtm;

import java.util.Optional;

import static db.Database.Roomtable;

public class DoubleRoomController {
    public JFXTextField txtNO;
    public JFXTextField txtPrice;
    public JFXTextField txtOption;
    public TableColumn colNo;
    public TableColumn colPrice;
    public TableColumn colAvailable;
    public TableColumn colDelete;
    public TableView<DoubleRoomtm> tblDoubleRoom;


    public void initialize(){

        colNo.setCellValueFactory(new PropertyValueFactory("no"));
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));
        colAvailable.setCellValueFactory(new PropertyValueFactory("option"));
        colDelete.setCellValueFactory(new PropertyValueFactory("btn"));




        loadAllDoubleRoom();

        tblDoubleRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            setData(newValue);
        } );
    }

    private void loadAllDoubleRoom() {


        ObservableList<DoubleRoomtm> obList = FXCollections.observableArrayList();



        for (DoubleRoom D: DoubleRoomDatabase.DoubleTable
             ) {
            Button btn = new Button("Delete");

            DoubleRoomtm tm = new DoubleRoomtm(D.getNo(), D.getPrice(), D.getOption(),btn);

            obList.add(tm);

            btn.setOnAction((event -> {

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                        "Are You Sure?",
                        ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)) {


                    DoubleRoomDatabase.DoubleTable.remove(D);
                obList.remove(tm);
                }

            }));



        }
         tblDoubleRoom.setItems(obList);

    }

    private void setData(DoubleRoomtm tm) {

        txtOption.setText(tm.getOption());
        txtPrice.setText(String.valueOf(tm.getPrice()));
        txtNO.setText(tm.getNo());

    }


    public void btnSaveOnAction(ActionEvent actionEvent) {
        DoubleRoom D1 = new DoubleRoom(
               txtNO.getText(),
                Double.parseDouble(txtPrice.getText()),
                txtOption.getText()
        );
        DoubleRoomDatabase.DoubleTable.add(D1);
        loadAllDoubleRoom();
    }

}
