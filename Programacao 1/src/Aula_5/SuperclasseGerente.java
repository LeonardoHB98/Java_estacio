
package Aula_5;
import java.util.Scanner;

    public class SuperclasseGerente extends SuperclassePessoaEmpresa {
        double percentualVenda;
        int nivelGerente;

    public double getPercentualVenda() {
        return percentualVenda;
    }

    public void setPercentualVenda(double pv) {
        if (pv >= 0) {
        percentualVenda = pv;
        }
    }

    public int getNivelGerente() {
        return nivelGerente;
    }

    public void setNivelGerente(int ng) {
        if (ng >= 0) {
        nivelGerente = ng;
        }
    }
    
// CONSTRUTORES
    
    public SuperclasseGerente() { }

    public SuperclasseGerente(String id) {
        super(id);
    }

    public SuperclasseGerente(double sa) {
        super(sa);
    }

    public SuperclasseGerente(String id, double sa) {
        super(id, sa);
    }
    
    public SuperclasseGerente(double sa, String id) {
        super(id, sa);
    }
    public SuperclasseGerente(String id, String no, String ma, double sa, double pv, int ng) {
        super(id, no, ma, sa);
        setPercentualVenda(pv);
        setNivelGerente(ng);
    }

    public void cadastrar(String id, String no, String ma, double sa, double pv, int ng) {
        super.cadastrar(id, no, ma, sa);
        setPercentualVenda(pv);
        setNivelGerente(ng);
    }

    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Percentual de Venda:");
        setPercentualVenda(Double.parseDouble(entrada.nextLine()));
        System.out.println("Nível Gerencia :");
        setNivelGerente(Integer.parseInt(entrada.nextLine()));
        entrada.close();
    }
    public void imprimir() {
        super.imprimir();
        System.out.println("Percentual de Venda:" + getPercentualVenda());
        System.out.println("Nível Gerencia :" + getNivelGerente());
    }
}
