class rec{
    int length;
    int breadth;
    int x=10;
  public rec(int length,int breadth){
      this.length=length;
      this.breadth=breadth;
  }
  public void dis(){
    System.out.println(length);
    System.out.println(breadth);
  }
}
class cub extends rec{
    int height;
    int x=20;
    public cub(int l,int b,int h){
        super(l,b);
        height=h;
    }
    public void Display(){
        System.out.println(super.x); //super act as the rec class and display the value of its x
        System.out.println(x); //this x will access with in the same class
    }
}

public class this_and_super {
    public static void main(String args[]){
       cub c=new cub(1,2,3);
         c.Display();  //the output will be 10 and 20
    }   
}
