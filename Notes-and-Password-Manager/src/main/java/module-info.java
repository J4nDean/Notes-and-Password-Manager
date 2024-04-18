module com.pratice.app.ws.notesandpasswordmanager {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.pratice.app.ws.notesandpasswordmanager to javafx.fxml;
    exports com.pratice.app.ws.notesandpasswordmanager;
}