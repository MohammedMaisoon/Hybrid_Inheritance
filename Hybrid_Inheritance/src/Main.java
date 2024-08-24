/*Hybrid inheritance is a type of inheritance that combines two or more types of inheritance
(such as single, multiple, and hierarchical) is called Hybrid inheritance.*/
class Birds{
    void eat(){
        System.out.println("Birds can eat");
    }
}
class Eagle extends Birds{
    void fly(){
        System.out.println("Eagles can Fly");
    }
}
class Crow extends Eagle{
    void sing(){
        System.out.println("Crows can Sing");
    }
}
class Peacock extends Crow{
    void dance(){
        System.out.println("Peacocks can Dance");
    }
}
class Pegion extends Birds{
    void Find(){
        System.out.println("Pegions can Find Directions to go Home");
    }
}
public class Main {
    public static void main(String[] args) {
        // Object creation of Peacock
        Peacock peacock = new Peacock();
        peacock.eat();
        peacock.fly();
        peacock.sing();
        peacock.dance();
        // Object creation of Pegion
        Pegion pegion = new Pegion();
        pegion.eat();
        pegion.Find();

    }
}