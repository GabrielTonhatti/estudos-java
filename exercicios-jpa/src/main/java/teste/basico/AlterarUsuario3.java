package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 9L);
		em.detach(usuario); // Tira o objeto do estado gerenciado e não faz alteração se não for feito o
							// merge antes
		usuario.setNome("Leonardo Moura Leitão");

		em.merge(usuario); // Faz a alteração

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
