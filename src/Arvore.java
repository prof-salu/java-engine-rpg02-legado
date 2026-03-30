public class Arvore {
    private int x, y;
    private TipoArvore tipo; // Referência leve para o objeto pesado compartilhado

    public Arvore(int x, int y, TipoArvore tipo) {
        this.x = x; this.y = y; this.tipo = tipo;
    }
    public void renderizar() { /* Usa this.x, this.y e tipo.getTextura() */ }
}