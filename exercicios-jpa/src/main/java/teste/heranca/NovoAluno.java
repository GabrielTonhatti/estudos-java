package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class NovoAluno {

	public static void main(String[] args) {

		DAO<Aluno> alunoDao = new DAO<>();

		Aluno aluno1 = new Aluno(125L, "Marcos");
		AlunoBolsista aluno2 = new AlunoBolsista(346L, "Marilia", 1000);

		alunoDao.incluirAtomico(aluno1);
		alunoDao.incluirAtomico(aluno2);
		
		alunoDao.fechar();
	}

}
