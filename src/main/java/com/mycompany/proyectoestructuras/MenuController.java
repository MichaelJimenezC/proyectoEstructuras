/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.proyectoestructuras;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.layout.*;

/**
 * FXML Controller class
 *
 * @author Michael
 */
public class MenuController implements Initializable {

    @FXML
    private AnchorPane root;
    @FXML
    private TextField txtNombre;
    @FXML
    private ScrollPane direcciones;
    @FXML
    private ScrollPane emails;
    @FXML
    private ScrollPane redes;
    @FXML
    private ScrollPane fotos;
    @FXML
    private ScrollPane fechas;
    @FXML
    private ScrollPane telefonos;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

}
