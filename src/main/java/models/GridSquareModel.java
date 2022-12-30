/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

// javafx
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

/**
 *
 * @author maxhaggkvist
 */
public class GridSquareModel {

    private Pane pane;
    private Double prefHeight = 10.0, prefWidth = 10.0;
    private Border border = new Border(new BorderStroke(Color.GRAY, BorderStrokeStyle.SOLID,
            CornerRadii.EMPTY, new BorderWidths(1)));
    private String backgroundStyle = "-fx-background-color: #FFF";
    private Integer positionX, positionY;

    public GridSquareModel() {
        pane = new Pane();
        pane.setPrefHeight(prefHeight);
        pane.setPrefWidth(prefWidth);
        pane.setBorder(border);
        pane.setStyle(backgroundStyle);
    }

    public void setMouseEntered() {
        pane.setStyle("-fx-background-color: #FFA500");
    }

    public void setMouseExited() {
        pane.setStyle("-fx-background-color: #FFF");
    }

    public Pane getPane() {
        return pane;
    }

    public void setPane(Pane pane) {
        this.pane = pane;
    }

    public Double getPrefHeight() {
        return prefHeight;
    }

    public void setPrefHeight(Double prefHeight) {
        this.prefHeight = prefHeight;
    }

    public Double getPrefWidth() {
        return prefWidth;
    }

    public void setPrefWidth(Double prefWidth) {
        this.prefWidth = prefWidth;
    }

    public Border getBorder() {
        return border;
    }

    public void setBorder(Border border) {
        this.border = border;
    }

    public String getBackgroundStyle() {
        return backgroundStyle;
    }

    public void setBackgroundStyle(String backgroundStyle) {
        this.backgroundStyle = backgroundStyle;
    }

    public Integer getPositionX() {
        return positionX;
    }

    public void setPositionX(Integer positionX) {
        this.positionX = positionX;
    }

    public Integer getPositionY() {
        return positionY;
    }

    public void setPositionY(Integer positionY) {
        this.positionY = positionY;
    }
}
