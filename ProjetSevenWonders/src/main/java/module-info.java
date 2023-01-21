module com.example.projetsevenwonders {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com to javafx.fxml;
    exports com;
    exports com.example.controller;
    opens com.example.controller to javafx.fxml;
    exports com.models;
    opens com.models to javafx.fxml;
}