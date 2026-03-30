public class Arvore {
    private int x;
    private int y;

    // ERRO: Estado Intrínseco gigante que é duplicado para CADA árvore instanciada.
    private String textura50MB;

    public Arvore(int x, int y, String textura50MB) {
        this.x = x;
        this.y = y;
        this.textura50MB = textura50MB;
    }

    public void renderizar() {
        // System.out.println("Renderizando árvore em (" + x + "," + y + ") com textura de 50MB.");
    }
}