module dk.easv.demo54321 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens dk.easv.demo54321 to javafx.fxml;
    exports dk.easv.demo54321;
}