public class FabricaElfo implements FabricaEquipamentos {
    public Arma criarArma() { return new EspadaElfica(); }
    public Armadura criarArmadura() { return new TunicaElfica(); }
}