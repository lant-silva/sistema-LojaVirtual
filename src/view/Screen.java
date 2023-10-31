package view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
;

public class Screen extends Application {
    @Override
    public void start(Stage app) throws Exception {
        // Inicio do app
        app.setTitle("Rainforest");
        app.setResizable(false);
        BorderPane root = new BorderPane();
        Scene paginaInicial = new Scene(root, 640, 480);

       // Definição do cabeçalho do app (vai ficar visivel em todas as telas)
        BorderPane caixaCabecalho = new BorderPane();
        FlowPane cabecalhoPesquisa = new FlowPane();
        cabecalhoPesquisa.setAlignment(Pos.CENTER);
        cabecalhoPesquisa.setVgap(5);
        cabecalhoPesquisa.setHgap(5);

        TextField txtPesquisa = new TextField();
        Button btnPesquisa = new Button("Pesquisar");

        cabecalhoPesquisa.getChildren().addAll(txtPesquisa, btnPesquisa);



        FlowPane cabecalhoBotoes = new FlowPane();
        cabecalhoBotoes.setAlignment(Pos.CENTER);


        Button btnPaginaInicial = new Button("Pagina Inicial");
        Button btnMinhasCompras = new Button("Minhas Compras");
        Button btnCarrinho = new Button("Carrinho");
        Button btnConta = new Button("Conta");

        cabecalhoBotoes.getChildren().addAll(btnPaginaInicial, btnMinhasCompras, btnCarrinho, btnConta);

        root.setTop(caixaCabecalho);


        caixaCabecalho.setCenter(cabecalhoPesquisa);
        caixaCabecalho.setBottom(cabecalhoBotoes);


        app.setScene(paginaInicial);
        app.show();
    }
}
