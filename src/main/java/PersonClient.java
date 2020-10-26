public class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Isabella", "Smith");
        p1.doSomething();
        System.out.println(p1);
        p1.setfirstname("Bella");
        System.out.println(p1.getfirstname());