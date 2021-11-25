import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

// Klasa Box - klasa dziedzicząca po klasie Item umożliwiająca przechowywanie
// przedmiotów. Zawiera informacje o maksymalnej pojemności, odpowiednie
// konstruktory, publiczne metody umożliwiające dodawanie i usuwanie przedmiotów
// oraz przeciążone metody equals i toString.
// Dodatkowe informacje o klasie Box:

// Dodanie przedmiotu nie powinno być możliwe, jeśli nie ma na to miejsca.
// Pudełko nie może być dodane do samego siebie.
// Konstruktor kopiujący powinien kopiować - po usunięciu przedmiotu z
// oryginału, w kopi powinien ten przedmiot dalej być.
// Można dodać pudełko do pudełka
// Metoda usuwania przedmiotów powinna również przeszukać

// wewnętrzne pudełka (tak samo metoda sprawdzająca czy dany przedmiot jest w
// pudełku)
// Pudełko a nie może być jednocześnie w pudełku b i zawierać pudełka b
// Do przechowywania przedmiotów w pudełku można użyć dowolnej struktury danych.

public class Box extends Item {
    private int capacity;
    private int freeCapacity;

    private List<Item> list = new ArrayList<>();

    Box(int volume, String item, int capacity) {
        super(item, volume);
        this.capacity = capacity;
        freeCapacity = capacity;
    }

    Box(Box box) {
        super(box);
        this.capacity = box.capacity;
        list = new ArrayList<>(box.list);
    }

    public void addItem(Item item) {
        if (equals(item))
        System.out.println("Cannot put box in same box?");
        else if ((freeCapacity - item.getVolume()) < 0)
            System.out.println("Cannot add more items to the box");
        else {
            if (item.getClass().equals(getClass())){
                Box box = (Box) item;
                if(((Box)item).list.contains(this))
                    System.out.println("Cannot put this box into a box when a box is in this box?");
                else if((this.freeCapacity  - box.getUsedCapacity() - item.getVolume())>=0){
                this.freeCapacity -= (item.getVolume()+box.getUsedCapacity());
                list.add(item);
                }
            }
            else{
            freeCapacity -= item.getVolume();
            list.add(item);
            }
        }
    }

    public void removeItem(Item item) {
        if (list.contains(item)) {
            list.remove(item);
            this.freeCapacity += item.getVolume();
        }
    }

    public int getUsedCapacity() {
        return capacity-freeCapacity;
    }

    public boolean containsItem(Item item) {
        if (list.contains(item))
            return true;

        for(var el: list){
            if(el.getClass()==(getClass()))
                if(((Box)el).list.contains(item))
                    return true;

                if(el.equals(item))
                    return true;
                
        }
        return false;
    }


    public String toString() {
        String string = "[Box] capacity: " + capacity + ", items:"+"\n";
        for(var el: list){
            string += el + "\n";
        }
        return string + super.toString();

    }

    public boolean equals(Box obj) {
        super.equals(obj);

        Box box = (Box) obj;
        if (this.capacity == box.capacity && box.list.containsAll(list) && (list.containsAll(box.list)))
            return true;
        else
            return false;
    }
}