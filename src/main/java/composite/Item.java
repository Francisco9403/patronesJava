package composite;

/**
 * -------------------------------------------------------------------------
 * 2. LA HOJA (Leaf)
 * -------------------------------------------------------------------------
 *
 * Representa el objeto individual, el final de la jerarquía (una rama).
 * Una "Hoja" no puede tener hijos.
 *
 * Implementa la interfaz del Componente (BaseItem).
 */
public class Item extends BaseItem {

    public Item(String name, int value) {
        super(name, value);
        // Nota: La lista 'items' de BaseItem aquí será 'null',
        // porque un Item individual no la necesita.
    }

    /**
     * Implementación de add() para una Hoja.
     * Como una Hoja no puede tener hijos, esta operación no tiene sentido.
     * * Simplemente imprimimos un mensaje o no hacemos nada.
     * Esto es necesario para cumplir con el "contrato" de BaseItem
     * (el diseño transparente).
     */
    @Override
    public void add(BaseItem baseItem) {
        System.out.println("Operación no permitida: no se pueden añadir ítems a un 'Item' simple.");
    }

    /**
     * Implementación de delete() para una Hoja.
     * Misma lógica que add(): no aplica para una Hoja.
     */
    @Override
    public void delete(BaseItem baseItem) {
        System.out.println("Operación no permitida: no se pueden quitar ítems de un 'Item' simple.");
    }

    /**
     * ¡Esta es la clave de la Hoja!
     * Es el CASO BASE de la recursividad.
     * * Cuando se le pregunta su valor, la Hoja simplemente devuelve su
     * propio valor y la llamada termina. No delega a nadie más.
     */
    @Override
    public int getValue() {
        // System.out.println("Calculando valor del item: " + name + " = " + value); // Descomenta para depurar
        return value;
    }
}