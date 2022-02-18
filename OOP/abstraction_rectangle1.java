class rect{
    private int length;
    private int breadth;
    public rect(){
        length=1;
        breadth=1;
    }
    public rect(int l,int b){
        length=l>0?l:1;
        breadth=b>0?b:1;
    }

    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
  
    public int area(){
        return getlength()*getbreadth();
    }
    public int parameter(){
        return 2*(getlength()+getbreadth());
    }
}
public class abstraction_rectangle1 {
    public static void main(String args[]){
          rect r1=new rect(1 , 5);
         
     System.out.println(r1.area()+"area of rectangle");
     System.out.println(r1.parameter()+"parameter of rectangle");
    }
}
