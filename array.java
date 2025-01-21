import java.util.Scanner;
class array{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] hod;
        hod=new String[n];
        for(int i=0;i<n;i++){
            hod[i]=sc.next();
        }   
        for(String i:hod){
            System.out.println(i);
        } }
}