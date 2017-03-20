package service;

import java.util.List;

public class ClientWS {

	public static void main(String[] args) {
		BanqueWS stub = new BanqueServiceService().getBanqueWSPort(); //proxy
		double res = stub.convertionEuroToDh(800);
		System.out.println("800 euros = "+res+" DH");
		
		Compte cp = stub.getCompte(1L);
		System.out.println(cp.getSolde());
		
		System.out.println("------ Liste des comptes");
		List<Compte> cptes = stub.getComptes();
		for(Compte c : cptes){
			System.out.println(c.getCode());
			System.out.println(c.getSolde());
			System.out.println("--------------");
		}

	}

}
