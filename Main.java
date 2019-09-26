public class Main {
    public static void main(String[] args) {
        System.out.println("Calculator:\n1)Sum\n2)Subtract\n3)Multiply\n4)Divide\nInput:");
        int inp = 1;
        int a = 12, b = 32;
        switch (inp) {
        case 1:
            new Addition().Add(a, b);
            break;
        case 2:
            new Sub().subtract(a, b);
            break;
        case 3:
            new Multiply().multiply(a, b);
            break;
        case 4:
            new Div().Division(a, b);
            break;
        default:
            System.out.println("invalid input!!");
            break;
        }
    }
}