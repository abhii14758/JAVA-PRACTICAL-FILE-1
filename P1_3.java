////CREATED BY 21CE013 ABHI BHIMANI
import java.util.Scanner;
public class P1_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a % 10 == b % 10) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }

        }
        System.out.println("CREATED BY 21CE013 ABHI BHIMANI");
    }
}
