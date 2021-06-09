
package Aula_5;
import java.util.Scanner;
    public class SuperclasseFuncionario extends SuperclassePessoaEmpresa {
        String setor, nomeGerente;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String se) {
        if (!se.isEmpty()) {
        setor = se;
        }
    }

    public String getNomeGerente() {
        return nomeGerente;
    }
    public void setNomeGerente(String ng) {
        if (!ng.isEmpty()) {
        nomeGerente = ng;
        }
    }
    // CONSTRUTORES
    public SuperclasseFuncionario() { }

    public SuperclasseFuncionario(String id) {
        super(id);
    }

    public SuperclasseFuncionario(double sa) {
        super(sa);
    }

    public SuperclasseFuncionario(String id, double sa) {
        super(id, sa);
    }
    public SuperclasseFuncionario(double sa, String id) {
        super(id, sa);
    }
    public SuperclasseFuncionario(String id, String no, String ma, double sa, String se, String ng) {
        super(id, no, ma, sa);
        setSetor(se);
        setNomeGerente(ng);
    }
    public void cadastrar(String id, String no, String ma, double sa, String se, String ng) {
        super.cadastrar(id, no, ma, sa);
        setSetor(se);
        setNomeGerente(ng);
    }
    // metodos
    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Setor :");
        setSetor(entrada.nextLine());
        System.out.println("Nome Gerente:");
        setNomeGerente(entrada.nextLine());
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Setor :" + getSetor());
        System.out.println("Nome Gerente:" + getNomeGerente());
    }
}
