import java.util.Scanner;

  class Main {
	  public static double soma ( double n1, double n2) {
		 return n1 + n2;
	  }
	  public static double subtracao ( double n1, double n2) {
		  return n1 - n2;
		  
	  }
	  public static double multiplicacao (double n1, double n2) {
		  return n1 * n2;
	  }
	  public static double divisao (double n1, double n2) {
		  return n1 / n2;
	  }
	  

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a operacao: ");
		int opcao = sc.nextInt();
		
		System.out.println("Informe o primeiro numero: ");
		double n1 = sc.nextDouble();
		System.out.println("Informe o segundo numero: ");
		double n2 = sc.nextDouble();
	
			switch (opcao) {
			case 1:
			System.out.println("1: Soma");	
			double vsoma = soma(n1, n2);	
			System.out.println( vsoma);
			break;
			case 2:
			System.out.println("2: Subtracao");
			double vsubtracao = subtracao(n1, n2);	
			System.out.println( vsubtracao);
			break;
			case 3:
			System.out.println("3: Multiplicacao ");
			double vmultiplicacao = multiplicacao(n1, n2);
			System.out.println( vmultiplicacao);
			break;
			case 4:
			System.out.println("4: Divisao ");
			double vdivisao = divisao(n1, n2);
			System.out.println( vdivisao);
			break;
			default:
			System.out.println("Opcao invalida!");
				
				
			
			}
				
			
		
		
		
	
		  
	
		

		 sc.close();

		
		

	}

}
