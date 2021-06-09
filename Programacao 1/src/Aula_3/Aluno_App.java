
package Aula_3;

public class Aluno_App {
    public static void main(String[] args){// metodo inicial da APP
        Aluno aluno1 = new Aluno(); // cricaou ou instaciancao do objeto aluno1 // criacao do construtor
        Aluno aluno2 = new Aluno();
        Aluno aluno3 = new Aluno();
        
        // definindo valores para os atributos do aluno 1
        aluno1.matricula = 1001;
        aluno1.nome = " Leonardo";
        aluno1.num = 123456;
        
        // definindo valores para os atributos do aluno 2
        aluno2.matricula = 1002;
        aluno2.nome = " Larissa";
        aluno2.num = 123457;
        
        // definindo valores para os atributos do aluno 3
        aluno3.matricula = 1001;
        aluno3.nome = " Gabriel";
        aluno3.num = 123458;
        
        /////// exibindo os valores dos atributos de cada aluno /////
        
        aluno1.imprimir();
        aluno2.imprimir();
        aluno3.imprimir();
    }
    
}
