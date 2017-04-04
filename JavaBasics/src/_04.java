import java.util.Scanner;
public class _04 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine().trim();

        if (
                input.charAt(0) == 'a' || input.charAt(0) == 'e' ||
                        input.charAt(0) == 'o' || input.charAt(0) == 'u' ||
                        input.charAt(0) == 'y' ||input.charAt(0) == 'i'){
            System.out.println("vowel");

        } else if (Character.isDigit(input.charAt(0))){
            System.out.println("digit");
        }else {
            System.out.println("other");
        }
    }
}
