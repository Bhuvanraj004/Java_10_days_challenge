import java.util.Scanner;
public class fibbo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0,x=1;
        
        for(int i=1;i<=n;i++){
            int d=s+x;
              
              s=x;
             x=d;
             System.out.println(d);
        }
        
     }
}