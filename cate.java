import java.util.Scanner;
class cate{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr1=new int[N];
        for(int i=0;i<N;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<N;i++){
            
                        for(int j=i+1;j<N;j++){
                 if(arr1[i]==arr1[j]){
                    System.out.println(arr1[i]);
                 }
            }
        }
    }
}