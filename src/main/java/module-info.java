module com.example.lab92 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab92 to javafx.fxml;
    exports com.example.lab92;
}