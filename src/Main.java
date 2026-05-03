//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello Java World!");
        Person p1 = new Person("Maria", 20);
        Person p2 = new Person("Vasile", 20);
        p1.sayHello();
        p2.sayHello();
        p1.sayAge();
        p2.sayAge();
        p1.say();
        p2.say();
        p1.setName("Maria");
        p1.setAge(20);
        System.out.println();
        System.out.println(p1.getName());
        System.out.println(p1.getAge());

    }
}