package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import dominio.Pessoa;

public class cadastroJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// SALVA NO BANCO DE DADOS

		Pessoa p1 = new Pessoa(null, "Ana Caroline", "carolinerufino.adv@gmail.com");
		Pessoa p2 = new Pessoa(null, "Rafael", "rafaels.paesleme@hotmail.com");
		Pessoa p3 = new Pessoa(null, "Joaquina", "joaquina@yahoo.com");

		int dialogButton = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog(null, "Deseja salvar objetos no DB?", "WARNING", dialogButton);
		if (dialogButton == JOptionPane.YES_OPTION) {

			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("exemplo-jpa");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(p1);
			entityManager.persist(p2);
			entityManager.persist(p3);
			entityManager.getTransaction().commit();

			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);
			System.out.println("Salvo no DB!");

			if (dialogButton == JOptionPane.NO_OPTION) {
				System.out.println("Dado n'ao salvo no DB!");
			}
		}

	}

}
