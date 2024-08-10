package Exercise_28072024;

import java.util.Objects;

public class Lab117 {
    public static void main(String[] args)
    {
        //OOPS - near to real time problems
        //Classes and Objects
        //class-it's just a blueprint, does not take memory
        //object-instance of a class....takes memory

        Person pr1 = new Person();
        //class name reference = new classname().....right operand is object creation
        pr1.name = "Babita";
        pr1.age = 34;
        pr1.color = "Wheatish";
        pr1.gender = "Female";

        Person pr2 = new Person();
        pr2.name = "Faisal";
        pr2.age  = 40;
        pr2.gender = "Male";

    }
}
