module dashboard
{
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.media;
    requires java.desktop;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.web;

    requires org.kordamp.ikonli.materialdesign;
    requires com.dlsc.workbenchfx.core;
    requires com.gluonhq.attach.display;
    requires com.gluonhq.charm.glisten;
    requires org.kordamp.ikonli.javafx;
    requires com.gluonhq.attach.util;
    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.core;
    requires jdk.jsobject;
    requires MaterialFX;
    requires animatefx;
    requires java.sql;

    opens dashboard to javafx.fxml;
    exports dashboard;

    opens data_base to java.sql;
    exports data_base;
    
    opens controllers to 
    javafx.fxml, javafx.base, javafx.controls, 
    javafx.media, javafx.web, javafx.graphics;
    
    exports controllers; 
}