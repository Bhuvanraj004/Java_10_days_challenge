class alto{
    int display(int z,int y){
        return z+y;
    }
    int display(int e,int q,int a){//return in numeral
        return e*q*a;//void cant return value
    }
}
class overloading{
    public static void main(String[] args){
        alto  obj=new alto();
        System.out.println(obj.display(1,2));
        System.out.println(obj.display(1,2,3));
 
    }
}
//overloading