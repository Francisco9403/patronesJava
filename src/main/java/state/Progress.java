package state;

/**
 * -------------------------------------------------------------------------
 * 3. ESTADO CONCRETO (Concrete State)
 * -------------------------------------------------------------------------
 *
 * Este es un estado más complejo.
 * Demuestra cómo la lógica de transición puede ser condicional.
 */
public class Progress implements MissionState {

    @Override
    public void next(Mission mission) {
        // Lógica de transición condicional:
        // Desde "Progress", el siguiente estado no es fijo.
        // Depende de una condición (en este caso, aleatoria).
        // Puede pasar a "Completed" o a "Failed".
        // ¡Toda esta lógica está encapsulada AQUÍ, en lugar de
        // ensuciar la clase Mission!
        if (Math.random() < 0.5)
            mission.setState(new Completed());
        else
            mission.setState(new Failed());
    }

    @Override
    public String print() {
        return " is in progress";
    }
}