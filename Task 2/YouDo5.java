class Printer {
    
    void printData(String text) {
        System.out.println("String data: " + text);
    }

    
    void printData(int number) {
        System.out.println("Integer data: " + number);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Printer p = new Printer();
        p.printData("Hello World");
        p.printData(101);
    }
}
