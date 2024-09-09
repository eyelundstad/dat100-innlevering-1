package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O3 {

	public static void main(String[] args) {
		
		//henter input fra bruker
		String n_txt = showInputDialog("Gi et tall");
		
		//gjør om input fra string til integer
		int n = Integer.parseInt(n_txt);
		
		//setter sum lik integer som er oppgitt av bruker 
		int sum = n;
		
		//løkke hvor sum blir ganget med en verdi n-1 som minker for hver gjennomgang
		for (int i = 1; i < n; i++) {
			
			sum = sum * (n-i);
		}
		
		//printer svarsetning 
		System.out.println(sum);
		
	}
}
