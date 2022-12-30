/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

// javafx
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

// models
import models.GridSquareModel;

/**
 *
 * @author maxhaggkvist
 */
public class GridSquareController {

    private final GridSquareModel gridSquareModel = new GridSquareModel();
    private final Pane gridSquare = gridSquareModel.getPane();

    public GridSquareController() {
    }

    public GridSquareController(Integer positionX, Integer positionY) {

        gridSquareModel.setPositionX(positionX);
        gridSquareModel.setPositionY(positionY);
        
        gridSquare.setOnMouseEntered((MouseEvent t) -> {
            gridSquareModel.setMouseEntered();
        });
                
        gridSquare.setOnMouseExited((MouseEvent t) -> {
            gridSquareModel.setMouseExited();
        });
    }

    public Pane getGridSquare() {
        return gridSquare;
    }
}
