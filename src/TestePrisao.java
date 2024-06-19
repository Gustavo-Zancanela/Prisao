

import prisao.Prisioneiro;

public class TestePrisao {

   
    public static void main(String[] args) {
        Prisioneiro bubba = new Prisioneiro();//prisioneiro 1
        bubba.Cadastro("Bubba", 2.08, 4);
        
        
        Prisioneiro twitch = new Prisioneiro(); //prisioneiro 2
        twitch.Cadastro("Twitch", 1.73, 3);
        
      
        if(bubba == twitch) //teste para que nao sejam confundidos
        {
            System.out.println("São iguais");
        }
            else
        {
            System.out.println("Não são iguais");
        }
        
        bubba = twitch;//atribuicao para serem iguais
        
        if (bubba == twitch)// teste de igualdade
        {
           System.out.println("São iguais");
        }
            else
        {
            System.out.println("Não são iguais");
        }
       
       
    }
    
}
