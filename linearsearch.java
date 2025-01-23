import java.util.*;
class linearsearch{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int size=sc.nextInt();
    int arr[]=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        for(int i=0;i<size;i++){
            if(arr[i]==a){
                System.out.println("Element is present at index "+i);
            break;
            }
        }
  }    
}