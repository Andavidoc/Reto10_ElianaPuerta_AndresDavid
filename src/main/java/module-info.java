module controlador {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens controlador to javafx.fxml;
    exports controlador;
}
