package br.com.cod3r.app.financeiro;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

import br.com.cod3r.app.Calculadora;

public class Teste {

	public static void main(String[] args) {

		Calculadora calc = ServiceLoader.load(Calculadora.class).findFirst().get();
		System.out.println(calc.soma(2, 3, 4));

		try {
			Field fielId = calc.getClass().getDeclaredFields()[0];
			fielId.setAccessible(true);
			fielId.set(calc, "def");
			fielId.setAccessible(false);

			System.out.println(calc.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
