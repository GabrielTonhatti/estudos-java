package layout;

import javafx.scene.layout.BorderPane;

public class TesteBorderPane extends BorderPane {

	public TesteBorderPane() {
		
		Caixa c1 = new Caixa().comTexto("Topo");
		setTop(c1); // Adiciona no topo ocupando a linha inteira do topo com um tamanho pŕe definido de uns 20 a 50px
		
		Caixa c2 = new Caixa().comTexto("Esquerda");
		setLeft(c2);// Adiciona na esquerda ocupando a linha inteira da esquerda com uma largura pŕe definido de uns 20 a 40px
		
		Caixa c3 = new Caixa().comTexto("Direita");
		setRight(c3);// Adiciona no topo ocupando a linha inteira da direita com uma largura pŕe definido de uns 20 a 40px
		
		Caixa c4 = new Caixa().comTexto("Fundo");
		setBottom(c4);// Adiciona no fundo("rodapé") ocupando a linha inteira do fundo com um tamanho pŕe definido de uns 20 a 50px
		
		Caixa c5 = new Caixa().comTexto("Área Central");
		setCenter(c5);// Adiciona centro da aplicação, ocupando o tamanho total restante
	}

	
}
