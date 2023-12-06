module com.example.medical_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.medical_system to javafx.fxml;
    exports com.example.medical_system;
}