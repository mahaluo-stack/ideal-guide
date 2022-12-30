package com.cito.kartoittaa;

// javaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

// local utilities
import utils.Console;

// views
import views.BannerView;
import views.GridView;

/**
 * JavaFX App
 */
public class App extends Application {

    private final Console console = new Console(this.getClass().getSimpleName());
    private Stage primaryStage;
    private Scene primaryScene;
    private BorderPane root;

    private BannerView bannerView;
    private GridView gridView;

    @Override
    public void start(Stage stage) {
        
        console.log("initUI();");
        initUI(stage);
    }

    public static void main(String[] args) {
        
        launch();
    }

    private void initUI(Stage primaryStage) {
        
        root = new BorderPane();
        root.setId("root");

        primaryScene = new Scene(root, 900, 600);
        primaryScene.getStylesheets().add("/styles/main.css");

        this.primaryStage = primaryStage;
        this.primaryStage.setMaximized(true);
        this.primaryStage.setScene(primaryScene);

        console.log("initViews();");
        initViews();

        console.log("setViews();");
        setViews();

        console.log("primaryStage.show();");
        this.primaryStage.show();
    }

    private void initViews() {

        bannerView = new BannerView();
        gridView = new GridView();
    }

    private void setViews() {

        root.setTop(bannerView.getBanner());
        root.setCenter(gridView.getGrid());
    }
}
