package Aula_5;

import java.util.Scanner;

public class SuperclassePessoaEmpresa extends SuperClassePessoa {
    String matricula;
    double salario;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String ma) {
        if (!ma.isEmpty()) {
            matricula = ma;
        }
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double sa) {
        if (sa >= 0) {
            salario = sa;
        }
    }
 
//METODOS CONSTRUTORES //
    public SuperclassePessoaEmpresa() { }

    public SuperclassePessoaEmpresa(String id) {
        super(id);
    }
    
    public SuperclassePessoaEmpresa(double sa) {
        setSalario(sa);
    }

    public SuperclassePessoaEmpresa(String id, double sa) {
        super(id);
        setSalario(sa);
    }

    public SuperclassePessoaEmpresa(double sa, String id) {
        super(id);
        setSalario(sa);
    }
    
    public SuperclassePessoaEmpresa(String id, String no, String ma, double sa) {
        super(id, no);
        setMatricula(ma);
        setSalario(sa);
    }

    // METODOS
    public void cadastrar(String id, String no, String ma, double sa) {
        super.cadastrar(id, no);
        setMatricula(ma);
        setSalario(sa);
    }

    public void entradaDados() {
        Scanner entrada = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Matricula :");
        setMatricula(entrada.nextLine());
        System.out.println("Salário :");
        setSalario(Double.parseDouble(entrada.nextLine()));
        entrada.close();
    }

    public void imprimir() {
        super.imprimir();
        System.out.println("Matricula :" + getMatricula());
        System.out.println("Salário :" + getSalario());
    }

}

