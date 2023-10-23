package com.example.module5_csc211;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.geometry.Insets;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.*;
import javafx.scene.effect.DropShadow;
import javafx.stage.*;
import javafx.geometry.*;
import javafx.scene.layout.VBox;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.QuadCurve;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Paint;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        example1(primaryStage);
        example2(primaryStage);
        example3(primaryStage);
        example4(primaryStage);
        example5(primaryStage);
        example6(primaryStage);
        example7(primaryStage);
        example8(primaryStage);
        example9(primaryStage);
        example10(primaryStage);
        example11(primaryStage);
        example12(primaryStage);
        example13(primaryStage);
        example14(primaryStage);
        example15(primaryStage);

    }

    public static void main(String[] args) {
        launch();
    }

    private void example1(Stage primaryStage) {
        Label label1 = new Label();
        Label label2 = new Label();
        label1.setText("Hello");
        label2.setText(" World");
        HBox root = new HBox();
        root.getChildren().add(label1);
        root.getChildren().add(label2);
        Scene scene = new Scene(root, 300, 50);
        primaryStage.setTitle("JavaFX Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void example2(Stage primaryStage) {
        final double WIDTH = 500.0;
        final double HEIGHT = 500.0;
        final double RADIUS = Math.min(WIDTH, HEIGHT) / 10;
        Pane pane = new Pane();
        pane.setOnMouseClicked(e -> {
            switch (e.getButton()) {
                case PRIMARY:
                    Circle circle = new Circle(e.getX(), e.getY(), RADIUS);
                    circle.setFill(Color.WHITE);
                    circle.setStroke(Color.BLACK);
                    circle.setOnMouseClicked(f -> {
                        pane.getChildren().remove(f.getSource());
                    });
                    pane.getChildren().add(circle);
                    break;
            }
        });
        Scene scene = new Scene(pane, WIDTH, HEIGHT);
        primaryStage.setTitle("java2s.com");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void example3(Stage primaryStage) {
        Line line = new Line(); //instantiating Line class
        line.setStartX(0); //setting starting X point of Line
        line.setStartY(0); //setting starting Y point of Line
        line.setEndX(100); //setting ending X point of Line
        line.setEndY(200); //setting ending Y point of Line
        Group root = new Group(); //Creating a Group
        root.getChildren().add(line); //adding the class object //to the group
        Scene scene = new Scene(root,300,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Line Example");
        primaryStage.show();
    }

    private void example4(Stage primaryStage) {
        Line line1 = new Line(20, 40, 270, 40);
        line1.getStrokeDashArray().addAll(25.0, 20.0, 5.0, 20.0);
        Line line2 = new Line(20, 60, 270, 60);
        line2.getStrokeDashArray().addAll(50.0, 40.0);
        Line line3 = new Line(20, 80, 270, 80);
        line3.getStrokeDashArray().addAll(25.0, 10.0);
        Line line4 = new Line(20, 100, 270, 100);
        line4.getStrokeDashArray().addAll(2.0);
        Line line5 = new Line(20, 120, 270, 120);
        line5.getStrokeDashArray().addAll(2.0, 21.0);
        AnchorPane root = new AnchorPane();
        root.setPadding(new Insets(5));
        final Scene scene = new Scene(root, 400, 250);
        root.getChildren().addAll(line1, line2, line3, line4, line5);
        primaryStage.setTitle("JavaFX Line (o7planning.org)");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void example5(Stage primaryStage) {
        //Creating a Polygon
        Polygon polygon = new Polygon();
//Adding coordinates to the polygon
        polygon.getPoints().addAll(new Double[]{
                300.0, 50.0,
                450.0, 150.0,
                300.0, 250.0,
                150.0, 150.0,
        });
//Creating a Group object
        Group root = new Group(polygon);
//Creating a scene object
        Scene scene = new Scene(root, 600, 300);
//Setting title to the Stage
        primaryStage.setTitle("Drawing a Polygon");
//Adding scene to the stage
        primaryStage.setScene(scene);
//Displaying the contents of the stage
        primaryStage.show();

    }

    private void example6(Stage primaryStage) {
        Group root = new Group();
        primaryStage.setTitle("Color Example");
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(200);
        rect.setHeight(250);
        rect.setEffect(new DropShadow());
        root.getChildren().add(rect);
        Scene scene = new Scene(root,300,400,Color.hsb(180, 1, 1));
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private void example7(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Color Example");
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(200);
        rect.setHeight(250);
        rect.setEffect(new DropShadow());
        rect.setFill(Color.web("#0000FF",1));
        root.getChildren().add(rect);
        Scene scene = new Scene(root,300,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void example8(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Color Example");
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(150);
        int red=20;
        int green=125;
        int blue=10;
        rect.setFill(Color.rgb(red, green, blue,0.63));
        root.getChildren().add(rect);
        Scene scene = new Scene(root,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private void example9(Stage primaryStage){
        VBox root = new VBox();
        final Scene scene = new Scene(root,300, 250);
        Stop[] stops = new Stop[] { new Stop(0, Color.GREEN), new Stop(1,
                Color.BLUE)};
        LinearGradient linear = new LinearGradient(0, 0, 1, 0, true,
                CycleMethod.NO_CYCLE, stops);
        Rectangle rect = new Rectangle(0, 0, 100, 100);
        rect.setFill(linear);
        root.getChildren().add(rect);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Animation Example");
        primaryStage.show();
    }
    private void example10(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Color Example");
        Rectangle rect = new Rectangle();
        rect.setX(50);
        rect.setY(20);
        rect.setWidth(100);
        rect.setHeight(150);
        rect.setFill(Color.RED); //passing color name
        rect.setEffect(new DropShadow());
        root.getChildren().add(rect);
        Scene scene = new Scene(root,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void example11(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Cubic Curve Example");
        CubicCurve c = new CubicCurve();
        c.setStartX(20);
        c.setStartY(100);
        c.setControlX1(300);
        c.setControlX2(200);
        c.setControlY1(100);
        c.setControlY2(90);
        c.setFill(Color.RED);
        c.setEffect(new DropShadow());
        c.setEndX(100);
        c.setEndY(300);
        root.getChildren().add(c);
        Scene scene = new Scene(root,300,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void example12(Stage primaryStage){
        Circle circle = new Circle(40);
        circle.setFill(Color.RED);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2.0);
        Rectangle rect = new Rectangle(120, 75);
        rect.setFill(Color.RED);
// Create a line
        Line line = new Line(0, 0, 150, 50);
        line.setStrokeWidth(5.0);
        line.setStroke(Color.GREEN);
// Create a parallelogram
        Polygon parallelogram = new Polygon();
        parallelogram.getPoints().addAll(30.0, 0.0,
                130.0, 0.0,
                120.00, 50.0,
                0.0, 50.0);
        parallelogram.setFill(Color.AZURE);
        parallelogram.setStroke(Color.BLACK);
// Create a hexagon
        Polyline hexagon = new Polyline(100.0, 0.0,
                120.0, 20.0,
                110.0, 140.0,
                100.0, 60.0,
                80.0, 40.0,
                80.0, 120.0,
                100.0, 0.0);
        hexagon.setFill(Color.WHITE);
        hexagon.setStroke(Color.BLACK);
// A CHORD arc with no fill and a stroke
        Arc arc = new Arc(0, 0, 50, 100, 0, 90);
        arc.setFill(Color.TRANSPARENT);
        arc.setStroke(Color.BLACK);
        arc.setType(ArcType.CHORD);
// Add all shapes to an HBox
        HBox root =
                new HBox(circle, rect, line, parallelogram, hexagon, arc);
        root.setSpacing(10);
        root.setStyle("-fx-padding: 10;" +
                "-fx-border-style: solid inside;" +
                "-fx-border-width: 2;" +
                "-fx-border-insets: 5;" +
                "-fx-border-radius: 5;" +
                "-fx-border-color: blue;");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("2D Shapes");
        primaryStage.show();
    }
    private void example13(Stage primaryStage){
        //Creating a Polygon
        Polygon polygon = new Polygon();
//Adding coordinates to the polygon
        polygon.getPoints().addAll(new Double[]{
                490.0,50.0,
                750.0, 50.0,
                890.0, 277.0,
                754.0, 500.0,
                490.0, 500.0,
                370.0, 277.0,
        });
//Creating a Group object
        Group root = new Group(polygon);
//Creating a scene object
        Scene scene = new Scene(root, 1208, 581);
//Setting title to the Stage
        primaryStage.setTitle("Drawing a Polygon");
//Adding scene to the stage
        primaryStage.setScene(scene);
//Displaying the contents of the stage
        primaryStage.show();
    }
    private void example14(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("QuadCurve Example");
        QuadCurve c = new QuadCurve();
        c.setStartX(70);
        c.setStartY(30);
        c.setControlX(250);
        c.setControlY(50);
        c.setFill(Color.RED);
        c.setEffect(new DropShadow());
        c.setEndX(250);
        c.setEndY(300);
        root.getChildren().add(c);
        Scene scene = new Scene(root,300,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private void example15(Stage primaryStage){
        int height = 600;
        int width = 800;
        AnchorPane tileMap = new AnchorPane();
        Scene content = new Scene(tileMap, width, height);
        primaryStage.setScene(content);
        double size = 50,v=Math.sqrt(3)/2.0;
        for(double y=0;y<height;y+=size*Math.sqrt(3))
        {
            for(double x=-25,dy=y;x<width;x+=(3.0/2.0)*size)
            {
                Polygon tile = new Polygon();
                tile.getPoints().addAll(new Double[]{
                        x,dy,
                        x+size,dy,
                        x+size*(3.0/2.0),dy+size*v,
                        x+size,dy+size*Math.sqrt(3),
                        x,dy+size*Math.sqrt(3),
                        x-(size/2.0),dy+size*v
                });
                tile.setFill(Paint.valueOf("#ffffff"));
                tile.setStrokeWidth(2);
                tile.setStroke(Paint.valueOf("#000000") );
                tileMap.getChildren().add(tile);
                dy = dy==y ? dy+size*v : y;
            }
        }
        primaryStage.show();
    }

}




