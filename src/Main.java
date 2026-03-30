import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== MOTOR DE RPG (OTIMIZADO) ===\n");

        System.out.println("--- 1. Abstract Factory ---");
        // Recebe a fábrica correta dinamicamente. Impossível misturar itens!
        FabricaEquipamentos fabrica = new FabricaElfo();
        Arma arma = fabrica.criarArma();
        Armadura armadura = fabrica.criarArmadura();
        arma.exibir();
        armadura.exibir();
        System.out.println();

        System.out.println("--- 2. Prototype ---");
        System.out.println("A clonar monstros rapidamente...");
        long tempoInicio = System.currentTimeMillis();

        Goblin mestre = new Goblin(); // O único construtor lento chamado!
        List<Goblin> horda = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            horda.add(mestre.clone()); // Clonagem instantânea
        }

        long tempoFim = System.currentTimeMillis();
        System.out.println("1000 Goblins CLONADOS em " + (tempoFim - tempoInicio) + " ms.");
        System.out.println();

        System.out.println("--- 3. Decorator ---");
        // Composição dinâmica ao invés de herança rígida!
        ItemMagico espadaPoderosa = new FogoDecorator(new GeloDecorator(new EspadaBase()));
        System.out.println("Poder da espada combinada (Fogo + Gelo): " + espadaPoderosa.getPoder());
        System.out.println();

        System.out.println("--- 4. Flyweight ---");
        List<Arvore> floresta = new ArrayList<>();
        String texturaComum = "TEXTURA_VERDE_HD_50MB";

        for (int i = 0; i < 10000; i++) {
            // A textura é carregada na memória apenas UMA VEZ
            TipoArvore tipo = GerenciadorDeArvores.getTipoArvore(texturaComum);
            floresta.add(new Arvore(i, i, tipo));
        }
        System.out.println("Floresta criada com 10.000 árvores! (Memória RAM intacta)");
    }
}