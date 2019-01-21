package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import dominio.Pessoa;

public class excluiJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EXCLUIR DADOS DO BANCO

		int dialogButton3 = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog(null, "Deseja excluir dado do DB?", "WARNING", dialogButton3);
		if (dialogButton3 == JOptionPane.YES_OPTION) {

			EntityManagerFactory entityManagerFactoryDelete = Persistence.createEntityManagerFactory("exemplo-jpa");
			EntityManager entityManagerDelete = entityManagerFactoryDelete.createEntityManager();

			Pessoa pessoa = entityManagerDelete.find(Pessoa.class, 4);
			Pessoa pessoa1 = entityManagerDelete.find(Pessoa.class, 5);
			Pessoa pessoa2 = entityManagerDelete.find(Pessoa.class, 6);
			Pessoa pessoa3 = entityManagerDelete.find(Pessoa.class, 7);
			Pessoa pessoa4 = entityManagerDelete.find(Pessoa.class, 8);
			Pessoa pessoa5 = entityManagerDelete.find(Pessoa.class, 9);
			Pessoa pessoa6 = entityManagerDelete.find(Pessoa.class, 10);
			Pessoa pessoa7 = entityManagerDelete.find(Pessoa.class, 11);
			Pessoa pessoa8 = entityManagerDelete.find(Pessoa.class, 12);
			entityManagerDelete.getTransaction().begin();
			entityManagerDelete.remove(pessoa);
			entityManagerDelete.remove(pessoa1);
			entityManagerDelete.remove(pessoa2);
			entityManagerDelete.remove(pessoa3);
			entityManagerDelete.remove(pessoa4);
			entityManagerDelete.remove(pessoa5);
			entityManagerDelete.remove(pessoa6);
			entityManagerDelete.remove(pessoa7);
			entityManagerDelete.remove(pessoa8);
			entityManagerDelete.getTransaction().commit();

			System.out.println("Dado excluido do DB!");
			entityManagerDelete.close();
			entityManagerFactoryDelete.close();

			if (dialogButton3 == JOptionPane.NO_OPTION) {
				System.out.println("Dado n'ao exibido do DB!");
			}
		}
	}

}
