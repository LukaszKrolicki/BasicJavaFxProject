module com.jmc.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jmc.firstapp to javafx.fxml;
    exports com.jmc.firstapp;
}