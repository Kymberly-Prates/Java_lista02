package Lista02;

import javax.swing.JOptionPane;


//Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do 
//novo salário. 

public class Salario {
	public static void main (String []args) {

		
		double mensal,percentual,atual;
		
		mensal = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario mensal: "));
		percentual = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da porcentagem para o reajuste: "));
	
		atual = (percentual*100)+mensal;
		
		JOptionPane.showMessageDialog(null,"O salario com o reajuste ficará em "+atual);
		
	}

}
