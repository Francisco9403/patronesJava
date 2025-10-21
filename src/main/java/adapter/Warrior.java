package adapter;

/**
 * -------------------------------------------------------------------------
 * (Clase de Servicio Estándar)
 * -------------------------------------------------------------------------
 *
 * Otra clase "nativa" de tu sistema, igual que Mage.
 * Es compatible desde el principio.
 */
public class Warrior implements Enemy{
    @Override
    public void attack() {
        System.out.println("warrior attack!!");
    }

    @Override
    public void damage() {
        System.out.println("warrior damage!!");
    }
}