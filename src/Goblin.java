public class Goblin {
    private String nome;
    private int vida;

    // ERRO: Construtor extremamente pesado.
    // Fazer 'new' nisto muitas vezes vai congelar o jogo.
    public Goblin() {
        this.nome = "Goblin Básico";
        this.vida = 100;

        try {
            // Simula o carregamento de Inteligência Artificial e Texturas 3D
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void exibir() {
        System.out.println("Monstro: " + nome + " | Vida: " + vida);
    }
}