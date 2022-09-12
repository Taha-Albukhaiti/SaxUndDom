module com.example.saxunddom {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.xml;


    opens com.example.saxunddom to javafx.fxml;
    exports com.example.saxunddom;
}