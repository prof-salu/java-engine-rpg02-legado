// 1. Implementa a interface Cloneable nativa do Java
public class Goblin implements Cloneable {
    private String nome;
    private int vida;

    public Goblin() {
        this.nome = "Goblin Básico";
        this.vida = 100;
        try {
            Thread.sleep(10); // Construtor lento e custoso
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // 2. Sobrescreve o método clone para retornar a cópia
    @Override
    public Goblin clone() {
        try {
            return (Goblin) super.clone(); // Mitose (Cópia exata em milissegundos)
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public void exibir() { System.out.println("Monstro: " + nome + " | Vida: " + vida); }
}