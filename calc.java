import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int i = 0;
	    String p = "s";
	    Scanner sc = new Scanner(System.in);
	    
	        while (i!=5){
		    System.out.println("\tCalculadora\nescolha o que deseja fazer:\n(1)adição\t(2)Subtração\n(3)divisão\t(4)multiplicação\n(5)encerrar");
	        i = sc.nextInt();
	        if(i==1){
	            System.out.print("digite os valores a serem somados separadamente: ");
	            float a1 = sc.nextFloat();
	            float a2 = sc.nextFloat();
	            System.out.printf("A soma é: %f\n",a1+a2);
	        }
	        else if (i==2){
	            System.out.print("digite os valores a serem subtraidos separadamente: ");
	            float a1 = sc.nextFloat();
	            float a2 = sc.nextFloat();
	            System.out.printf("A soma é: %f\n",a1-a2);
	        } else if (i==3){
	            System.out.print("digite os valores a serem divididos separadamente: ");
	            float a1 = sc.nextFloat();
	            float a2 = sc.nextFloat();
	            System.out.printf("A soma é: %f\n",a1/a2);
	        } else if (i==4){
	            System.out.print("digite os valores a serem mutiplicas separadamente: ");
	            float a1 = sc.nextFloat();
	            float a2 = sc.nextFloat();
	            System.out.printf("A soma é: %f\n",a1*a2);
	        }else if (i==5){
	            System.out.print("obrigado por usar a calucladora :D");
	        } 
	        else{
	            System.out.print("digite uma opção valida");
	        }
	       
	       
	   }}
	}
