package com.example.muzeumfrontendjavafx.controllers;

import com.example.muzeumfrontendjavafx.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.List;

public class HelloController extends Controller {
    @FXML
    private TableView szobrokTV;
    @FXML
    private TableView festmenyTV;
    @FXML
    private TableColumn colSzoborSzemely, colSzoborMagassag, colSzoborAr, colFestmenyCim, colFestmenyEv, colFestmenyKiallit;

    public void initialize() {
        colSzoborSzemely.setCellValueFactory(new PropertyValueFactory<>("person"));
        colSzoborMagassag.setCellValueFactory(new PropertyValueFactory<>("height"));
        colSzoborAr.setCellValueFactory(new PropertyValueFactory<>("price"));
        colFestmenyCim.setCellValueFactory(new PropertyValueFactory<>("title"));
        colFestmenyEv.setCellValueFactory(new PropertyValueFactory<>("year"));
        colFestmenyKiallit.setCellValueFactory(new PropertyValueFactory<>("on_display"));
        szoborListaFeltolt();
        festmenyListaFeltolt();
    }

    public void onSzoborHozzaadButtonClick(ActionEvent actionEvent) {
        try {
            Controller hozzadas = ujAblak("hozzaadasSzobor-view.fxml", "Szobor hozzáadása",
                    320, 400);
            hozzadas.getStage().setOnCloseRequest(event -> szoborListaFeltolt());
            hozzadas.getStage().show();
        } catch (Exception e) {
            hibaKiir(e);
        }
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

    private void szoborListaFeltolt(){
        try {
            List<Szobor> szoborList = SzoborApi.getSzobrok();
            szobrokTV.getItems().clear();
            for (Szobor szobor : szoborList) {
                szobrokTV.getItems().add(szobor);
            }
        } catch (IOException e) {
            hibaKiir(e);
        }
    }
    private void festmenyListaFeltolt(){
        try {
            List<Festmeny> festmenyList = FestmenyApi.getFestmenyek();
            festmenyTV.getItems().clear();
            for (Festmeny festmeny : festmenyList) {
                festmenyTV.getItems().add(festmeny);
            }
        } catch (IOException e) {
            hibaKiir(e);
        }
    }
}