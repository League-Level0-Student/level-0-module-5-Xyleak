package algorithms;

import javax.swing.JOptionPane;

public class Prime_Or_Not {

	public static void main(String[] args) {
		
		

	String Pon = JOptionPane.showInputDialog("Type A Number");
	int int_Pon = Integer.parseInt(Pon);
	boolean prime=true;
	
	for (int i = 2; i < int_Pon; i++) {
		System.out.println(i+"  "+(int_Pon%i));
		if(int_Pon%i==0) {
			prime=false;
			break;
		}
	}
     if(prime) {
    	   JOptionPane.showMessageDialog(null,"Prime");
     }
     else { JOptionPane.showMessageDialog(null, "Composa pizza");
     }
     
	
}
}