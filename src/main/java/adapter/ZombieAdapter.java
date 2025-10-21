package adapter;

/**
 * -------------------------------------------------------------------------
 * 3. EL ADAPTADOR (Adapter)
 * -------------------------------------------------------------------------
 *
 * ¡Esta es la clase mágica que conecta todo!
 * Su trabajo es ser el "traductor".
 */
public class ZombieAdapter implements Enemy{ // <-- Paso 1: Implementa la Interfaz Objetivo

    /**
     * Paso 2: Contiene (envuelve) una instancia de la clase incompatible.
     * Esto se llama "Adaptación de Objetos" (usando composición),
     * que es más flexible que usar herencia.
     */
    private Zombie zombie;

    public ZombieAdapter() {
        // Cuando creas un Adaptador, él crea la instancia
        // del objeto incompatible que va a manejar.
        this.zombie = new Zombie();
    }

    /**
     * ¡Aquí ocurre la TRADUCCIÓN!
     * El Cliente llamará a 'attack()', cumpliendo la interfaz 'Enemy'.
     * El Adaptador recibe esa llamada y la "traduce" a los métodos
     * que el 'Zombie' realmente entiende (bite() o hit()).
     *
     * Tu lógica 'if' añade valor: traduce una llamada simple (attack)
     * a una lógica más compleja.
     */
    @Override
    public void attack() {
        int value = (int) (Math.random()*10);
        if(value % 2 == 0)
            zombie.bite(); // Traduce attack() -> bite()
        else
            zombie.hit();  // Traduce attack() -> hit()
    }

    /**
     * ¡Más traducción!
     * El Cliente llama a 'damage()'.
     * El Adaptador lo traduce a 'headDamage()' o 'bodyDamage()'.
     */
    @Override
    public void damage() {
        int value = (int) (Math.random()*10);
        if(value % 2 == 0)
            zombie.headDamage(); // Traduce damage() -> headDamage()
        else
            zombie.bodyDamage(); // Traduce damage() -> bodyDamage()
    }
}