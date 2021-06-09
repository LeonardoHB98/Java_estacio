
package Aula_5;

public class App_Heranca {
    public static void main(String[] args){
        Cliente teste = new Cliente();
        teste.cadastrar("0123465", "123465","654879", "alksjd ", 33);
        teste.entradaDados();
        
        SuperclasseFuncionario t1 = new SuperclasseFuncionario("123456789");
        
        t1.setNomeGerente("carlos");
        t1.imprimir();
        t1.entradaDados();
        
        
        SuperclasseFuncionario t3 = new SuperclasseFuncionario();
        
    }
    
}
