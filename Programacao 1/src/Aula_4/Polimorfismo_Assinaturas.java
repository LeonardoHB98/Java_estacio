////// POLIMORFISMO DE METODOS/////////////
package Aula_4;


public class Polimorfismo_Assinaturas {
    public static void main(String[] args){
        double x = 8.0;
        double a = 10.0;
        double recebe = teste(x,a);  
        System.out.println(""+teste(x));
        System.out.println(""+recebe);
    }
    public static double teste(double x, double q){
        System.out.println("Testando");
        double soma = x+q;
        return soma;
    }
    public static double teste(double x){
        return ((int)Math.pow(x, 2));
    }
}
