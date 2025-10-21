package composite;

import java.util.ArrayList;

/**
 * -------------------------------------------------------------------------
 * 3. EL COMPUESTO (Composite)
 * -------------------------------------------------------------------------
 *
 * Representa un objeto que PUEDE tener hijos (un "contenedor").
 * Almacena componentes hijos (pueden ser Hojas u otros Compuestos).
 *
 * Implementa la interfaz del Componente (BaseItem), pero lo hace
 * *delegando* el trabajo a sus hijos.
 */
public class Bag extends BaseItem {

    public Bag(String name) {
        // Una bolsa en sí misma puede tener valor, pero en este ejemplo
        // su valor es 0 y solo suma el de sus hijos.
        super(name, 0);

        // ¡Importante! Inicializamos la lista de hijos.
        items = new ArrayList<>();
    }

    /**
     * Implementación de add() para un Compuesto.
     * Simplemente añade el ítem (sea Hoja o Compuesto) a su lista interna.
     */
    @Override
    public void add(BaseItem baseItem) {
        items.add(baseItem);
    }

    /**
     * Implementación de delete() para un Compuesto.
     * Elimina el ítem de su lista interna.
     */
    @Override
    public void delete(BaseItem baseItem) {
        items.remove(baseItem);
    }

    /**
     * ¡Esta es la magia y el corazón del patrón Composite!
     * Es el CASO RECURSIVO.
     * * Para calcular su valor total, el Compuesto (Bag) hace dos cosas:
     * 1. Empieza con su propio valor (si tuviera).
     * 2. Itera sobre TODOS sus hijos y les pide su valor (llamando a getValue()).
     * * Lo crucial es que NO LE IMPORTA si un 'item' en su lista es
     * un 'Item' (Hoja) o otra 'Bag' (Compuesto). Simplemente llama
     * a 'item.getValue()' gracias a la interfaz común (BaseItem).
     */
    @Override
    public int getValue() {
        // System.out.println("Calculando valor del compuesto: " + name); // Descomenta para depurar
        int result = this.value; // Empieza con el valor propio de la bolsa (0 en este caso)

        for (BaseItem item : items) {
            // DELEGACIÓN RECURSIVA:
            // Llama a getValue() en el hijo.
            // Si el hijo es un 'Item', devolverá su valor (caso base).
            // Si el hijo es otra 'Bag', esta a su vez iterará sobre sus hijos...
            // ...y así sucesivamente hasta llegar al final del árbol.
            result += item.getValue();
        }

        // Devuelve la suma total de toda su sub-jerarquía.
        return result;
    }
}