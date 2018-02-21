package com.pixelduke.control;

import com.pixelduke.control.ribbon.RibbonGroup;
import com.pixelduke.control.ribbon.RibbonTab;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Created by pedro_000 on 1/21/14.
 */
public class RibbonWithGroupTest extends Application {

    @Override
    public void start(Stage primaryStage) {
        BorderPane rootNode = new BorderPane();
        Ribbon ribbon = new Ribbon();
        RibbonTab ribbonTab = new RibbonTab("Test");
        RibbonGroup ribbonGroup = new RibbonGroup();
        rootNode.setCenter(ribbon);

//        Image storeImage = new Image(RibbonWithGroupTest.class.getResourceAsStream("store.png"));
        Button storeButton = new Button("Store");
        storeButton.setContentDisplay(ContentDisplay.TOP);
        ribbonGroup.getNodes().add(storeButton);

        ribbonTab.getRibbonGroups().add(ribbonGroup);
        ribbon.getTabs().add(ribbonTab);

        Scene scene = new Scene(rootNode);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
