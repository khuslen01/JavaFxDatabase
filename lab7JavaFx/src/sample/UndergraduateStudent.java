package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class UndergraduateStudent {
    public Button close;

    public void buttonClose(ActionEvent actionEvent)throws Exception{
        Parent newStore = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene tableViewScene = new Scene(newStore);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setTitle("Sub Music Store - Item Sub-Category");
        window.setScene(tableViewScene);
        window.show();
    }

}
