package state;

/**
 * -------------------------------------------------------------------------
 * 3. ESTADO CONCRETO (Concrete State)
 * -------------------------------------------------------------------------
 *
 * Implementa el comportamiento del estado "Failed".
 */
public class Failed implements MissionState {

    @Override
    public void next(Mission mission) {
        // Lógica de transición:
        // Según esta lógica de negocio, si una misión falla,
        // se puede reintentar, volviendo al estado "Progress".
        mission.setState(new Progress());
    }

    @Override
    public String print() {
        return " is failed";
    }
}