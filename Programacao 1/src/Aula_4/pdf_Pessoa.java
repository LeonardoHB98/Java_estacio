
package Aula_4;


public class pdf_Pessoa {
    String nome,identidade;
    int idade;
            public pdf_Pessoa(String nome, String identidade, int idade){//metodo construtor
                setNome(nome);
                setIdentidade(identidade);
                setIdade(idade);
                
            }
            /////NOME//////
            public String getNome(){
                return nome;
            }
            public void setNome(String no){
                if(!no.isEmpty()){
                    nome = no;
                }
            }
            ///IDENTIDADE////
            public String getIdentidade(){
                return identidade;
            }
            public void setIdentidade(String id){
                if(!id.isEmpty()){
                    identidade = id;
                }
            }
            /////// IDADE ///////
             public String getIdade(){
                return nome;
            }
            public void setIdade(int ida){
                if(ida >=0){
                    idade = ida;
                }
            }
            public void imprimir(){
                System.out.println("Pessoa");
                System.out.println("Nome = "+nome);
                System.out.println("Identidade  = "+identidade);
                System.out.println("Idade = "+idade);
                
            }
}
