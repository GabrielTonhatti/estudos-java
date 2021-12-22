package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtualizarPessoa {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);
		Connection conexao = FabricaConexao.getConexao();
		String sql = "UPDATE pessoa SET nome = ? WHERE codigo = ?";

		System.out.println("Digite o novo nome: ");
		String novoNome = entrada.nextLine();
		System.out.println("Digite o código da pessoa a ser atualizada: ");
		int id = entrada.nextInt();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, novoNome);
		stmt.setInt(2, id);
		stmt.execute();

		stmt.close();
		
		sql = "SELECT * FROM pessoa WHERE codigo = ?";
		System.out.println("Pessoa atualizada com sucesso!");
		stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, id);
		ResultSet resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();

		while (resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");

			pessoas.add(new Pessoa(codigo, nome));

		}

		pessoas.forEach(p -> System.out.println(p.getCodigo() + ": " + p.getNome()));

		stmt.close();
		entrada.close();
		conexao.close();

	}

}
