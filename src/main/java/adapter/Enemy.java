package adapter;

/**
 * -------------------------------------------------------------------------
 * 1. LA INTERFAZ OBJETIVO (Target Interface)
 * -------------------------------------------------------------------------
 *
 * Esta es la interfaz que el "Cliente" (TestAdapter) conoce y espera.
 * Define el conjunto de métodos estándar que tu sistema utiliza
 * para interactuar con todos los enemigos.
 *
 * Es el "enchufe estándar" de tu sistema.
 */
public interface Enemy {

    void attack();
    void damage();
}