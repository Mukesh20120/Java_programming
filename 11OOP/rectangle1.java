class rectangle{
    public int l;
    public int b;
    public int area(){
        return l*b;
    }
    public int peram(){
        return 2*(l+b);
    }
}
public class rectangle1{
    public static void main(String args[]){
        rectangle r1= new rectangle();
        r1.l=5;
        r1.b=10;
        System.out.println(r1.area());
        System.out.println(r1.peram());
    }
}