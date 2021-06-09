
package Aula_3;
import java.util.Scanner;

public class Celular {
    String marca,modelo,processador,cartaoMemoria;
    int peso,memoriaRam,armaInterno;
    double tamanhoTela;
    
    ////////////////// sets ////////////////
    public void setMarca(String m){
        if(!m.isEmpty()){
            marca=m;
        }
   }
    public void setModelo(String Mo){
        if(!Mo.isEmpty()){
            modelo=Mo;
        }
   }
    public void setProcessador(String p){
        if(!p.isEmpty()){
            processador=p;
        }
   }
    public void setCM(String cm){
        if(!cm.isEmpty()){
            cartaoMemoria=cm;
        }
   }
    
    public void setPeso(int Pe){
        if(Pe >=0){
            peso=Pe;
        }
   }
     public void setMemoriaRam(int ram){
        if(ram >=0){
            memoriaRam=ram;
        }
   }
     public void setArmaInter(int hd){
        if(hd >=0){
            armaInterno=hd;
        }
   }
      public void setTela(double t){
        if(t >=0 && t <=7){
            tamanhoTela=t;
        }else{
            System.out.println("Tamanho da tela maior que o permitido");
        }
   }
    
    ////////////////////////// GETS///////////////////////////
    
    public String getMarca(){
        return marca;
    }
     public String getModelo(){
        return modelo;
    }
      public String getProcessador(){
        return processador;
    }
       public String getCM(){
        return cartaoMemoria;
    }
        public int getPeso(){
        return peso;
    }
        public int getMemoriaRam(){
        return memoriaRam;
    } 
      public int getArmaInter(){
        return armaInterno;
    }
     public double getTela(){
        return tamanhoTela;
    }
         
         
     
     public void entradaDados(){
         Scanner entrada = new Scanner(System.in);
         System.out.println("Digite o modelo do celular");
         setModelo(entrada.nextLine());
         System.out.println("Digite a marca do celular");
         setMarca(entrada.nextLine());
         System.out.println("Digite o processador do celular");
         setMarca(entrada.nextLine());
         System.out.println("Digite o peso do celular");
         setPeso(entrada.nextInt());
         System.out.println("Digite a ram do celular");
         setMemoriaRam(entrada.nextInt());
         System.out.println("Digite o armazenamento interno do celular");
         setArmaInter(entrada.nextInt());
         System.out.println("Digite o tamanho da tela do celular");
         setTela(entrada.nextDouble());
         
     }
     public void mostraDados(){
        System.out.println("O modelo do primeiro celular eh: "+getModelo());
        System.out.println("A marca do primeiro celular eh:"+getProcessador()+"\n");
        System.out.println("A marca do primeiro celular eh:"+getCM()+"\n");
        System.out.println("A marca do primeiro celular eh:"+getPeso()+"\n");
        System.out.println("A marca do primeiro celular eh:"+getMemoriaRam()+"\n");
        System.out.println("A marca do primeiro celular eh:"+getArmaInter()+"\n");
        System.out.println("A marca do primeiro celular eh:"+getTela()+"\n");
      
        
     }
}
