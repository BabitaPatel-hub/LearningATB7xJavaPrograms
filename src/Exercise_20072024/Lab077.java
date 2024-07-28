package Exercise_20072024;

public class Lab077 {
    public static void main(String[] args) {
        // Yield was introduced in JDK 13 which returns value from switch
        char code = 'B';
        int val = switch (code)
        {
            case 'A' :
                yield 65;
            case 'B' :
                yield 66;
            default :
                throw new IllegalStateException("Unexpected Value : " + code);
        };
        System.out.println(val);
    }
}
