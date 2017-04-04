import java.util.Scanner;
public class _05 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        Integer number=Integer.parseInt(scan.next());
        System.out.println(Integer.toHexString(number).toUpperCase());
        System.out.println(Integer.toBinaryString(number));
    }
}
