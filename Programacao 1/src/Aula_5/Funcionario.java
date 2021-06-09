package Aula_5;

import java.util.Scanner;

public class Funcionario {

String identidade, nome, matricula, setor, nomeGerente;

double salario;

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

public Funcionario() { }

public Funcionario(String id) {

setIdentidade(id);

}

public Funcionario(double sa) {

setSalario(sa);

}

public Funcionario(String id, double sa) {

setIdentidade(id);

setSalario(sa);

}

public Funcionario(double sa, String id) {

setIdentidade(id);

setSalario(sa);

}

public Funcionario(String id, String no, String ma, double sa, String se, String ng) {

setIdentidade(id);

setNome(no);

setMatricula(ma);

setSalario(sa);

setSetor(se);

setNomeGerente(ng);

}

public void cadastrar(String id, String no, String ma, double sa, String se, String ng) {

setIdentidade(id);

setNome(no);

setMatricula(ma);

setSalario(sa);

setSetor(se);

setNomeGerente(ng);

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

System.out.println("Setor :");

setSetor(entrada.nextLine());

System.out.println("Nome Gerente:");

setNomeGerente(entrada.nextLine());

}

public void imprimir() {

System.out.println("Identidade :" + getIdentidade());

System.out.println("Nome :" + getNome());

System.out.println("Matrídula :" + getMatricula());

System.out.println("Salário :" + getSalario());

System.out.println("Setor :" + getSetor());

System.out.println("Nome Gerente:" + getNomeGerente());

}

}