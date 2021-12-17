package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando {
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA
	};

	private static final Memoria instancia = new Memoria();

	private final List<MemoriaObservador> observadores = new ArrayList<>();

	private String textoAtual = "";

	private Memoria() {

	}

	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObservador observador) {
		observadores.add(observador);
	}
	
	public String getTextoAtual() {
		return this.textoAtual.isEmpty() ? "0" : this.textoAtual;
	}
	
	public void processarComando(String valor) {
		
		TipoComando tipoComando = detectarTipoComando();
		
		if("AC".equals(valor)) {
			textoAtual = "";
		} else {
			textoAtual += valor;
		}
		
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}

}
