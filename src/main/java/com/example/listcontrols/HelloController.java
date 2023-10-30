package com.example.listcontrols;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    ObservableList<String> list1;

    @FXML
    ChoiceBox<String> choice1;
    @FXML
    Button delN;
    @FXML
    Button addN;
    @FXML
    TextField textN;

    public void initialize(){
        initChoice1();
        addN.setOnAction(actionEvent -> list1.addFirst(textN.getText()));
        delN.setOnAction(actionEvent -> {
            list1.remove(choice1.getValue());
            //choice1.getSelectionModel().clearSelection();
            choice1.setValue("");
        });
    }

    void initChoice1(){
       list1 = FXCollections.observableArrayList(); //Использование стандартного способа создания коллекции
       list1.addAll("Катя", "Федя", "Даша");
       choice1.setItems(list1);                     //связываем контрол со списком
    }
}