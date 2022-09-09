import java.util.Scanner;

public class Ex6Com {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int s = 0, a = 0;
		double p = 0, m = 0, f = 0;
		
		System.out.println("Quantidade de sala de aulas --> ");
		s = teclado.nextInt();
		
		double [] s1 = new double[s];
		
		for (int i = 0; i < s1.length; i++) {
			System.out.println("Quantidade de alunos na sala "+(i + 1));
			a = teclado.nextInt();
			double [] a1 = new double [a];
			m = media(a1, m, i);
			
			m = m/a1.length;
			p = porcentagem(p, a1, m);
			
			valor(p, i, m, f, a1, s1);
			p = 0;
			m = 0;
		}
	}

	public static double media(double a1[], double m, int i) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe a nota de 0 a 100");
		for (int j = 0; j < a1.length; j++) {
			do {
				System.out.println("Nota do aluno " + (j + 1) + " da sala " +(i + 1) + "-->");
				a1[j] = teclado.nextDouble();
				if(a1[j] > 100 || a1[j] < 0) {
					System.out.println("\nValor inválido");
				}else {
					m = m + a1[j];
				}
			}while (a1[j] > 100 || a1[j] < 0);
			
		}
		return m;
	}

	public static double porcentagem(double p, double a1[], double m) {
		for (int k = 0; k < a1.length; k++) {
			if(a1[k] > m) {
				p++;
			}
		}
		return p;
	}

	public static void valor(double p, int i, double m, double f, double a1[], double s1[]) {
		System.out.println("Sala: " + (i + 1) + ", alunos: " + a1.length);
		for (int q = 0; q < s1.length; q++) {
			System.out.println("Média: " + a1[q]);
		}
		System.out.println("\nMédia final é = " + String.format("%.1f", m));
		f = p/a1.length;
		s1[i] = f;
		System.out.println(String.format("%.1f", s1[i] * 100) + "% ficaram acima da média da sala");
	}
}

