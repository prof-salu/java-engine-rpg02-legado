import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeArvores {
    // O Cache de texturas
    private static Map<String, TipoArvore> tipos = new HashMap<>();

    public static TipoArvore getTipoArvore(String textura) {
        TipoArvore tipo = tipos.get(textura);
        if (tipo == null) {
            tipo = new TipoArvore(textura);
            tipos.put(textura, tipo);
        }
        return tipo;
    }
}