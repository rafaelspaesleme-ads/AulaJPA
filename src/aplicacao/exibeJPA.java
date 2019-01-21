package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import dominio.Pessoa;

public class exibeJPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EXIBIR DADOS DO BANCO

		int dialogButton2 = JOptionPane.YES_NO_OPTION;
		JOptionPane.showConfirmDialog(null, "Deseja exibir dado do DB?", "WARNING", dialogButton2);
		if (dialogButton2 == JOptionPane.YES_OPTION) {

			EntityManagerFactory entityManagerFactoryReturn = Persistence.createEntityManagerFactory("exemplo-jpa");
			EntityManager entityManagerReturn = entityManagerFactoryReturn.createEntityManager();

			Pessoa pessoa = entityManagerReturn.find(Pessoa.class, 2);

			System.out.println(pessoa);
			JOptionPane.showMessageDialog(null, pessoa);
			entityManagerReturn.close();
			entityManagerFactoryReturn.close();

			if (dialogButton2 == JOptionPane.NO_OPTION) {
				System.out.println("Dado n'ao exibido do DB!");
			}
		}
	}

}
