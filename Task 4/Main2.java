abstract class TeamMember {
    protected String name;
    public TeamMember(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}             
interface BonusEligible {
    void calculateBonus();
}

class Employee extends TeamMember implements BonusEligible {
    public Employee(String name) {
        super(name);
    }
    public void calculateBonus(){
        System.out.println("Calculating standerd employee bonus...");
    }
}
class Contractor extends TeamMember {
    public Contractor(String name) {
        super(name);
    }
    
    public void performWork() {
        System.out.println(name + " is working as a contractor.");
    }
    
