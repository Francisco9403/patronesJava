package composite;

/**
 * -------------------------------------------------------------------------
 * 4. EL CLIENTE (Client)
 * -------------------------------------------------------------------------
 *
 * El Cliente es el código que utiliza la estructura del Composite.
 *
 * LA VENTAJA PRINCIPAL (TRANSPARENCIA):
 * Nota cómo el cliente trata a 'inventory' (un Compuesto),
 * 'bagCoins' (otro Compuesto) y 'blade' (una Hoja) de la misma manera
 * a través de la interfaz 'BaseItem'.
 *
 * No necesita hacer: if (item instanceof Bag) { ... } else if (item instanceof Item) { ... }
 *
 * Simplemente construye el árbol y llama a la operación (getValue())
 * en el nodo raíz.
 */
public class TestComposite {
    public static void main(String[] args) {

        // 1. Creamos la raíz de nuestro árbol (un Compuesto)
        BaseItem inventory = new Bag("inventory");

        // 2. Creamos dos sub-ramas (otros Compuestos)
        BaseItem bagCoins = new Bag("bag coins");
        BaseItem bagPotions = new Bag("bag potions");

        // 3. Creamos las Hojas (Items individuales)

        // Hojas para la bolsa de monedas
        BaseItem coins = new Item("coins", 6);
        bagCoins.add(coins); // Añadimos la hoja a su compuesto

        // Hojas para la bolsa de pociones
        BaseItem magicPotion = new Item("Magic potion", 3);
        BaseItem healthPotion = new Item("Health potion", 3);
        bagPotions.add(magicPotion);
        bagPotions.add(healthPotion);

        // Hojas sueltas en el inventario
        BaseItem blade = new Item("blade", 3);
        BaseItem shield = new Item("shield", 3);
        BaseItem armor = new Item("armor", 3);

        // 4. Construimos el árbol final
        // El inventario raíz contiene:
        inventory.add(bagCoins);    // Un compuesto
        inventory.add(bagPotions);  // Otro compuesto
        inventory.add(blade);       // Una hoja
        inventory.add(shield);      // Una hoja
        inventory.add(armor);       // Una hoja

        /*
         * La estructura del árbol es:
         *
         * [inventory] (Bag)
         * ├── [bag coins] (Bag)
         * │    └── [coins] (Item, 6)
         * ├── [bag potions] (Bag)
         * │    ├── [Magic potion] (Item, 3)
         * │    └── [Health potion] (Item, 3)
         * ├── [blade] (Item, 3)
         * ├── [shield] (Item, 3)
         * └── [armor] (Item, 3)
         */

        // 5. ¡LA MAGIA DEL PATRÓN!
        // El cliente solo tiene que llamar a getValue() en el nodo raíz.
        // No necesita saber cómo está compuesto el inventario por dentro.
        // La recursividad del patrón se encarga de todo.
        System.out.println("Inventory total value: " + inventory.getValue());

        // Total esperado: 6 + 3 + 3 + 3 + 3 + 3 = 21
    }
}