package com.exjavafxvi.javafxjml;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;

public class LayoutController {

    @FXML
    private Button btnCancel;

    @FXML
    private Button btnSave;

    @FXML
    private MenuItem menuItemSair;

    public void initialize(){}

    @FXML
    void btnCancelOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        Platform.exit();
    }
    @FXML
    void menuItemOnAction(ActionEvent event) {
        Platform.exit();
    }
}
