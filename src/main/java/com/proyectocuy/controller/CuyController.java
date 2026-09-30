package com.proyectocuy.controller;

import com.proyectocuy.dao.CuyDAO;
import com.proyectocuy.model.Cuy;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class CuyController {

    @FXML private TableView<Cuy> tableCuyes;
    @FXML private TableColumn<Cuy, Integer> colId;
    @FXML private TableColumn<Cuy, String> colRaza;
    @FXML private TableColumn<Cuy, String> colSexo;
    @FXML private TableColumn<Cuy, Double> colPeso;
    @FXML private TableColumn<Cuy, String> colEstado;

    private final CuyDAO cuyDAO = new CuyDAO();

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("idCuy"));
        colRaza.setCellValueFactory(new PropertyValueFactory<>("raza"));
        colSexo.setCellValueFactory(new PropertyValueFactory<>("sexo"));
        colPeso.setCellValueFactory(new PropertyValueFactory<>("pesoKg"));
        colEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));

        cargarDatos();
    }

    private void cargarDatos() {
        ObservableList<Cuy> lista = FXCollections.observableArrayList(cuyDAO.listar());
        tableCuyes.setItems(lista);
    }
}