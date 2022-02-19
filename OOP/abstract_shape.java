abstract class shape{
    abstract void peremeter();
    abstract void area();
}
//concrete class we have to override all the method to make concrete class
// it we not make it concrete then the extends child class automatically become
// abstract class and you can't make object of abstract class
class cir extends shape{
    public double radius;
    public cir(int r){
        radius=r;
    }
     public void area(){
          System.out.println(Math.PI*radius*radius);
     }
     public void peremeter(){
         System.out.println(2*Math.PI*radius);
     }
}
public class abstract_shape {
    public static void main(String args[]){
     //we make a reference of abstract class and object of the child class
      shape c=new cir(11);
      c.area();
      c.peremeter();
    }
}
