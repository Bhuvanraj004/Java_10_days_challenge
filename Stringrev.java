import java.util.Scanner;
class Stringrev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        int len=str.length();
        System.out.println(len);
         //String reversed=Str.reverse();
        // System.out.println(reversed);
        StringBuilder b=new StringBuilder(str);
        System.out.println(b.reverse());
    }

}
