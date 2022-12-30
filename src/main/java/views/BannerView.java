/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

// javafx
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

// controllers
import controllers.BannerController;

/**
 *
 * @author maxhaggkvist
 */
public class BannerView {

    private final BannerController bannerController = new BannerController();
    private final Label label;
    private final VBox banner;

    public BannerView() {
        banner = bannerController.getBanner();
        label = bannerController.getLabel();
        label.setFont(bannerController.getFont());
        label.setText(bannerController.getText());
        label.setTextFill(bannerController.getTextColor());
        banner.setAlignment(bannerController.getAlignment());
        banner.getChildren().add(label);
    }

    public VBox getBanner() {
        return banner;
    }
}
