// Klasa Laptop - klasa dziedzicząca po klasie Item zawierająca informacje o
// marce. Powinna zawierać odpowiedni konstruktor oraz przeciążone metody equals
// i toString.

public class Laptop extends Item {
    private String mark;

    Laptop(int vol, String id, String mark) {
        super(id, vol);
        this.mark = mark;
    }

    Laptop(Laptop laptop) {
        super(laptop);
        this.mark = laptop.mark;
    }

    public String toString() {
        return "[Laptop] mark: " + mark + super.toString();

    }

    public boolean equals(Laptop obj) {
        super.equals(obj);

        Laptop item = (Laptop) obj;
        if (this.mark.equals(item.mark))
            return true;
        else
            return false;
    }
}