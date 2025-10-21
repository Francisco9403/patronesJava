package composite;

import java.util.List;

/**
 * -------------------------------------------------------------------------
 * 1. EL COMPONENTE (Component)
 * -------------------------------------------------------------------------
 * * Esta es la interfaz o clase abstracta que define el "contrato" común para
 * TODOS los objetos en la estructura de árbol, sin importar si son objetos
 * individuales (hojas) o colecciones (compuestos).
 *
 * El cliente (TestComposite) usará esta clase para interactuar con todos
 * los objetos de manera uniforme.
 */
public abstract class BaseItem {

    // Atributos comunes a todos los elementos (hojas y compuestos).
    protected String name;
    protected int value;

    /**
     * Esta lista de hijos es clave.
     * En esta implementación (conocida como "diseño transparente"), la
     * declaramos aquí en la clase base para maximizar la uniformidad.
     * * La desventaja: las "Hojas" (Item) también tendrán esta variable
     * en memoria, aunque no la usen.
     * La ventaja: el cliente puede llamar a add/delete en cualquier BaseItem.
     */
    protected List<BaseItem> items;

    public BaseItem(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // --- Métodos de gestión de hijos ---
    // Estos métodos son el núcleo de la "composición".
    // Los declaramos aquí para que el cliente pueda tratar a hojas
    // y compuestos por igual.

    /**
     * Añade un sub-ítem.
     * Será implementado por el Compuesto (Bag) pero no por la Hoja (Item).
     */
    public abstract void add(BaseItem baseItem);

    /**
     * Elimina un sub-ítem.
     * Será implementado por el Compuesto (Bag) pero no por la Hoja (Item).
     */
    public abstract void delete(BaseItem baseItem);


    // --- Operación Clave del Patrón ---

    /**
     * Esta es la operación principal que el cliente quiere ejecutar
     * sobre la jerarquía.
     *
     * Gracias al patrón, el cliente puede llamar a getValue() sobre un
     * solo ítem o sobre una bolsa entera (un árbol de ítems) y
     * obtendrá el resultado correcto de forma "mágica" (recursiva).
     */
    public abstract int getValue();
}