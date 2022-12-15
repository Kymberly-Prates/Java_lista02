package Lista02;

import javax.swing.JOptionPane;

public class Celcius {

public static void main (String []args) {

		
		double total,imposto,dist,custofab;
		
		custofab = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo da fábrica de um carro: "));
	
		imposto =((45*custofab) / 100);
		dist = ((28*custofab)/100);
		total = (custofab+imposto+dist);
		
		JOptionPane.showMessageDialog(null,"O valor final do carro será de "+total);
		
	}


}
