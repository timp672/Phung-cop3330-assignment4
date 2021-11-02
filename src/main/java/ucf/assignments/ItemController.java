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

public class ItemController implements Initializable {

    //initialize arraylist of to do objects
    @FXML

    //private label to change depending on type of list displayed



    public void addNewToDo(){
        //add new to do item to list object
        //open addtodoscene
        //display created to do
    }

    public void removeToDo(){
        //call removeToDo to delete to do from table
    }

    public String editDescription(){
        //edit the description of a task
        //return the new description
        return "";
    }

    public boolean toDoCompleted(){
        //mark a task as completed
        //return true if the task has been deleted
        return true;
    }

    public void showCompletedTasks(){
        //displays all completed tasks in the list
    }

    public void showUncompletedTasks(){
        //displays all uncompleted tasks in the list
    }


    /*
    switch scenes when adding to do items

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMainScene(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("MainScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToAddScene(ActionEvent event) throws IOException{
        root = FXMLLoader.load(getClass().getResource("AddToDoScene.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    */

}
