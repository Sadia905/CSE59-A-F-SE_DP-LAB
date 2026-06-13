class Item {
    String name;
    double price;

    // Constructor to set values on creation
    Item(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class Order {
    // Declaring two Item variables
    Item item1;
    Item item2;

    
    Order(Item item1, Item item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    
    void printBill() {
        double totalCost = item1.price + item2.price;
        System.out.println("--- Order Bill Receipt ---");
        System.out.println("Item 1: " + item1.name + " ($" + item1.price + ")");
        System.out.println("Item 2: " + item2.name + " ($" + item2.price + ")");
        System.out.println("Total Cost: $" + totalCost);
    }
}


public class Main8 {
    public static void main(String[] args) {
        
        Item mouse = new Item("Mouse", 20.0);
        Item keyboard = new Item("Keyboard", 45.0);

        
        Order customerOrder = new Order(mouse, keyboard);

        
        customerOrder.printBill();
    }
}
