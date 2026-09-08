package vallegrande.edu.pe.falabellastore.controller;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FalabellaController {

    public ScrollPane getView() {
        VBox root = new VBox(0);
        root.setStyle("-fx-background-color: #F8F9FA;");

        // 1. BARRA DE NAVEGACIÓN SUPERIOR
        HBox navbar = new HBox();
        navbar.setPadding(new Insets(15, 40, 15, 40));
        navbar.setStyle("-fx-background-color: #FFFFFF; -fx-border-color: #E0E0E0; -fx-border-width: 0 0 1 0;");

        Label logo = new Label("falabella.");
        logo.setStyle("-fx-text-fill: #ADCD00; -fx-font-size: 32px; -fx-font-weight: bold; -fx-font-family: 'Arial';");
        navbar.getChildren().add(logo);

        // 2. BANNER DE HERO (Con imagen cargada desde Descargas)
        StackPane heroBanner = new StackPane();
        heroBanner.setPrefHeight(150);
        heroBanner.setStyle("-fx-background-color: #0F1D38;");

        // Carga de la imagen de Spiderman para el banner
        ImageView bannerImageView = new ImageView();
        try {
            Image bannerImg = new Image("file:C:/Users/PROFESIONAL/Downloads/banner.png");
            bannerImageView.setImage(bannerImg);
            bannerImageView.setPreserveRatio(true);
            bannerImageView.setFitHeight(150);
        } catch (Exception e) {
            System.out.println("No se pudo cargar la imagen del banner.");
        }

        // Capa de elementos por encima de la imagen (Texto y Botón)
        HBox bannerOverlay = new HBox(20);
        bannerOverlay.setPadding(new Insets(20, 40, 20, 40));
        bannerOverlay.setAlignment(Pos.CENTER_LEFT);

        VBox bannerTextGroup = new VBox(5);
        Label txtSpidey = new Label("SPIDEY & ESTILO MARVEL");
        txtSpidey.setStyle("-fx-text-fill: white; -fx-font-size: 26px; -fx-font-weight: 900;");
        bannerTextGroup.getChildren().add(txtSpidey);

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        Button btnComprar = new Button("¡Ir a comprar!  >");
        btnComprar.setStyle("-fx-background-color: #D32F2F; -fx-text-fill: white; -fx-font-size: 14px; -fx-font-weight: bold; -fx-background-radius: 20px; -fx-padding: 10 25; -fx-cursor: hand;");

        bannerOverlay.getChildren().addAll(bannerTextGroup, spacer, btnComprar);

        // Ensamblado del banner
        heroBanner.getChildren().addAll(bannerImageView, bannerOverlay);
        StackPane.setAlignment(bannerImageView, Pos.CENTER);

        // 3. SECCIÓN PRINCIPAL
        HBox mainContent = new HBox(25);
        mainContent.setPadding(new Insets(30, 40, 40, 40));

        // 3A. Sidebar Izquierda
        VBox sidebar = new VBox(15);
        sidebar.setPrefWidth(260);
        sidebar.setPadding(new Insets(20));
        sidebar.setStyle("-fx-background-color: #FFFFFF; -fx-background-radius: 8px; -fx-border-color: #E0E0E0; -fx-border-radius: 8px;");

        Label txtBienvenido = new Label("Bienvenido a la\npágina de\nFalabella");
        txtBienvenido.setStyle("-fx-font-size: 18px; -fx-font-weight: bold; -fx-text-fill: #222222;");

        Label txtSub = new Label("Encuentra los productos que deseas\ncuando quieras y como quieras");
        txtSub.setStyle("-fx-font-size: 12px; -fx-text-fill: #666666;");

        StackPane iconBox = new StackPane();
        Rectangle bgBox = new Rectangle(50, 50, Color.web("#ADCD00"));
        bgBox.setArcWidth(10);
        bgBox.setArcHeight(10);
        Label fLabel = new Label("f.");
        fLabel.setStyle("-fx-text-fill: white; -fx-font-size: 32px; -fx-font-weight: bold;");
        iconBox.getChildren().addAll(bgBox, fLabel);

        sidebar.getChildren().addAll(txtBienvenido, txtSub, iconBox);

        // 3B. Contenido Derecho (Productos)
        VBox rightSection = new VBox(20);
        HBox.setHgrow(rightSection, Priority.ALWAYS);

        HBox filterBar = new HBox(15);
        filterBar.setAlignment(Pos.CENTER_LEFT);
        filterBar.setPadding(new Insets(15));
        filterBar.setStyle("-fx-background-color: #FFFFFF; -fx-background-radius: 8px; -fx-border-color: #E0E0E0; -fx-border-radius: 8px;");

        Label lblOrdenar = new Label("Ordenar por:");
        lblOrdenar.setStyle("-fx-text-fill: #888888; -fx-font-size: 13px;");

        ComboBox<String> cbRecomendados = new ComboBox<>();
        cbRecomendados.getItems().add("Recomendados");
        cbRecomendados.setValue("Recomendados");
        cbRecomendados.setStyle("-fx-background-color: transparent; -fx-font-weight: bold;");

        filterBar.getChildren().addAll(lblOrdenar, cbRecomendados);

        HBox productsGrid = new HBox(20);
        productsGrid.getChildren().addAll(
                createProductCard("BASEMENT", "Spiderman polera", "file:C:/Users/PROFESIONAL/Downloads/polera.png"),
                createProductCard("BASEMENT", "Spiderman pijama\nconjunto", "file:C:/Users/PROFESIONAL/Downloads/pijama.png"),
                createProductCard("BASEMENT", "Spiderman polo", "file:C:/Users/PROFESIONAL/Downloads/polo.png")
        );

        rightSection.getChildren().addAll(filterBar, productsGrid);
        mainContent.getChildren().addAll(sidebar, rightSection);

        root.getChildren().addAll(navbar, heroBanner, mainContent);

        ScrollPane scrollPane = new ScrollPane(root);
        scrollPane.setFitToWidth(true);
        return scrollPane;
    }

    private VBox createProductCard(String brand, String name, String imagePath) {
        VBox card = new VBox(10);
        card.setPrefWidth(220);
        card.setPadding(new Insets(15));
        card.setStyle("-fx-background-color: #FFFFFF; -fx-background-radius: 8px; -fx-border-color: #E0E0E0; -fx-border-radius: 8px;");

        StackPane imgContainer = new StackPane();
        Rectangle imgBg = new Rectangle(190, 180, Color.web("#F8F9FA"));
        imgBg.setArcWidth(8);
        imgBg.setArcHeight(8);

        ImageView imageView = new ImageView();
        try {
            Image img = new Image(imagePath, 180, 170, true, true);
            imageView.setImage(img);
        } catch (Exception e) {
            System.out.println("No se pudo cargar la imagen desde: " + imagePath);
        }

        imgContainer.getChildren().addAll(imgBg, imageView);

        Label lblBrand = new Label(brand);
        lblBrand.setStyle("-fx-text-fill: #999999; -fx-font-size: 11px;");

        Label lblName = new Label(name);
        lblName.setStyle("-fx-font-weight: bold; -fx-font-size: 13px; -fx-text-fill: #222222;");

        card.getChildren().addAll(imgContainer, lblBrand, lblName);
        return card;
    }
}