package Aula_5;
import java.util.Scanner;

public class Cliente {

String identidade, nome, codigoCliente, telefone;

int idade;

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

public String getCodigoCliente() {

return codigoCliente;

}

public void setCodigoCliente(String cc) {

if (!cc.isEmpty()) {

codigoCliente = cc;

}

}

public String getTelefone() {

return telefone;

}

public void setTelefone(String tf) {

if (!tf.isEmpty()) {

telefone = tf;

}

}

public int getIdade() {

return idade;

}

public void setIdade(int id) {

if (id >= 0) {

idade = id;

}

}

public Cliente() { }

public Cliente(String id) {

setIdentidade(id);

}

public Cliente(int id) {

setIdade(id);

}

public Cliente(String id, int ida) {

setIdentidade(id);

setIdade(ida);

}

public Cliente(int ida, String id) {

setIdentidade(id);

setIdade(ida);

}

public Cliente(String id, String no, String cc, String tf, int ida) {

setIdentidade(id);

setNome(no);

setCodigoCliente(cc);

setTelefone(tf);

setIdade(ida);

}

public void cadastrar(String id, String no, String cc, String tf, int ida) {

setIdentidade(id);

setNome(no);

setCodigoCliente(cc);

setTelefone(tf);

setIdade(ida);

}

public void entradaDados() {

Scanner entrada = new Scanner(System.in);

System.out.println("Identidade :");

setIdentidade(entrada.nextLine());

System.out.println("Nome :");

setNome(entrada.nextLine());

System.out.println("Código do Cliente :");

setCodigoCliente(entrada.nextLine());

System.out.println("Telefone :");

setTelefone(entrada.nextLine());

System.out.println("Idade :");

setIdade(Integer.parseInt(entrada.nextLine()));

entrada.close();

}

public void imprimir() {

System.out.println("Identidade :" + getIdentidade());

System.out.println("Nome :" + getNome());

System.out.println("Código do Cliente :" + getCodigoCliente());

System.out.println("Telefone :" + getTelefone());

System.out.println("Idade :" + getIdade());

}

}