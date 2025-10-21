package observer;

/**
 * -------------------------------------------------------------------------
 * 4. EL OBSERVADOR CONCRETO (Concrete Observer)
 * -------------------------------------------------------------------------
 *
 * Es una clase que implementa la interfaz MyObserver.
 * Es un "suscriptor" que quiere recibir notificaciones.
 */
public class Mage extends Enemy implements MyObserver {

    public Mage(String name) {
        super(name);
        setActive(false); // Los magos empiezan inactivos
    }

    @Override
    public void attack() {
        System.out.println(getName() + " mage on attack!!");
    }

    @Override
    public void activate() {
        setActive(true);
        System.out.println(getName() + " mage is active");
    }

    /**
     * ¡La REACCIÓN!
     * Este es el código que se ejecutará cuando el Vigilant
     * (el Sujeto) llame a 'broadcast()'.
     *
     * En este caso, la reacción del Mago es activarse y atacar.
     */
    @Override
    public void update() {
        activate();
        attack();
    }
}