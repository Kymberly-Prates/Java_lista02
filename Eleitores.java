package Lista02;

import javax.swing.JOptionPane;


//Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos e v�lidos. Calcular e escrever o 
//percentual que cada um representa em rela��o ao total de eleitores. 

public class Eleitores {
	public static void main (String []args) {

		
		double brancos,nulos,validos,eleitoresB,eleitoresN,eleitoresV;
		
		brancos = Double.parseDouble(JOptionPane.showInputDialog("Digite o percenual de votos BRANCOS: "));
		nulos = Double.parseDouble(JOptionPane.showInputDialog("Digite o percenual de votos NULOS: "));
		validos = Double.parseDouble(JOptionPane.showInputDialog("Digite o percenual de votos VALIDOS: "));
		
		eleitoresB = brancos/100;
		eleitoresN = nulos/100;
		eleitoresV = validos/100;
		
		JOptionPane.showMessageDialog(null,"O percentual de votos Brancos � de "+eleitoresB);
		JOptionPane.showMessageDialog(null,"O percentual de votos Nulos � de "+eleitoresN);
		JOptionPane.showMessageDialog(null,"O percentual de votos Validos � de "+eleitoresV);
		
	}

}
