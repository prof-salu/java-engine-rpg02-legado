public class TipoArvore {
    private String textura50MB;

    public TipoArvore(String textura50MB) {
        this.textura50MB = textura50MB;
        System.out.println(">> Nova textura de 50MB carregada na memória: " + textura50MB);
    }
    public String getTextura() { return textura50MB; }
}