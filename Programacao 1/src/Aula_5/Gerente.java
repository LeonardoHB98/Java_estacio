package Aula_5;
import java.util.Scanner;

public class Gerente {

String identidade, nome, matricula;

double salario, percentualVenda;

int nivelGerente;

public String getIdentidade() {

return identidade;

}

public void setIdentidade(String id) {

if (!id.isEmpty()) {

identidade = id;

}

}

public String getNome() {

return nome;

}

public void setNome(String no) {

if (!no.isEmpty()) {

nome = no;

}

}

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

public Gerente() { }

public Gerente(String id) {

setIdentidade(id);

}

public Gerente(double sa) {

setSalario(sa);

}

public Gerente(String id, double sa) {

setIdentidade(id);

setSalario(sa);

}

public Gerente(double sa, String id) {

setIdentidade(id);

setSalario(sa);

}

public Gerente(String id, String no, String ma, double sa, double pv, int ng) {

setIdentidade(id);

setNome(no);

setMatricula(ma);

setSalario(sa);

setPercentualVenda(pv);

setNivelGerente(ng);

}

public void cadastrar(String id, String no, String ma, double sa, double pv, int ng) {

setIdentidade(id);

setNome(no);

setMatricula(ma);

setSalario(sa);

setPercentualVenda(pv);

setNivelGerente(ng);

}

public void entradaDados() {

Scanner entrada = new Scanner(System.in);

System.out.println("Identidade :");

setIdentidade(entrada.nextLine());

System.out.println("Nome :");

setNome(entrada.nextLine());

System.out.println("Matrídula :");

setMatricula(entrada.nextLine());

System.out.println("Salário :");

setSalario(Double.parseDouble(entrada.nextLine()));

System.out.println("Percentual de Venda:");

setPercentualVenda(Double.parseDouble(entrada.nextLine()));

System.out.println("Nível Gerencia :");

setNivelGerente(Integer.parseInt(entrada.nextLine()));

entrada.close();

}

public void imprimir() {

System.out.println("Identidade :" + getIdentidade());

System.out.println("Nome :" + getNome());

System.out.println("Matrídula :" + getMatricula());

System.out.println("Salário :" + getSalario());

System.out.println("Percentual de Venda:" + getPercentualVenda());

System.out.println("Nível Gerencia :" + getNivelGerente());

}

}