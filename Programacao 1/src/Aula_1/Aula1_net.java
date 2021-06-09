package Aula_1;

import java.util.Scanner;

public class Aula1_net {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double media,nota1,nota2;
		
		System.out.println("digite a nota 1");
		nota1 = Double.parseDouble(sc.nextLine());
		
		System.out.println("digite a nota 2");
		nota2 = Double.parseDouble(sc.nextLine());		
		
		media=(nota1+nota2)/2.0;
		
		System.out.println("A sua media eh :" +media);
		
		sc.close();
	}
    
}
