
class parents{
    void Display(){
        System.out.println("parents display is excuted");
    }
}
class child extends parents{
    void Display(){
        System.out.println("Child display is excuted");
    }
  public  void feature(){
        System.out.println("some extra feature");
    }
}

public class method_overriding {
    public static void main(String args[]){
       //case 1 
       // make a reference and object of parent class
       parents p=new parents();
       p.Display(); // it will excute the function of parentdisplay

       //case 2
       // make a reference and object of child which is extension of the parent
       child c=new child();
       c.Display(); //now it is extension of parents and it also have the display function 
       //what happen here when we make a child oject it override the display function of
       // parent

       //case 3
       // make a reference of parent and object of the child
       parents p1=new child();
       p1.Display();  //it not matter the display of child will excute

       //case 4 we can't make the reference of child and object of parent and 
       // try to access the feature that the parent method doesn't have
      // child c1=new parents();   - this gave error we can't do that
       //c1.Display(); 
    }
}
