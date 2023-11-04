module com.mycompany.proyecto_estructuras {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.proyecto_estructuras to javafx.fxml;
    exports com.mycompany.proyecto_estructuras;
}
