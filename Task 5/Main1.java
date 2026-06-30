// Printer interface
interface Printer {
    void printDocument();
}

// Scanner interface
interface Scanner {
    void scanDocument();
}

// FaxMachine interface
interface FaxMachine {
    void faxDocument();
}

// MultiFunctionCopier implements all three interfaces
class MultiFunctionCopier implements Printer, Scanner, FaxMachine {

    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }

    @Override
    public void scanDocument() {
        System.out.println("Scanning...");
    }

    @Override
    public void faxDocument() {
        System.out.println("Faxing...");
    }
}

// BasicPrinter only implements Printer
class BasicPrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("Printing...");
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        // Basic Printer
        BasicPrinter basicPrinter = new BasicPrinter();
        basicPrinter.printDocument();

        System.out.println();

        // MultiFunction Copier
        MultiFunctionCopier copier = new MultiFunctionCopier();
        copier.printDocument();
        copier.scanDocument();
        copier.faxDocument();
    }
}
