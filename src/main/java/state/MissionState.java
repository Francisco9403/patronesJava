package state;

/**
 * -------------------------------------------------------------------------
 * 1. LA INTERFAZ DE ESTADO (State)
 * -------------------------------------------------------------------------
 *
 * Define una interfaz común para todos los estados concretos.
 * El "Contexto" (Mission) usará esta interfaz para interactuar con
 * su estado actual, sin saber (ni importarle) qué estado específico es.
 */
public interface MissionState {

    /**
     * Esta es la operación principal que cambia de un estado a otro.
     * Es la "transición" de la máquina de estados.
     *
     * @param mission Es el "Contexto". Se pasa a sí mismo para que el
     * ESTADO tenga el poder de cambiar el estado del CONTEXTO
     * (llamando a mission.setState(...)).
     */
    void next(Mission mission);

    /**
     * Una operación de ayuda para describir el estado actual.
     * El Contexto (Mission) la usará en su método toString().
     */
    String print();
}