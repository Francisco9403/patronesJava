package observer;

/**
 * -------------------------------------------------------------------------
 * 5. EL CLIENTE (Client)
 * -------------------------------------------------------------------------
 *
 * Este es el punto de entrada que configura el sistema.
 * Su trabajo es:
 * 1. Crear el Sujeto Concreto (Vigilant).
 * 2. Crear los Observadores Concretos (Mage, Warrior).
 * 3. "Conectarlos" o "Suscribirlos" (vigilant.subscribe(...)).
 * 4. Disparar el evento (vigilant.activate()).
 */
public class TestObservable {
    public static void main(String[] args) {
        // 1. Crear los Observadores (Suscriptores)
        Warrior warrior1 = new Warrior("warrior 1");
        Warrior warrior2 = new Warrior("warrior 2");
        Mage mage1 = new Mage("mage 1");
        Mage mage2 = new Mage("mage 2");

        // 2. Crear el Sujeto (Publicador)
        Vigilant vigilant = new Vigilant("vigilant");

        // 3. Conectar los Observadores al Sujeto
        //    (El Cliente le dice al Vigilant quién lo está escuchando)
        vigilant.subscribe(warrior1);
        vigilant.subscribe(warrior2);
        vigilant.subscribe(mage1);
        vigilant.subscribe(mage2);

        // 4. Disparar el evento
        // El cliente solo llama a activate() en el Vigilant...
        // ...y el Vigilant se encarga de notificar a los 4 observadores.
        vigilant.activate();

        System.out.println("==============");

        // 5. Demostración de de-suscripción
        // El Mage 2 se "cancela la suscripción".
        vigilant.unsubscribe(mage2);

        // 6. Disparar el evento de nuevo
        // Ahora, cuando el Vigilant se active, solo notificará
        // a warrior1, warrior2 y mage1. Mage2 ya no está
        //* en la lista y no reaccionará.
        vigilant.activate();
    }
}