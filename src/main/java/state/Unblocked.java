package state;

/**
 * -------------------------------------------------------------------------
 * 3. ESTADO CONCRETO (Concrete State)
 * -------------------------------------------------------------------------
 *
 * Implementa el comportamiento del estado "Unblocked".
 */
public class Unblocked implements MissionState {

    @Override
    public void next(Mission mission) {
        // Lógica de transición:
        // Después de "Unblocked", la misión pasa a "Progress".
        mission.setState(new Progress());
    }

    @Override
    public String print() {
        return " is unblocked";
    }
}