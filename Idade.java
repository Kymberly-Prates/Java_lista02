package Lista02;

import javax.swing.JOptionPane;

//1) Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa 
//expressa apenas em dias. Considerar ano com 365 dias e m�s com 30 dias. 

public class Idade {
	public static void main (String []args) {

			
			double anos,dias,meses,idade;
			
			anos = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos anos voc� tem: "));
			dias = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos dias voc� tem: "));
			meses = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos meses voc� tem: "));
			
			idade = ((anos*360)+(meses*30)+dias);
			
			JOptionPane.showMessageDialog(null,"Voc� tem ao todo "+idade +"dias de vida at� hoje");
			
			
		}

	}