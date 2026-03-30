public abstract class DecoradorArma implements ItemMagico {
    protected ItemMagico itemInterno; // A arma que está "dentro" do decorador

    public DecoradorArma(ItemMagico itemInterno) {
        this.itemInterno = itemInterno;
    }

    public int getPoder() {
        return itemInterno.getPoder(); // Repassa a chamada
    }
}