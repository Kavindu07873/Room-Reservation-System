package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class WindowOneController {
    public AnchorPane WindowOne1;

    public void OnClickActionAdmin(ActionEvent actionEvent) throws IOException {

       // WindowOne1.getChildren().clear();

        URL resource = getClass().getResource("../view/WindowTwo.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();

    }

    public void OnClickActionReceptinist(ActionEvent actionEvent) throws IOException {

       // WindowOne1.getChildren().clear();


        URL resource = getClass().getResource("../view/WindowTwoREceptionist.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene = new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();


    }
}
