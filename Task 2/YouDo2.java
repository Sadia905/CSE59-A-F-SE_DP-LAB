class NumberChecker {
    void check (int num){
        boolean condition =  (num % 2 == 0) && (num > 10);





        System.out.println("Result: " + condition);
    }
}




public class Main2 {
    public static void main(String[] args) {
        NumberChecker checker = new NumberChecker();

        checker.check(8);
        
    }
    
}
