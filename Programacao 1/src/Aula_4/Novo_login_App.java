
package Aula_4;

public class Novo_login_App {

public static void main( String[] args ) {

// TODO Auto-generated method stub

Novo_Login lg1 = new Novo_Login( "carneiro5" , "123456" );

System.out.println( "O seu nome é: " + lg1.getNome() );

System.out.println( "O seu nivel de acesso é: " + lg1.getNivelAcesso());


Novo_Login lg2 = new Novo_Login( "kkk" , "000000" );

System.out.println( "O seu nome é: " + lg2.getNome() );

System.out.println( "O seu nivel de acesso é: " + lg2.getNivelAcesso() );


Novo_Login lg3 = new Novo_Login( "pereira" , "246810" , 2000 );

System.out.println( "O seu nome é: " + lg3.getNome());

System.out.println( "O seu nivel de acesso é: " + lg3.getNivelAcesso() );

}

}
