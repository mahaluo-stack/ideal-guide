/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

// javafx
import javafx.geometry.Pos;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;

/**
 *
 * @author maxhaggkvist
 */
public class GridModel {

    private GridPane gridPane;
    private Double vGap = 0.0, HGap = 0.0;
    private Pos alignment = Pos.CENTER;
    private Boolean gridLinesVisible = true;
    private Border border = new Border(new BorderStroke(Color.WHITE, BorderStrokeStyle.SOLID,
            CornerRadii.EMPTY, new BorderWidths(1)));

    public GridModel() {
        gridPane = new GridPane();
        gridPane.setVgap(vGap);
        gridPane.setHgap(HGap);
        gridPane.setAlignment(alignment);
        gridPane.setGridLinesVisible(gridLinesVisible);
        gridPane.setBorder(border);
    }

    public GridPane getGridPane() {
        return gridPane;
    }

    public void setGridPane(GridPane gridPane) {
        this.gridPane = gridPane;
    }

    public Double getvGap() {
        return vGap;
    }

    public void setvGap(Double vGap) {
        this.vGap = vGap;
    }

    public Double getHGap() {
        return HGap;
    }

    public void setHGap(Double HGap) {
        this.HGap = HGap;
    }

    public Pos getAlignment() {
        return alignment;
    }

    public void setAlignment(Pos alignment) {
        this.alignment = alignment;
    }

    public Boolean getGridLinesVisible() {
        return gridLinesVisible;
    }

    public void setVisibleGridLines(Boolean gridLinesVisible) {
        this.gridLinesVisible = gridLinesVisible;
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }
}
