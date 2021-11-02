package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.scene.Parent;
import javafx.stage.Stage;
import java.io.IOException;
import java.util.ResourceBundle;

public class ListController implements Initializable {

    public void addListClick(){
        //take string from title text field
        //add new to do list
    }
    public void createList(){
        //switch scenes to addlistscene
        //title typed in
        //call addListClick
    }

    public void deleteList(){
        //delete to do list
    }

    public void editToDoList(){
        //edits the selected to do list
        //changes scenes to list
    }

    public void saveList(){
        /*saves a list to external storage
        opens external
        make save folder
        copy list
        save to file location
        close*/
    }

    public void saveAll(){
        //same as savelist but make a loop
    }
    /*
    switch scenes when adding to do lists

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMainScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("ListScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAddScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    */
}
