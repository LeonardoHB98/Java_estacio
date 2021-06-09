
package Aula_3;
// aplicacao para o uso da classe Aluno_Set_Get
public class Aluno_Set_Get_App {// declaracao e inicio da classe
    public static void main(String[] args){ // metodo inicial da App
        Aluno_Set_Get aluno1 = new Aluno_Set_Get(); // criacao ou instanciacao do objeto aluno1
          Aluno_Set_Get aluno2 = new Aluno_Set_Get(); // criacao ou instanciacao do objeto aluno2
            Aluno_Set_Get aluno3 = new Aluno_Set_Get(); // criacao ou instanciacao do objeto aluno3
    
    // definindo valores para os atributos do aluno1
    
    aluno1.setMatricula(" :1001");
    aluno1.setNome(" :Leonardo");
    aluno1.setCr(7.5);
    
    // definindo valores para os atributos do aluno2
    
    aluno2.setMatricula(" :1002");
    aluno2.setNome(" :Larissa");
    aluno2.setCr(7.5);
    
    // definindo valores para os atributos do aluno3
    
    aluno3.setMatricula( ":1003");
    aluno3.setNome(" :Gabriel");
    aluno3.setCr(7.5);
    
    aluno1.imprimir();
    aluno2.imprimir();
    aluno3.imprimir();
    
    }
    
    
    
}
