package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) throws SQLException {

		final String stringDeConexao = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true";
		// Pega o valor da variável configurada na IDE
		// String teste = System.getenv("DATABASE_URL");
		final String usuario = "curso-java";
		final String senha = "123456";

		Connection conexao = DriverManager.getConnection(stringDeConexao, usuario, senha);

		System.out.println("Conexão efetuada com sucesso!");

		conexao.close();

	}

}
