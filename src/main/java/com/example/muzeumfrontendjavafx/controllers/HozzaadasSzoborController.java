package com.example.muzeumfrontendjavafx.controllers;

import com.example.muzeumfrontendjavafx.Controller;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;

public class HozzaadasSzoborController extends Controller {
    @FXML
    private TextField inputSzemely;
    @FXML
    private Spinner<Integer> inputAr, inputMagassag;

    @FXML
    public void buttonHozzaad(ActionEvent actionEvent) {

    }
}
