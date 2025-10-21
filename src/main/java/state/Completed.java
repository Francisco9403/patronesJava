package state;

/**
 * -------------------------------------------------------------------------
 * 3. ESTADO CONCRETO (Concrete State) - Estado Terminal
 * -------------------------------------------------------------------------
 *
 * Este es un "Estado Terminal".
 * Representa el final del flujo de estados.
 */
public class Completed implements MissionState {

    @Override
    public void next(Mission mission) {
        // Lógica de transición:
        // Al ser un estado terminal, llamar a next() ya no
        // cambia el estado. Simplemente informa que la misión
        // ya está completa.
        System.out.println(mission.getName() + " is completed, no next state");
    }

    @Override
    public String print() {
        return " is completed";
    }
}