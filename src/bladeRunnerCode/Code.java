package bladeRunnerCode;

import javax.swing.JOptionPane;

public class Code {

	public static void main(String[] args) {
		
		String codigo = JOptionPane.showInputDialog("Digite sua mensagem");
		codigo.toLowerCase().split("");
		String saida="";
		char [] cCodigo = codigo.toCharArray();
		int[] iEntrada = new int[cCodigo.length];
		int [] senha = {10, 8, 4, 11, 2};
		char [] alfabeto = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y','z' };
		
		//leitura de entrada + verificacao com alfabeto
		for(int i = 0; i < cCodigo.length; i++) {
			for( int j = 0; j < alfabeto.length; j++) {
				if(cCodigo[i] == alfabeto[j]) {
					iEntrada[i] = j;
				}
			}
		}
		
		// leitura do for anterior somando com a senha
		for(int i = 0; i < iEntrada.length; i++) {
			for (int j = 0; j < 5; j++) {
				iEntrada[i] += senha[j];
				i++;
			}
		}
		
		// leitura de saida
		for(int i =0; i < iEntrada.length; i++) {
			saida+= alfabeto[iEntrada[i]];
		}
		
		
		
		
		System.out.println(saida);
		
		
	}

}