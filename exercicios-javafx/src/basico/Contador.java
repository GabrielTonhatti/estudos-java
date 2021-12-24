package basico;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Contador extends Application {

	private int contador = 0;

	private void atualizarLabelNumero(Label label) {
		label.setText(Integer.toString(contador));
		
		label.getStyleClass().remove("verde");
		label.getStyleClass().remove("vermelho");
		
		if (contador > 0) label.getStyleClass().add("verde");
		else if (contador < 0) label.getStyleClass().add("vermelho");

	}

	@Override
	public void start(Stage primaryStage) throws Exception {

		Label labelTitulo = new Label("Contador");
		labelTitulo.getStyleClass().add("titulo");

		Label labelNumero = new Label("0");
		labelNumero.getStyleClass().add("numero");

		Button botaoDecremento = new Button("-");
		botaoDecremento.getStyleClass().add("botoes");
		botaoDecremento.setOnAction(e -> {
			contador--;
			atualizarLabelNumero(labelNumero);
		});

		Button botaoIncremento = new Button("+");
		botaoIncremento.getStyleClass().add("botoes");
		botaoIncremento.setOnAction(e -> {
			contador++;
			atualizarLabelNumero(labelNumero);
		});

		HBox boxBotoes = new HBox(); // Horizontal Box
		boxBotoes.setAlignment(Pos.CENTER); // Seta o alinhamento para centralizado
		boxBotoes.setSpacing(10); // Define o espaçamento dos elementos
		boxBotoes.getChildren().add(botaoDecremento); // Adiciona o botão no HBox
		boxBotoes.getChildren().add(botaoIncremento);

		VBox boxConteudo = new VBox(); // Vertical Box
		boxConteudo.getStyleClass().add("conteudo"); // Adiciona a classe CSS no conteudo
		boxConteudo.setAlignment(Pos.CENTER);
		boxConteudo.setSpacing(10);
		boxConteudo.getChildren().add(labelTitulo);
		boxConteudo.getChildren().add(labelNumero);
		boxConteudo.getChildren().add(boxBotoes);

		String caminhoDoCss = getClass().getResource("/basico/Contador.css").toExternalForm();

		// Cria uma nova cena adicionando o box, e definindo o tamanho da aplicação
		Scene cenaPrincipal = new Scene(boxConteudo, 400, 400);
		cenaPrincipal.getStylesheets().add(caminhoDoCss); // Adiciona o caminho do arquivo CSS

		// Adiciona o caminho da fonte na internet
		cenaPrincipal.getStylesheets()
				.add("https://fonts.googleapis.com/css2?family=Oswald:wght@200;300;400;500;600;700&display=swap");

		primaryStage.setScene(cenaPrincipal); // Adiciona a cena na aplicação
		primaryStage.show(); // Exibe a aplicação
	}

	public static void main(String[] args) {
		launch(args); // Executa a aplicação
	}

}