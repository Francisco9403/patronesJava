package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * -------------------------------------------------------------------------
 * 3. EL SUJETO CONCRETO (Concrete Subject)
 * -------------------------------------------------------------------------
 *
 * Es la clase que implementa la interfaz MyObservable.
 * Esta es la clase que *será observada*.
 *
 * Nota que también es un 'Enemy', pero su rol en este patrón
 * es ser el 'MyObservable'.
 */
public class Vigilant extends Enemy implements MyObservable {

    /**
     * ¡El corazón del patrón!
     * Esta es la lista de todos los observadores que se han suscrito.
     * El Vigilant no sabe qué son (Mage, Warrior, etc.), solo
     * sabe que implementan 'MyObserver'. Esto se llama
     * "programar para la interfaz" y es clave para el desacoplamiento.
     */
    private List<MyObserver> observers = new ArrayList<>();

    public Vigilant(String name) {
        super(name);
        setActive(true);
    }

    @Override
    public void attack() {
        System.out.println(getName() + " vigilant on attack!!");
    }

    /**
     * ¡El DISPARADOR (Trigger)!
     * Este es el método de "negocio" que, al ser llamado,
     * decide que es momento de notificar a todos los observadores.
     */
    @Override
    public void activate() {
        System.out.println(getName() + " sending messages");
        // Cuando el vigilante se activa, "emite" la señal.
        broadcast();
    }

    // --- Implementación de los métodos de MyObservable ---

    /**
     * Añade un nuevo suscriptor a la lista.
     */
    @Override
    public void subscribe(MyObserver observer) {
        observers.add(observer);
    }

    /**
     * Elimina un suscriptor de la lista.
     */
    @Override
    public void unsubscribe(MyObserver observer) {
        observers.remove(observer);
    }

    /**
     * La lógica de notificación:
     * Recorre la lista de suscriptores y llama al método 'update()'
     * de cada uno.
     */
    @Override
    public void broadcast() {
        for (MyObserver observer: observers)
            observer.update();
    }
}