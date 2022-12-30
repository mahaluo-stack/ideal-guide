/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

// javafx
import controllers.GridController;
import javafx.scene.layout.GridPane;

/**
 *
 * @author maxhaggkvist
 */
public class GridView {

    private final GridController gridController = new GridController();
    private final GridPane grid = gridController.getNewGrid();
    
    public GridView() {
    }

    public GridPane getGrid() {
        return grid;
    }
}
