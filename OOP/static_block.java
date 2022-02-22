class my{
    public int x=10;
    void Display() {
        System.out.println("main");
    }
     static{
        System.out.println("Block1");
    }
     static{
        System.out.println("Block2");
    }
    
}
public class static_block {
   public static void main(String args[]){
    //if we not write any thing in main then the class function create and run static block in sequence

   /*if we simply run below two line then we excute the class to create then class run
   if it have static block then it excute in sequence 
   o/p=block1 and block2

   */
    my m = new my();
    m.x=10;
    
    my m1=new my();
    m1.Display();
   }   
}
