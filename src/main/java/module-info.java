module com.mycompany.proyectoestructuras {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.proyectoestructuras to javafx.fxml;
    exports com.mycompany.proyectoestructuras;
}