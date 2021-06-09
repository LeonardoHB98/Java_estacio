package Aula_4;

public class AppLogin { 
    public static void main(String[] args) {
        ALogin lg1 = new ALogin( "carneiro5" , "123456" ); 
        System.out.println( "O seu nome é: " + lg1.getNome() );
        System.out.println( "O seu nivel de acesso é: " + lg1.getNivelAcesso() );
        ALogin lg2 = new ALogin( "kkk" , "000000" );
        System.out.println( "O seu nome é: " + lg2.getNome() );
        System.out.println( "O seu nivel de acesso é: " + lg2.getNivelAcesso() ); 
    }
}