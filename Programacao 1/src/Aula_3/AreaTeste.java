package Aula_3;

import java.util.Scanner;

public class AreaTeste {
   
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
            System.out.println("Digite um numero a ser somado");
            int num1 = entrada.nextInt();
            System.out.println("Digite um numero a ser somado");
            int num2 = entrada.nextInt();
       int recebendo = soma(num1,num2); 
        System.out.println("Minha primeira soma eh:"+recebendo);
        
    }
    public static int soma(int x,int y){
        int somando = x+y;
        System.out.println("Ola");
        return somando;
}
}
