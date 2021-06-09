
package Aula_4;

public class ALogin { 
    String nome;
    String nomeLogin;
    String senha; 
    int nivelAcesso; // nível de acesso do usuário ao sistema 
    
    public ALogin( String nl, String s ){
        setNivelAcesso( verificaLogin( nl, s ) );
    }
    public int verificaLogin( String nolog, String sen ){ 
        int na=0;
        if( nolog.equals("carneiro5" ) && sen.equals( "123456" ) ){
            na = 10;
            setNome( "André" ); 
        }else{
            na = 0; 
        }
        return na; 
    }
    
    public String getNome() { 
        return nome; 
    }
    public void setNome( String no ) { 
        if( !no.isEmpty() ){ 
            nome = no; 
        } 
    }
    
    public String getNomeLogin() { 
        return nomeLogin; 
    }
    public void setNomeLogin( String nl ) {
        if( !nl.isEmpty() ){ 
            nomeLogin = nl; 
        }
    }
    
    public String getSenha() { 
        return senha; 
    }
    public void setSenha( String sen ) {
        if( !sen.isEmpty() ){
            senha = sen; 
        }
    }
    
    public int getNivelAcesso() { 
        return nivelAcesso; 
    }
    public void setNivelAcesso( int na ) {
        if( na >= 0 ){ nivelAcesso = na; 
        }
    } 
}
