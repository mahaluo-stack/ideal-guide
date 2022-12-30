/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

// javafx
import javafx.geometry.Pos;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;

// models
import models.GridModel;

/**
 *
 * @author maxhaggkvist
 */
public class GridController {

    private final GridModel gridModel = new GridModel();
    private GridSquareController gridSquareController;
    private GridPane grid;

    public GridController() {
    }

    public GridPane getNewGrid() {
        grid = gridModel.getGridPane();
        for (int x = 0; x < 100; x++) {
            for (int y = 0; y < 80; y++) {
                gridSquareController = new GridSquareController(x, y);
                grid.add(gridSquareController.getGridSquare(), x, y);
            }
        }
        return grid;
    }

    public Double getVgap() {
        return gridModel.getvGap();
    }

    public Double getHgap() {
        return gridModel.getHGap();
    }

    public Pos getAlignment() {
        return gridModel.getAlignment();
    }

    public Boolean getGridLinesVisible() {
        return gridModel.getGridLinesVisible();
    }

    public Border getBorder() {
        return gridModel.getBorder();
    }

    public GridPane getGrid() {
        return gridModel.getGridPane();
    }
}
