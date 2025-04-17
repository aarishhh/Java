public class Q73_Greeter {
    void Greet() {
        System.out.println("Hello, World!");
    }

    void Greet(String Name) {
        System.out.println("Hello, " + Name + "!");
    }

    void Greet(String Name, int Age) {
        System.out.println("Hello, " + Name + "! You Are " + Age + " Years Old.");
    }

    public static void main(String[] args) {
        Q73_Greeter Obj = new Q73_Greeter();
        Obj.Greet();
        Obj.Greet("Aarish");
        Obj.Greet("Aarish", 18);
    }
}
