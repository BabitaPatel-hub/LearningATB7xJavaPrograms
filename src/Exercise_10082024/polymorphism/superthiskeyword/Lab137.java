package Exercise_10082024.polymorphism.superthiskeyword;

import org.w3c.dom.ls.LSOutput;

public class Lab137 {
    public static void main(String[] args) {
        Student stu = new Student();
        Person per = new Person();

        stu.message();
        stu.display();

        per.message();
    }
}

class Student extends Person
{
    @Override
    void message()
    {
        System.out.println("Hello Student");
    }
    void display()
    {
        super.message();
        this.message();
    }
}


class Person
{
    void message()
    {
        System.out.println("Hello Person");
    }
}
