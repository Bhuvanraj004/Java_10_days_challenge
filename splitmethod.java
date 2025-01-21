import java.util.Scanner;
class splitmethod{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string:");
        String d=sc.nextLine();
        String[] saraku =d.split(" ");
        for(String saraku1:saraku){
            
        System.out.println(saraku1);
        }
}
}