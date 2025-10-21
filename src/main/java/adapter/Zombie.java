package adapter;

/**
 * -------------------------------------------------------------------------
 * 2. LA CLASE A ADAPTAR (Adaptee)
 * -------------------------------------------------------------------------
 *
 * Esta es la clase "incompatible".
 * Es una clase que ya existe (quizás de una librería de terceros
 * o código heredado) y que quieres hacer funcionar en tu sistema.
 *
 * ¡Observa que sus métodos NO coinciden con la interfaz 'Enemy'!
 * (Ej: tiene 'bite()' y 'hit()' en lugar de 'attack()').
 *
 * Esta clase no sabe nada de 'Enemy' y no debemos (o no podemos)
 * modificarla.
 */
public class Zombie {

    public void bite(){
        System.out.println("zombie bites");
    }

    public void hit(){
        System.out.println("zombie hit");
    }

    public void headDamage(){
        System.out.println("head damage!!");
    }

    public void bodyDamage(){
        System.out.println("body damage!!");
    }
}