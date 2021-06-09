package Aula_2_pdf;

// media de duas notas

    import java.util.Scanner;

public class AreaTeste1 {
    
   // identação do bloco da classe aREAtESTE
        public static void main(String[] args) { 
        // identação do bloco do método main 
        // TODO Auto-generated method stub 
            Scanner sc = new Scanner(System.in);
            double media, nota1, nota2; 
            System.out.println("Digite a nota 1:"); 
                nota1 = sc.nextDouble();
            System.out.println("Digite a nota 2:");
                nota2 = Double.parseDouble(sc.nextLine());
            
            media = (nota1 + nota2) /2.0;
            
            System.out.println("A sua média é:" + media); 
            sc.close();
        } 
// encerramento da identação do bloco do método main } 
// encerramento da identação da classe Exemplo
    
}
