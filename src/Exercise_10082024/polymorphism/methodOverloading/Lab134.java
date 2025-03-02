package Exercise_10082024.polymorphism.methodOverloading;

public class Lab134 {
    public static void main(String[] args) {
        MathOperations mathop1 = new MathOperations();

        System.out.println(mathop1.getName());

        mathop1.setName("Babita");
        System.out.println(mathop1.getName());

        int result1 = mathop1.add(25,20);
        double result2 = mathop1.add(25,20.5);
        String result3 = mathop1.add("Babita", "Faisal");
        int result4 = mathop1.add(10,50,1);
        String result5 = mathop1.add("Babita",786);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
