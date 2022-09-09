import java.util.Scanner;

public class Ex6S {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int s = 0, a = 0;
		double p = 0, m = 0, f = 0;

		System.out.println("Quantidade de sala de aulas --> ");
		s = teclado.nextInt();
		
		double [] s1 = new double [s];
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Quantidade de alunos na sala "+(i + 1));
			a = teclado.nextInt();
			double [] a1 = new double[a];
			
			System.out.println("Informe a nota de 0 a 100");
			for (int j = 0; j < a1.length; j++) {
				do {
				System.out.println("Nota do aluno " + (j + 1) + " da sala "+(i + 1) + "-->");
				a1[j] = teclado.nextDouble();
				if (a1[j] < 0 || a1[j] > 100) {
					System.out.println("\nValor inválido");
				}else {
					m = m + a1[j];
				}
			}while (a1[j] > 100 || a1[j] < 0);
		}
		
		m = m/a;
		for (int k = 0; k < a1.length; k++) {
			if(a1[k] > m) {
				p++;
			}
		}

		System.out.println("Sala: " + (i + 1) + ", alunos: " + a1.length);
		for (int l = 0; l < a1.length; l++) {
			System.out.println("Média: " + a1[l]);
		}
		System.out.println("\nMédia final é = " + String.format("%.1f", m));
		f = p/a;
		s1[i] = f;
		System.out.println(String.format("%.1f", s1[i] * 100) + "% ficaram acima da média da sala");
		p = 0;
		m = 0;
		}

}
}
