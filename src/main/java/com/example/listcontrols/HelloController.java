package com.example.listcontrols;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

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

    ObservableList<Crocodile> list2 = FXCollections.observableArrayList();
    @FXML
    ChoiceBox<Crocodile> choice2;
    @FXML
    private Button addCroc;
    @FXML
    private Button delCroc;
    @FXML
    private Slider lenCroc;
    @FXML
    private TextField textCrocName;

    @FXML
    ListView<String> listView1;
    @FXML
    ListView<Crocodile> listView2;

    public void initialize(){
        initChoice1();
        addN.setOnAction(actionEvent -> list1.addFirst(textN.getText()));
        delN.setOnAction(actionEvent -> {
            list1.remove(choice1.getValue());
            //choice1.getSelectionModel().clearSelection();
            choice1.setValue("");
        });
        initChoice2();

        addCroc.setOnAction(actionEvent -> {
            Crocodile cro = new Crocodile(textCrocName.getText(), lenCroc.getValue());
            list2.add(cro);
        });
        delCroc.setOnAction(actionEvent -> {
            list2.remove(choice2.getValue());
            choice2.setValue(null);
        });

        initListView1();
        listView2.setItems(list2);
    }

    private void initListView1() {
        listView1.setItems(list1);

    }

    void initChoice1(){
       list1 = FXCollections.observableArrayList(); //Использование стандартного способа создания коллекции
       list1.addAll("Катя", "Федя", "Даша");
       choice1.setItems(list1);                     //связываем контрол со списком
    }

    void initChoice2(){
        choice2.setItems(list2);                     //связываем контрол со списком
    }
}