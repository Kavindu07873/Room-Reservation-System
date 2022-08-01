package Controller;

import com.jfoenix.controls.JFXTextField;
import db.TripleRoomDatabase;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import model.TripleRoom;
import view.tm.TripleRoomTm;

import java.util.Optional;

public class TripleRoomController {
    public TableView<TripleRoomTm> tblTRipleRoom;

    public JFXTextField txtNO;
    public JFXTextField txtPrice;
    public JFXTextField txtOption;
    public TableColumn colNo;
    public TableColumn colPrice;
    public TableColumn colAvailable;
    public TableColumn colDelete;

    public  void initialize() {

        colNo.setCellValueFactory(new PropertyValueFactory("no"));
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));
        colAvailable.setCellValueFactory(new PropertyValueFactory("option"));
        colDelete.setCellValueFactory(new PropertyValueFactory("btn"));


        loadAllTripleRoom();

        tblTRipleRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            setData(newValue);

        } );

    }


    private void loadAllTripleRoom() {

        ObservableList<TripleRoomTm> obList = FXCollections.observableArrayList();

        for (TripleRoom T : TripleRoomDatabase.TripleTable
        ) {
            Button btn = new Button("Delete");

            TripleRoomTm tm = new TripleRoomTm(T.getNo(), T.getPrice(), T.getOption(), btn);

            obList.add(tm);

            btn.setOnAction((event -> {

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                        "Are You Sure?",
                        ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)) {

                    TripleRoomDatabase.TripleTable.remove( T );
                    obList.remove(tm);
                }
            }));
        }
        tblTRipleRoom.setItems(obList);
    }

    private void setData(TripleRoomTm tm) {

        txtNO.setText(tm.getNo());
        txtOption.setText(tm.getOption());
        txtPrice.setText(String.valueOf(tm.getPrice()));
    }


    public void btnSaveOnAction (ActionEvent actionEvent){

        TripleRoom T1 = new TripleRoom(
                    txtNO.getText(),
                    Double.parseDouble(txtPrice.getText()),
                    txtOption.getText()
                    );
          TripleRoomDatabase.TripleTable.add(T1);
                 loadAllTripleRoom();
        }

    public void onClickActionNew(ActionEvent actionEvent) {
    }
}
