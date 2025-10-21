package state;

/**
 * -------------------------------------------------------------------------
 * 3. ESTADO CONCRETO (Concrete State)
 * -------------------------------------------------------------------------
 *
 * Implementa el comportamiento asociado con el estado "Blocked".
 */
public class Blocked implements MissionState {

    @Override
    public void next(Mission mission) {
        // Lógica de transición:
        // Si estamos en "Blocked" y alguien llama a next(),
        // el siguiente estado será "Unblocked".
        mission.setState(new Unblocked());
    }

    @Override
    public String print() {
        return " is blocked";
    }
}