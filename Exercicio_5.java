import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {

		 Scanner leitor = new Scanner(System.in);
	       
		    int cont = 1;
	        double soma = 0;
	        float maior = 0;
	        float menor = 0;
	        double salario;
	        float altura;
	        String sexo ;
	       
	        
	        System.out.println("Cadastro de dados dos funcion�rios");
	        do {
	            System.out.printf("%d� - Pessoa\n",cont);
	            System.out.print("Altura:");
	            altura = leitor.nextFloat();
	            System.out.print("Sexo(M/F):");
	            sexo = leitor.next();
	            System.out.print("Sal�rio:");
	            salario = leitor.nextFloat();
	            cont++;
	            soma = soma+ salario/20;
	            if(altura > maior){
	                altura = maior;
	            }if(altura < menor){
	                altura = menor;
	            }if(salario <= 1000 && sexo == "f"){
	                cont = cont + 1;
	            }
	            
	        } while (cont <= 2);
	        
	        System.out.println("M�dia sal�rial:"+soma);
	        System.out.println("Maior altura:"+maior 
	            +"\nMenor altura:"+ menor);
	       System.out.println("quantidade de mulheres com sal�rio at� R$1.000,00 :"+cont);
	     
	       
	       
	       
	       
	        
	    }
	    
	
	}