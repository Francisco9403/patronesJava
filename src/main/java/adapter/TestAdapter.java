package adapter;

/**
 * -------------------------------------------------------------------------
 * 4. EL CLIENTE (Client)
 * -------------------------------------------------------------------------
 *
 * Este es el código de tu sistema que consume los objetos.
 */
public class TestAdapter {
    public static void main(String[] args) {

        // ¡La clave está aquí!
        // El Cliente crea un 'ZombieAdapter'.
        // Podríamos incluso escribir:
        // Enemy enemigo = new ZombieAdapter();
        //
        // El Cliente NO SABE (ni le importa) que por dentro
        // hay un objeto 'Zombie' con métodos diferentes.
        // El Cliente solo ve los métodos 'attack()' y 'damage()'
        // de la interfaz 'Enemy'.
        ZombieAdapter zombie = new ZombieAdapter();

        // El cliente trata al 'ZombieAdapter' EXACTAMENTE IGUAL
        // que trataría a un 'Mage' o a un 'Warrior'.
        zombie.attack();
        zombie.damage();

        // Gracias al patrón, has integrado exitosamente
        // la clase 'Zombie' incompatible en tu sistema
        // sin modificar ni el Cliente ni el Zombie.
    }
}