package state;

/**
 * -------------------------------------------------------------------------
 * 2. EL CONTEXTO (Context)
 * -------------------------------------------------------------------------
 *
 * Esta es la clase principal cuyo comportamiento cambia según su estado.
 * Mantiene una referencia (la variable 'state') a uno de los objetos
 * de estado concreto.
 */
public class Mission {
    private String name;

    /**
     * Esta es la referencia al estado actual.
     * ¡Es el corazón del patrón!
     */
    private MissionState state;

    public Mission(String name) {
        this.name = name;
        // Definimos el estado INICIAL de cualquier misión nueva.
        // Toda misión empieza como "Blocked".
        state = new Blocked();
    }

    /**
     * ¡Este es el método clave que delega!
     * Nota que la clase Mission NO tiene lógica 'if/else' aquí.
     * Simplemente le pasa la responsabilidad a su objeto 'state' actual.
     *
     * El cliente (TestState) solo llamará a este método.
     */
    public void next(){
        state.next(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MissionState getState() {
        return state;
    }

    /**
     * Este 'setter' es crucial.
     * Es el método que los objetos de ESTADO usan para cambiar
     * el estado del CONTEXTO.
     * (Ej: 'Blocked' llamará a setState(new Unblocked()) ).
     */
    public void setState(MissionState state) {
        this.state = state;
    }

    /**
     * Sobreescribimos toString() para mostrar el estado actual.
     * Nota que también delega la descripción al objeto 'state'.
     */
    @Override
    public String toString() {
        return getName() + state.print();
    }
}