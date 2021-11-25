public class Main {
    public static void main(String[] args) {
        Item book1 = new Book(20, "Book1", "Wyspiański", "Wesle");
        Item book2 = new Book(40, "Book2", "Mickiewicz", "Pan Tadeusz");
        Item book3 = new Book(40, "Book3", "Sienkiewicz", "Krzyżacy");
        System.out.println(book1);

        Item laptop1 = new Laptop(1000, "Laptop1", "Dell");
        Item laptop2 = new Laptop(40, "Laptop2", "Lenovo");
        Item laptop3 = new Laptop(40, "Laptop3", "Lenovo");
        System.out.println(laptop1);

        System.out.println();

        Laptop laptop1Copy = new Laptop((Laptop) laptop1);
        System.out.println("laptop1.equals(laptop1Copy): " + laptop1.equals(laptop1Copy));
        System.out.println("laptop2.equals(laptop3): " + laptop2.equals(laptop3));

        Book book1Copy = new Book((Book) book1);
        System.out.println("book1.equals(book1Copy): " + book1.equals(book1Copy));
        System.out.println("book2.equals(book3): " + book2.equals(book3));

        System.out.println();

        Box box1 = new Box(1, "Box1", 100);
        box1.addItem(box1);
        box1.addItem(book1);
        box1.addItem(book2);
        box1.addItem(book3);
        box1.addItem(laptop1);
        System.out.println(box1);
        System.out.println("Box1 used capacity: " + box1.getUsedCapacity());

        System.out.println();

        Box box1Copy = new Box(box1);

        System.out.println("box1.equals(box1Copy): " + box1.equals(box1Copy));
        System.out.println("box1.equals(laptop1): " + box1.equals(laptop1));

        System.out.println();

        box1.removeItem(book1);
        System.out.println(box1Copy);

        System.out.println();

        Box box2 = new Box(1, "Box2", 250);
        box2.addItem(box1);
        box2.addItem(laptop1);
        box2.addItem(laptop2);
        box2.addItem(laptop3);
        System.out.println(box2);
        System.out.println("Box2 used capacity: " + box2.getUsedCapacity());

        System.out.println();

        Box test1 = new Box(1, "Box1Test", 1000);
        Box test2 = new Box(1, "Box2Test", 1000);
        test1.addItem(test2);
        test2.addItem(test1);

        System.out.println();

        box1.removeItem(book1);
        System.out.println(box2);
        Box box3 = new Box(1, "Box3", 250);
        box3.addItem(box2);
        box3.removeItem(book2);
        System.out.println(box3);

        System.out.println();

        Box box3Copy = new Box(box3);
        box3.removeItem(book3);
        System.out.println(box3Copy);

        System.out.println();

        System.out.println("box3.containsItem(laptop2): " + box3.containsItem(laptop2));
        System.out.println("box3.containsItem(book3): " + box3.containsItem(book3));
        System.out.println("box3.containsItem(box1): " + box3.containsItem(box1));
        System.out.println("box3.containsItem(book1): " + box3.containsItem(book1));
    }
}
// Przykładowe działanie programu:

// [Book] author: Wyspiański, title: Wesle, ID: Book1, volume: 20
// [Laptop] mark: Dell, ID: Laptop1, volume: 1000
// laptop1.equals(laptop1Copy): true
// laptop2.equals(laptop3): false
// book1.equals(book1Copy): true
// book2.equals(book3): false

// Cannot put box in same box?
// Cannot add more items to the box
// [Box] capacity: 100, items:[
// [Book] author: Wyspiański, title: Wesle, ID: Book1, volume: 20,
// [Book] author: Mickiewicz, title: Pan Tadeusz, ID: Book2, volume: 40,
// [Book] author: Sienkiewicz, title: Krzyżacy, ID: Book3, volume: 40
// ], ID: Box1, volume: 1
// Box1 used capacity: 100

// box1.equals(box1Copy): true
// box1.equals(laptop1): false

// [Box] capacity: 100, items:[
// [Book] author: Wyspiański, title: Wesle, ID: Book1, volume: 20,
// [Book] author: Mickiewicz, title: Pan Tadeusz, ID: Book2, volume: 40,
// [Book] author: Sienkiewicz, title: Krzyżacy, ID: Book3, volume: 40
// ], ID: Box1, volume: 1

// Cannot add more items to the box
// [Box] capacity: 250, items:[
// [Box] capacity: 100, items:[
// [Book] author: Mickiewicz, title: Pan Tadeusz, ID: Book2, volume: 40,
// [Book] author: Sienkiewicz, title: Krzyżacy, ID: Book3, volume: 40
// ], ID: Box1, volume: 1,
// [Laptop] mark: Lenovo, ID: Laptop2, volume: 40,
// [Laptop] mark: Lenovo, ID: Laptop3, volume: 40
// ], ID: Box2, volume: 1
// Box2 used capacity: 161

// Cannot put this box into a box when a box is in this box?

// [Box] capacity: 250, items:[
// [Box] capacity: 100, items:[
// [Book] author: Mickiewicz, title: Pan Tadeusz, ID: Book2, volume: 40,
// [Book] author: Sienkiewicz, title: Krzyżacy, ID: Book3, volume: 40
// ], ID: Box1, volume: 1,
// [Laptop] mark: Lenovo, ID: Laptop2, volume: 40,
// [Laptop] mark: Lenovo, ID: Laptop3, volume: 40
// ], ID: Box2, volume: 1
// [Box] capacity: 250, items:[
// [Box] capacity: 250, items:[
// [Box] capacity: 100, items:[
// [Book] author: Sienkiewicz, title: Krzyżacy, ID: Book3, volume: 40
// ], ID: Box1, volume: 1,
// [Laptop] mark: Lenovo, ID: Laptop2, volume: 40,
// [Laptop] mark: Lenovo, ID: Laptop3, volume: 40
// ], ID: Box2, volume: 1
// ], ID: Box3, volume: 1

// [Box] capacity: 250, items:[
// [Box] capacity: 250, items:[
// [Box] capacity: 100, items:[
// [Book] author: Sienkiewicz, title: Krzyżacy, ID: Book3, volume: 40
// ], ID: Box1, volume: 1,
// [Laptop] mark: Lenovo, ID: Laptop2, volume: 40,
// [Laptop] mark: Lenovo, ID: Laptop3, volume: 40
// ], ID: Box2, volume: 1
// ], ID: Box3, volume: 1

// box3.containsItem(laptop2): true
// box3.containsItem(book3): false
// box3.containsItem(box1): true
// box3.containsItem(book1): false
