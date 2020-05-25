import java.util.Scanner;

public class Exercicio_1 {

	
		  public static void main(String[] args) {

		        Scanner leitor = new Scanner(System.in); 
		        int valor;
		        int maior = 1;  
		        
		        do {  
		         
		            System.out.printf("%d Número:", maior);
		             valor = leitor.nextInt();      
		           
		
		          if(valor > 0){
		            System.out.println("O número é Positivo");
		           }else{
		            System.out.println("O número é Negativo");
		           }
		          maior++;
		        } while ( maior < 11);
		        
		        
		    	        
		                 
		              
		    }
		    
		}
				
			
