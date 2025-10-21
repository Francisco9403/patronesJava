package observer;

/**
 * -------------------------------------------------------------------------
 * 2. LA INTERFAZ DEL SUJETO (Subject u Observable)
 * -------------------------------------------------------------------------
 *
 * Define el "contrato" para la clase que será observada
 * (la que envía las notificaciones).
 *
 * Es la interfaz del "publicador" o "canal".
 */
public interface MyObservable {
    /**
     * Permite que un observador se suscriba a las notificaciones.
     */
    void subscribe(MyObserver observer);

    /**
     * Permite que un observador cancele su suscripción.
     */
    void unsubscribe(MyObserver observer);

    /**
     * El método que el Sujeto llamará internamente para notificar
     * a TODOS sus observadores suscritos.
     * (A veces llamado 'notifyObservers').
     */
    void broadcast();
}