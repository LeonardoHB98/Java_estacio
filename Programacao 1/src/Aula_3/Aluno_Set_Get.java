
package Aula_3;

public class Aluno_Set_Get {
    // atributos devem ser identificados comencado por letras maisuclas
    String matricula,nome;
    double cr;
    
    // metodos devem ser idenetificados comencado por letras minusculas
    
    ///////////////////// SETTERS /////////////////////
    public void setMatricula(String m){
        if(!m.isEmpty()){// se o parametro m NAO (!) estiver vazio
            matricula = m; // sera feita a atribuicao
        }
    }
     public void setNome(String n){
        if(!n.isEmpty()){// se o parametro n NAO (!) estiver vazio
            nome = n; // sera feita a atribuicao
        }
    }
      public void setCr(double c){
        if(c >=0 && c <=10){// se o parametro c for igual ou superior a zero ou
            // estiver abaixo de 10,
            cr = c; // sera feita a atribuicao
        }
    }
      /////////////////// GETTERS ////////////////////////
      
      public String getMatricula(){
          return matricula;// retorna matricula
      }
       public String getNome(){
          return nome;// retorna nome
      }
        public double getCr(){
          return cr;// retorna cr
      }
        
       public void imprimir(){
           // os metodos Getters foram usados aqui
           
           System.out.println("Matricula"+getMatricula());
           System.out.println("Nome"+getNome());
           System.out.println("CR"+getCr());
                   
       }
        
    
}
