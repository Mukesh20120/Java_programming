class cylinder{
    public double radius;
    public int height;
    public double base_area(){
        return Math.PI*radius*radius;
    }
    public double surface_area(){
        return 2*Math.PI*radius*height + 2*base_area(); 
    }
    public double volume(){
        return base_area()*height;
    }
}
public class cylinder1 {
    public static void main(String args[]){
        cylinder c1= new cylinder();
        c1.radius=5;
        c1.height=10;
        System.out.println(c1.volume()+"volume of cylinder");
        System.out.println(c1.surface_area()+"surface area of cylinder");
        System.out.println(c1.base_area()+"base area of cylinder");
    }
}
