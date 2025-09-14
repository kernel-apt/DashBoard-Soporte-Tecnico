module dashboard
{
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.media;
    requires javafx.base;
    requires javafx.fxml;

    requires org.kordamp.ikonli.materialdesign;
    requires com.dlsc.workbenchfx.core;
    requires com.gluonhq.charm.glisten;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.core;
    requires org.controlsfx.controls;
    requires com.gluonhq.attach.util;
    requires VirtualizedFX;
    requires mfx.effects;
    requires MaterialFX;
    requires animatefx;
    requires mfx.core;
    requires java.sql;

    opens dashboard to javafx.fxml;
    exports dashboard;

    opens controllers to 
    
    javafx.controls, 
    javafx.graphics,
    javafx.media,
    javafx.fxml, 
    javafx.base;

    exports controllers;
}