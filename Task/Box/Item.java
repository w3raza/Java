// Klasa Item-
// abstrakcyjna klasa
// zawierająca informacje
// dotyczące objętości
// obiektu (volume) oraz o identyfikatorze (itemId). Poza tym klasa powinna
// zawierać publiczne metody dostępu do tych danych konstruktor i przeciążone
// metody equals i toString.

abstract public class Item {
    private String itemId;
    private int volume;

    Item(String item, int volume) {
        this.itemId = item;
        this.volume = volume;
    }

    Item(Item item) {
        this.itemId = item.itemId;
        this.volume = item.volume;
    }

    public String getItemId() {
        return itemId;
    }

    public int getVolume() {
        return volume;
    }

    public String toString() {
        return ", ID: " + itemId + ", volume: " + volume;
    }

    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj == this)
            return true;
        if (!obj.getClass().equals(this.getClass()))
            return false;

        Item item = (Item) obj;

        if (this.itemId.equals(item.itemId) && this.volume == item.volume)
            return true;
        else
            return false;
    }
}