package observer;

/**
 * -------------------------------------------------------------------------
 * 4. EL OBSERVADOR CONCRETO (Concrete Observer)
 * -------------------------------------------------------------------------
 *
 * Otro "suscriptor" que reacciona a los eventos.
 * Implementa la misma interfaz 'MyObserver'.
 */
public class Warrior extends Enemy implements MyObserver {

    public Warrior(String name) {
        super(name);
        setActive(false); // Los guerreros también empiezan inactivos
    }

    @Override
    public void attack() {
        System.out.println(getName() + " warrior on attack!!");
    }

    @Override
    public void activate() {
        setActive(true);
        System.out.println(getName() + " warrior is active");
    }

    /**
     * ¡La REACCIÓN del Guerrero!
     * Cuando el Vigilant le avisa (llama a update()),
     * el Guerrero se activa y ataca.
     *
     * Podría tener una reacción diferente a la del Mago,
     * esa es la flexibilidad del patrón.
     */
    @Override
    public void update() {
        activate();
        attack();
    }
}