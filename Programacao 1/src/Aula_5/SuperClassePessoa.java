package Aula_5;
import java.util.Scanner;

public class SuperClassePessoa {

String identidade, nome;

//IDENTIDADE//
    public String getIdentidade() {
        return identidade;
    }
    public void setIdentidade(String id) {
        if (!id.isEmpty()) {
            identidade = id;
        }   
    }

// NOME //
    public String getNome() {
        return nome;
    }
    public void setNome(String no) {
        if (!no.isEmpty()) {
            nome = no;
        }
    }

 //METODOS CONSTRUTORES
    public SuperClassePessoa() { } // metodo construtor geral

    public SuperClassePessoa(String id) {   
        setIdentidade(id);
    }
    public SuperClassePessoa(String id, String no) {
        setIdentidade(id);
        setNome(no);
    }
    // Só podemos criar 3 construtores para a classe Pessoa

//METODOS//
    public void cadastrar(String id, String no) {
        setIdentidade(id);
        setNome(no);
    }
    
    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Identidade :");
        setIdentidade(entrada.nextLine());
        System.out.println("Nome :");
        setNome(entrada.nextLine());
        entrada.close();
    }

    public void imprimir() {
        System.out.println("Identidade :" + getIdentidade());
        System.out.println("Nome :" + getNome());
    }
}