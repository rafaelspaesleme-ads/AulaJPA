package aplicacao;

import javax.swing.JOptionPane;


public class programa {

	public static void main(String[] args) {

		Integer i = Integer.parseInt(JOptionPane.showInputDialog("1- CADASTRO\n2- EXIBIR\n3- EXCLUIR"));
		
		if(i == 1) {
			cadastroJPA cadJPA = new cadastroJPA();
			cadJPA.main(args);
		}
		else if (i == 2) {
			exibeJPA exibJPA = new exibeJPA();
			exibJPA.main(args);
		}
		else if (i == 3) {
			excluiJPA excJPA = new excluiJPA();
			excJPA.main(args);
		}
		else {
			System.out.println("Erro!");
		}
		
	}
	
}
