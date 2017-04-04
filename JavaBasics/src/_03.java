import java.util.Scanner;
public class _03 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String ch1=scan.next();
        String ch2=scan.next();
        String ch3=scan.next();

        StringBuilder result=new StringBuilder();
        result.append(ch3);
        result.append(ch2);
        result.append(ch1);

        System.out.println(result);
    }
}
