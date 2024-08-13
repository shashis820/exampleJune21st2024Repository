package NumberDemo;
public class NumberMain {
    public static void main(String[] args) {
        int num = 10;
        int k = 1;
        for (int i = 1; i <= num; i++)
        {
            k = k * i;
        }
        System.out.println("given factorial" + num + "number is:" + k);
    }
}
