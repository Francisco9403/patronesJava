package observer;

/**
 * -------------------------------------------------------------------------
 * 1. LA INTERFAZ DEL OBSERVADOR (Observer)
 * -------------------------------------------------------------------------
 *
 * Define el "contrato" que debe cumplir cualquier clase que quiera
 * recibir notificaciones.
 *
 * Es la interfaz del "suscriptor".
 */
public interface MyObserver {
    /**
     * Este es el método que el "Sujeto" (MyObservable) llamará
     * cuando ocurra un evento.
     * Es la "notificación" que recibe el observador.
     */
    void update();
}