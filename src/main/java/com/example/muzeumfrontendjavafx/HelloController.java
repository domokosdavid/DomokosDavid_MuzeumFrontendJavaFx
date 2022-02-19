package com.example.muzeumfrontendjavafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class HelloController {
    @FXML
    private TableView szobrokTV;
    @FXML
    private TableView festmenyTV;
    @FXML
    private TableColumn colSzoborSzemely, colSzoborMagassag, colSzoborAr, colFestmenyCim, colFestmenyEv, colFestmenyKiallit;

    public void onSzoborHozzaadButtonClick(ActionEvent actionEvent) {
    }

    public void onSzoborTorlesButtonClick(ActionEvent actionEvent) {
    }

    public void onSzoborModositasButtonClick(ActionEvent actionEvent) {
    }

    public void onFestmenyHozzaadButtonClick(ActionEvent actionEvent) {
    }

    public void onFestmenyTorlesButtonClick(ActionEvent actionEvent) {
    }

    public void onFestmenyModositasButtonClick(ActionEvent actionEvent) {
    }
}