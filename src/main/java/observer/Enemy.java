package observer;

/**
 * -------------------------------------------------------------------------
 * (Clase de Dominio - No es parte estructural del Patrón)
 * -------------------------------------------------------------------------
 *
 * Esta es una clase base para tu lógica de negocio (el juego).
 * Ayuda a definir qué es un "Enemigo" y evita duplicar
 * código como 'name' y 'active' en todas las clases de personajes.
 */
public abstract class Enemy {

    private String name;
    private boolean active;

    public Enemy(String name) {
        this.name = name;
    }

    public abstract void attack();
    public abstract void activate();

    // Getters y Setters...
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
}