package Lista02;
// O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos 
//(aplicados ao custo de f�brica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo 
//para ler o custo de f�brica de um carro, calcular e escrever o custo final ao consumidor.

import javax.swing.JOptionPane;

public class Carro {
public static void main (String []args) {

		
		double total,imposto,dist,custofab;
		
		custofab = Double.parseDouble(JOptionPane.showInputDialog("Digite o custo da f�brica de um carro: "));
	
		imposto =((45*custofab) / 100);
		dist = ((28*custofab)/100);
		total = (custofab+imposto+dist);
		
		JOptionPane.showMessageDialog(null,"O valor final do carro ser� de "+total);
		
	}
}
