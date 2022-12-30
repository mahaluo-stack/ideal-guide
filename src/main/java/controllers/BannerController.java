/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

// javafx
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

// models
import models.BannerModel;

/**
 *
 * @author maxhaggkvist
 */
public class BannerController {
    
    private final BannerModel bannerModel = new BannerModel();
    
    public BannerController() {
    }
    
    public VBox getBanner() {
        return bannerModel.getBanner();
    }
    
    public Label getLabel() {
        return bannerModel.getLabel();
    }
    
    public Font getFont() {
        return bannerModel.getFont();
    }
    
    public String getText() {
        return bannerModel.getText();
    }
    
    public Color getTextColor() {
        return bannerModel.getTextColor();
    }
    
    public Pos getAlignment() {
        return bannerModel.getAlignment();
    }
}
