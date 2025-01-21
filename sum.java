import java.util.Scanner;
class sum{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        long sum1=0;
for (int i=0;i<N;i++){
    if(arr[i]%2!=0){
    sum1 += arr[i];}
}System.out.println(sum1);

    }
}