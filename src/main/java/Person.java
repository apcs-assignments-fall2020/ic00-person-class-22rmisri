public class Person {
    private String firstname;
    private String lastname;
   
    public Person(String name_one, String name_two) {
        firstname = name_one;
        lastname = name_two;
    }


    public void doSomething() {
        System.out.println("I am watching Netflix right now");
    }

    public String getfirstname() {
        return this.firstname;
    }
    public String getlastname() {
        return this.lastname;
    }
    public void setfirstname (String firstname) {
        if (firstname.trim().length()!= 0) {
            this.firstname = firstname;
        }
    } public void setlastname (String lastname) {
        if (lastname.trim().length()!= 0) {
            this.lastname = lastname;
        }
    }


    public String toString() {
        String str = firstname + " " + lastname;
        return str;
    }

}













