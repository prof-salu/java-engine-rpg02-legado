public class FabricaOrc implements FabricaEquipamentos {
    public Arma criarArma() { return new MachadoOrc(); }
    public Armadura criarArmadura() { return new ArmaduraOrc(); }
}