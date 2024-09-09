package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class O2 {

	public static void main(String[] args) {
		
		//henter inntekt fra bruker
		String inntektTxt = showInputDialog("Inntekt: ");
		
		//omgjør brukerinnput fra string til double 
		double inntekt = Double.parseDouble(inntektTxt);
		
		//definerer verdi for skatt
		double skatt = 0;
		
		//finner intervallet som tilsvarer inntekten til brukeren
		if (inntekt >= 208050 && inntekt >= 0) {
			skatt = 0;
		}
		
		if (inntekt >= 208051 && inntekt <= 29850) {
			skatt = inntekt * 0.017;
		}
		
		if (inntekt >= 292851 && inntekt <= 670000) {
			skatt = inntekt * 0.04;
			
		}
		
		if (inntekt >= 670001 && inntekt <= 937900) {
			skatt = inntekt  * 0.136;
			
		}
		
		
		if (inntekt >= 937901 && inntekt <= 1350000 ) {
			skatt = inntekt * 0.166;
			
		}
		
		if (inntekt > 1350001) {
			skatt = inntekt * 0.176;
			
		}
		
		//Runder sluttsummen ned til nærmeste heltall, og gir svarsetning
		showMessageDialog(null, "Skatt: " + Math.floor(skatt) + " Kr");
	}

}
