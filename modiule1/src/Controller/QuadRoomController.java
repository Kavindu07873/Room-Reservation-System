package Controller;

import com.jfoenix.controls.JFXTextField;
import db.QuadroomDatabase;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.Quadroom;
import model.TripleRoom;
import view.tm.QuadRoomTM;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;

public class QuadRoomController {
    public JFXTextField txtNO;
    public JFXTextField txtPrice;
    public JFXTextField txtOption;
    public TableView<QuadRoomTM> tblDoubleRoom;
    public TableColumn colNo;
    public TableColumn colPrice;
    public TableColumn colAvailable;
    public TableColumn colDelete;

    public void initialize(){

        colNo.setCellValueFactory(new PropertyValueFactory("no"));
        colPrice.setCellValueFactory(new PropertyValueFactory("price"));
        colAvailable.setCellValueFactory(new PropertyValueFactory("option"));
        colDelete.setCellValueFactory(new PropertyValueFactory("btn"));


        loadAllQuadRoom();


        tblDoubleRoom.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            setData(newValue);


        });
    }

    private void loadAllQuadRoom() {



        ObservableList<QuadRoomTM> obList = FXCollections.observableArrayList();



        for (Quadroom Q: QuadroomDatabase.QuadRoomTable
        ) {
            Button btn = new Button("Delete");

            QuadRoomTM tm = new QuadRoomTM(Q.getNo(), Q.getPrice(), Q.getOption(),btn);
            obList.add(tm);

            btn.setOnAction((event -> {

                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                        "Are You Sure?",
                        ButtonType.YES, ButtonType.NO);
                Optional<ButtonType> buttonType = alert.showAndWait();
                if (buttonType.get().equals(ButtonType.YES)) {


                    QuadroomDatabase.QuadRoomTable.remove(Q);
                    obList.remove(tm);
                }

            }));



        }
        tblDoubleRoom.setItems(obList);


    }


    public void onClickSave(ActionEvent actionEvent) throws IOException {

        URL resource = getClass().getResource("../view/.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void btnSaveOnAction(ActionEvent actionEvent) {

        Quadroom D1 = new Quadroom(
                txtNO.getText(),
                Double.parseDouble(txtPrice.getText()),
                txtOption.getText()
        );
        QuadroomDatabase.QuadRoomTable.add(D1);

        loadAllQuadRoom();

    }


    private void setData(QuadRoomTM newValue) {

        TripleRoom tm = null;
        txtOption.setText(tm.getOption());
        txtPrice.setText(String.valueOf(tm.getPrice()));
        txtNO.setText(tm.getNo());

    }

    private void changed(ObservableValue<? extends QuadRoomTM> observable, QuadRoomTM oldValue, QuadRoomTM newValue) {
        setData(newValue);

    }
}


