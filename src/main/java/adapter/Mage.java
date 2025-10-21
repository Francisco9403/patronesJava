package adapter;

/**
 * -------------------------------------------------------------------------
 * (Clase de Servicio Estándar)
 * -------------------------------------------------------------------------
 *
 * Esta es una clase "nativa" de tu sistema.
 * Implementa la interfaz 'Enemy' directamente, por lo que es
 * 100% compatible con el cliente.
 *
 * No forma parte del patrón en sí, pero establece el "estándar".
 */
public class Mage implements Enemy{
    @Override
    public void attack() {
        System.out.println("mage attack!!");
    }

    @Override
    public void damage() {
        System.out.println("mage damage!!");
    }
}