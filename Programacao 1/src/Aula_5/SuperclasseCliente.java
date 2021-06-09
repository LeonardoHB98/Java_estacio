
package Aula_5;
import java.util.Scanner;

 public class SuperclasseCliente extends SuperClassePessoa {
     String codigoCliente,telefone;
     int idade;
     
     public String getCodigoCliente(){
         return codigoCliente;
     }
    
     public void setCodigoCliente(String cc){
         if(!cc.isEmpty()){
             codigoCliente=cc;
         }
     }
     public String getTelefone(){
         return telefone;
     }
     public void setTelefone(String tf){
         if(!tf.isEmpty()){
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

public SuperclasseCliente() { }

public SuperclasseCliente(String id) {

super(id);

}

public SuperclasseCliente(int id) {

setIdade(id);

}

public SuperclasseCliente(String id, int ida) {

super(id);

setIdade(ida);

}

public SuperclasseCliente(int ida, String id) {

super(id);

setIdade(ida);

}

public SuperclasseCliente(String id, String no, String cc, String tf, int ida) {

super(id, no);

setCodigoCliente(cc);

setTelefone(tf);

setIdade(ida);

}

public void cadastrar(String id, String no, String cc, String tf, int ida) {

super.cadastrar(id, no);

setCodigoCliente(cc);

setTelefone(tf);

setIdade(ida);

}

public void entradaDados() {

Scanner entrada = new Scanner(System.in);

super.entradaDados();

System.out.println("Código do Cliente :");

setCodigoCliente(entrada.nextLine());

System.out.println("Telefone :");

setTelefone(entrada.nextLine());

System.out.println("Idade :");

setIdade(Integer.parseInt(entrada.nextLine()));

entrada.close();

}

    public void imprimir() {
        super.imprimir();
        System.out.println("Código do Cliente :" + getCodigoCliente());
        System.out.println("Telefone :" + getTelefone());
        System.out.println("Idade :" + getIdade());
    }
}

