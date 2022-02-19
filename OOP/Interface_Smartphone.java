//making class of phone it is concrete class
class phone{
    void call(){
        System.out.println("making a phone call from phone class");
    }
    void sms(){
        System.out.println("making a sms from the phone class");
    }
}
interface camera{
   public void click();//it does not have {} it show it is incomplete/abstract method
   public void record();
}
interface mediaplayer{
  public  void play();
  public  void pause();
  public  void playlist();
  public  void stop();
}
class smartphone extends phone implements camera,mediaplayer{
    /*now this is child and inheritance of all above classes abstract and concrete
    we not require to overwrite the concrete class method but 
    we have to over write interface method if we not do that then the child
    also become the abstract class and we not able to make object
    */
    public void click(){
        System.out.println("click method overwrite in child class");
    }
    public void record(){
        System.out.println("recode method overwrite in child class");
    }
    public void play(){
        System.out.println("play music");
    }
    
    public void stop() {
        System.out.println("stop music");
    }
    
    public void pause() {
        System.out.println("pause music");
    }
    
    public void playlist() {
        System.out.println("playlist music");
    }
   //we above define all the method requried to stop making this class abstract 
   //two method of class not need to over write we can access it 

}

public class Interface_Smartphone {
    public static void main(String ...args){
        //we can make referance and object of phone class b/c it is concrete
        phone p=new phone(); //p can access only two method of it
        p.call();
        p.sms();
        //we can't create object of abstract/interface class
        // camera c=new camera();  it gave error

        camera c=new smartphone();//we can create refernce of interface 
        c.click(); //it can access only those method which camera have and overwrite
        c.record();
        mediaplayer m=new smartphone();//same as camer only access those it have
        m.pause();
        m.play();
        m.stop();
        m.playlist();
        //smartphone reference and smartphone object can acess all the method and function of class because it is extended and implemented
        smartphone s=new smartphone();
        s.call();
        s.sms();
        s.click();
        s.record();
        s.pause();
        s.play();
        s.stop();
        s.playlist();
    }
}
