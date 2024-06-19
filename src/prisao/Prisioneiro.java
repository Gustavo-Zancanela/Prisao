
package prisao;

public class Prisioneiro {
    public String nome;
    public double altura;
    public int sentenca;
    
    public void Cadastro(String nome, double altura, int sentenca)// cadastra o nome, a altura e o tempo de prisao
    {
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Sentença: " + sentenca + " anos");
        System.out.println();
    }
    
    public void Pensar()//comportamento de um prisioneiro
    {
        System.out.println("Terei minha vingança.");
    }
}
