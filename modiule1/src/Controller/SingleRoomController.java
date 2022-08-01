package Controller;

import com.jfoenix.controls.JFXTextField;
import db.Database;
import db.DoubleRoomDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.DoubleRoom;
import model.Rooms;
import view.tm.DoubleRoomtm;
import view.tm.RoomsTm;

import java.util.Optional;

import static db.Database.*;

public class SingleRoomController {
    public TableView<RoomsTm> tblRoom;
    public TableColumn colNo;
    public TableColumn colPrice;
    public TableColumn colAvailable;
    public TableColumn colDelete;
    public JFXTextField txtNO;
    public JFXTextField txtOption;
    public JFXTextField txtPrice;

    public void initialize(){

        colNo.setCellValueFactory(new PropertyValueFactory("no"));
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));
       colAvailable.setCellValueFactory(new PropertyValueFactory("option"));
        colDelete.setCellValueFactory(new PropertyValueFactory("btn"));
        loadAllRooms();

        tblRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
                  setData(newValue);

        } );
    }

    private void setData(RoomsTm tm) {
       txtNO.setText(tm.getNo());
        txtOption.setText(tm.getOption());
        txtPrice.setText(String.valueOf(tm.getPrice()));
    }

    private void loadAllRooms() {
        ObservableList<RoomsTm> obList = FXCollections.observableArrayList();

        for (Rooms D: Roomtable
        ) {
            Button btn = new Button("Delete");

            RoomsTm tm = new RoomsTm(D.getNo(), D.getPrice(), D.getOption(),btn);

            obList.add(tm);

            btn.setOnAction((event -> {

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                        "Are You Sure?",
                        ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)) {


                    Roomtable.remove(D);
                    obList.remove(tm);
                }

            }));



        }
        tblRoom.setItems(obList);
    }

    public void btnSaveOnAction(ActionEvent actionEvent) {



         Rooms R1 = new Rooms(
                txtNO.getText(),
                Double.parseDouble(txtPrice.getText()),
                txtOption.getText()

        );
       Roomtable.add(R1);
        loadAllRooms();

    }

    public void onClickActionNew(ActionEvent actionEvent){


    }
}
