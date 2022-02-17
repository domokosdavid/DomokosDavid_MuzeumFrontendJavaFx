package com.example.muzeumfrontendjavafx;

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
}