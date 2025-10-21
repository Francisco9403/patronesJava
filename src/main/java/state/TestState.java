package state;

/**
 * -------------------------------------------------------------------------
 * 4. EL CLIENTE (Client)
 * -------------------------------------------------------------------------
 *
 * El código cliente que utiliza el Contexto (Mission).
 *
 * VENTAJA PRINCIPAL:
 * El cliente es súper simple. No necesita saber las reglas de
 * transición ni el estado interno de la misión.
 * Simplemente crea la misión y llama a 'mission.next()' repetidamente.
 *
 * La complejidad de los estados está 100% encapsulada
 * en las clases de estado, no aquí.
 */
public class TestState {
    public static void main(String[] args) {
        // 1. Creamos el Contexto. Empezará en estado "Blocked"
        //    (según la lógica del constructor de Mission).
        Mission mission = new Mission("Mission 1");
        System.out.println(mission); // Imprime: Mission 1 is blocked

        // 2. Transición 1: Blocked -> Unblocked
        mission.next();
        System.out.println(mission); // Imprime: Mission 1 is unblocked

        // 3. Transición 2: Unblocked -> Progress
        mission.next();
        System.out.println(mission); // Imprime: Mission 1 is in progress

        // 4. Transición 3: Progress -> ??? (Completed o Failed)
        mission.next();
        System.out.println(mission); // Imprime: "is completed" O "is failed"

        // 5. Transición 4:
        //    - Si estaba en "Completed" -> Imprime "no next state"
        //    - Si estaba en "Failed" -> Pasa a "Progress"
        mission.next();
        System.out.println(mission);

        // 6. Transición 5: ... y así sucesivamente.
        mission.next();
        System.out.println(mission);
    }
}