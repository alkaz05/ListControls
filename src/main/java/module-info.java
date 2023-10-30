module com.example.listcontrols {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listcontrols to javafx.fxml;
    exports com.example.listcontrols;
}