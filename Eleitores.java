package Lista02;

import javax.swing.JOptionPane;


//Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o 
//percentual que cada um representa em relação ao total de eleitores. 

public class Eleitores {
	public static void main (String []args) {

		
		double brancos,nulos,validos,eleitoresB,eleitoresN,eleitoresV;
		
		brancos = Double.parseDouble(JOptionPane.showInputDialog("Digite o percenual de votos BRANCOS: "));
		nulos = Double.parseDouble(JOptionPane.showInputDialog("Digite o percenual de votos NULOS: "));
		validos = Double.parseDouble(JOptionPane.showInputDialog("Digite o percenual de votos VALIDOS: "));
		
		eleitoresB = brancos/100;
		eleitoresN = nulos/100;
		eleitoresV = validos/100;
		
		JOptionPane.showMessageDialog(null,"O percentual de votos Brancos é de "+eleitoresB);
		JOptionPane.showMessageDialog(null,"O percentual de votos Nulos é de "+eleitoresN);
		JOptionPane.showMessageDialog(null,"O percentual de votos Validos é de "+eleitoresV);
		
	}

}
