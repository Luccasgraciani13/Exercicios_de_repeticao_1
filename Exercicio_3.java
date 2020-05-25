import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {

		
		 Scanner leitor = new Scanner(System.in);
	      
		 
		    int cont = 1;
	        int valor;
	        int soma = 0 ,media;
	        
	        System.out.println("Digite os 20 números");
	        do {
	            System.out.printf("%d Número:",cont);
	            valor = leitor.nextInt();
	            ++cont; 
	          soma = soma + valor;
	          media = soma/20;
	          
	        } while (cont <= 20);
	         
	         System.out.println(soma);
	         System.out.println(media);
	       
	         
	         
	        
	            
	        
	    }
	}