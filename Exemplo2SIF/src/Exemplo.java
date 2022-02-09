import java.util.Scanner;

public class Exemplo {
	
	public static void main(String[] args) {
		
		int[] v = new int[5]; // vari�vel local ao m�todo main
		lerDados(v); // argumento --> vari�vel que ser� enviada para o m�todo
		int maior = maiorValor(v);
		int menor = menorValor(v);
		System.out.println("maior valor = " + maior);
		System.out.println("menor valor = " + menor);

	}
	
	public static int maiorValor(int[] v) {
		int aux = v[0];
		for(int i = 0; i < v.length; i++) {
			if(v[i] > aux) {
				aux = v[i];
			}
		}
		return aux;
	}
	
	public static int menorValor(int[] v) {
		int aux = v[0];
		for(int i = 0; i < v.length; i++) {
			if(v[i] < aux) {
				aux = v[i];
			}
		}
		return aux;
	}
	
	public static void lerDados(int[] v) { // par�metro --> vari�vel que recebe o valor
		Scanner teclado = new Scanner(System.in);
		for(int i = 0; i < v.length; i++) {
			System.out.print("Valor: ");
			v[i] = teclado.nextInt();
		}
		teclado.close();
	}
	
}
