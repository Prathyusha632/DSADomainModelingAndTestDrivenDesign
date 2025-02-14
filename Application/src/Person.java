class Brain{
    Brain()
    {
        System.out.println("The brain is thinking");
    }
}
public class Person {
    private String name;
    private Brain brain;
    Person()
    {
        System.out.println("First Constructor");
    }
    Person(String name)
    {
        this.name = name;
        brain = new Brain();
    }
    void writeName()
    {
        System.out.println("The name is : "+name);
    }
    void setName(String lastName)
    {
        this.name = lastName;

    }
    String getName()
    {
        return this.name;
    }
    public static void main(String[] args) {
        Person personobject = new Person("Prathyusha");
        String personName = personobject.getName();
        personobject.setName(personName+" Vanga");
       personobject.writeName();
        System.out.println("Hello World!!");
    }
}
