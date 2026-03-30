public class FogoDecorator extends DecoradorArma {
    public FogoDecorator(ItemMagico item) { super(item); }

    @Override
    public int getPoder() {
        return super.getPoder() + 5; // Soma o poder base com o poder do Fogo
    }
}