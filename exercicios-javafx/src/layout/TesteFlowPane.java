package layout;

import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.layout.FlowPane;

public class TesteFlowPane extends FlowPane {

	public TesteFlowPane() {
		Quadrado q1 = new Quadrado();
		Quadrado q2 = new Quadrado();
		Quadrado q3 = new Quadrado();
		Quadrado q4 = new Quadrado();
		Quadrado q5 = new Quadrado();

		setHgap(10); // Distância entre os elementos no eixo horizontal
		setVgap(10);  // Distância entre os elementos no eixo vertical
		setPadding(new Insets(10)); // Adiciona um padding em todas as direções
		
		setOrientation(Orientation.VERTICAL); // Muda a orientação para vertical
		setAlignment(Pos.CENTER_RIGHT); // Posicina no centro do lado direito
		
		getChildren().addAll(q1, q2, q3, q4, q5);
	}

}
