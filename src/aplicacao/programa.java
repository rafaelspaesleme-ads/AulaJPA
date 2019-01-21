package aplicacao;

import dominio.Pessoa;

public class programa {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(1, "Ana Caroline", "carolinerufino.adv@gmail.com");
		Pessoa p2 = new Pessoa(2, "Rafael", "rafaels.paesleme@hotmail.com");
		Pessoa p3 = new Pessoa(3, "Joaquina", "joaquina@yahoo.com");
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}
	
}
