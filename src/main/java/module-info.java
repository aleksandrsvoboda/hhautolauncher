module core.hhrunner {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens core.hhrunner to javafx.fxml;
    exports core.hhrunner;
}