import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {

		  Scanner leitor = new Scanner(System.in);
	       
		  
		    int cont = 1;
	        int valor;
	        int maior = 0;
	        
	        System.out.println("Digite os 15 n�meros");
	        do {
	            System.out.printf("%d N�mero:",cont);
	            valor = leitor.nextInt();
	            cont++;
	            
	            if(valor > maior){
	                maior = valor;
	            }
	            
	            
	        } while (cont <= 15);
	        System.out.println("O maior n�mero digitado �:"+maior);
	    }
	    
		
		
		

	

}
