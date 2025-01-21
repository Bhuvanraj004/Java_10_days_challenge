class alto{
    int display(int z,int y){
        return z+y;
    }
    int display(int e,int q,int a){//return in numeral
        return e*q*a;//void cant return value
    }
}
class casting{
    public static void main(String[] args){
        int a=1234;
        float num=a;//implicit
        System.out.println(num);
        int e=34;
        double n=(double)e;//explicit casting
        System.out.println(n);
    }
}
//overloading