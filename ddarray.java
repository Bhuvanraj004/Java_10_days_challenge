import java.util.Scanner;
class ddarray{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] ar={{1,2,3,4},{5,6,7}};
       //int ar[][]={{},{}};
        System.out.println(ar[0][3]);
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                ar[i][j]=sc.nextInt();
        }}
         for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.println(ar[i][j]);
        }}


    }
}