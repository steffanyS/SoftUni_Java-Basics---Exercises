import java.util.Scanner;
public class _02 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        boolean input=Boolean.parseBoolean(scan.next());
        if(input==true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}