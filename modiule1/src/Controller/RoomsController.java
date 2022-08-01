package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class RoomsController {
    public AnchorPane Context2;

    public void OnActionTriple(ActionEvent actionEvent) throws IOException {

        Context2.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/TripleRoom.fxml"));
        Context2.getChildren().add(parent);
    }

    public void OnActionDouble(ActionEvent actionEvent) throws IOException {
        Context2.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/DoubleRoom.fxml"));
        Context2.getChildren().add(parent);
    }

    public void onClickActionSingle(ActionEvent actionEvent) throws IOException {

        Context2.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/SingleRoom.fxml"));
        Context2.getChildren().add(parent);
    }

    public void OnActionQuad(ActionEvent actionEvent) throws IOException {

        Context2.getChildren().clear();
        Parent parent= FXMLLoader.load(getClass().getResource("../view/QuadRoom.fxml"));
        Context2.getChildren().add(parent);
    }
}
