package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O1 {
	
	public static void main (String[] args) {
		
		//lager en løkke som skal kjøre 10 ganger
		for(int i = 0; i < 10; i++) {
		
			//henter input fra bruker
			String poengTxt = showInputDialog("Poeng: ");
		
			//gjør om input fra string til integer 
			int poeng = Integer.parseInt(poengTxt);
		
		
			//tildeler svar til poengintervall
			if(poeng <= 39 && poeng >= 0) {
				showMessageDialog(null, "F");
			}
		
			if(poeng <= 49 && poeng >= 40) {
				showMessageDialog(null, "E");
			}
		
			if(poeng <= 59 && poeng >= 50) {
				showMessageDialog(null, "D");
			}
		
			if(poeng <= 79 && poeng >= 60) {
				showMessageDialog(null, "C");
			}
		
			if(poeng <= 89 && poeng >= 80) {
				showMessageDialog(null, "B");
			}
		
			if(poeng <= 100 && poeng >= 90) {
				showMessageDialog(null, "A");
			}
	
			//gir feilmelding dersom poengsummen er ugyldig
			if(poeng < 0 || poeng > 100) {
		
				//senker i med 1 for å gi løkken en ekstra gjennomgang
				i = i-1;
			
				showMessageDialog(null, "Ugyldig poengsum. Legg inn på nytt");
			}
		
		}
	}
}