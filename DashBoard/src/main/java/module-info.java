module dashboard
{
    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.media;
    requires javafx.base;
    requires javafx.fxml;

    requires org.kordamp.ikonli.materialdesign;
    requires org.kordamp.bootstrapfx.core;
    requires com.dlsc.workbenchfx.core;
    requires com.gluonhq.attach.display;
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
    
    com.dlsc.workbenchfx.core,
    com.gluonhq.attach.display,
    com.gluonhq.charm.glisten,
    com.gluonhq.attach.util,
    mfx.effects,
    MaterialFX,
    animatefx,
    mfx.core,
    javafx.controls, 
    javafx.graphics,
    javafx.media,
    javafx.fxml, 
    javafx.base;

    exports controllers;
}