class product{
    private int itemno;
    private String name;
    private int price;
    private int qty;
    //non parameter constructor
    product(){
        itemno=0;
        name="";
        price=0;
        qty=0;
    }
    //parameter constructor
    product(int i,String n,int p,int q){
        itemno=i;
        name =n;
        price=p;
        qty=q;
    }
    //set method
    public void setitemno(int i){
        itemno=i;
    }
    public void setname(String s){
        name=s;
    }
    public void setprice(int p){
        price=p;
    }
    public void setqty(int q){
        qty=q;
    }
    //get method
    public int getitemno(){
        return itemno;
    }
    public int getprice(){
        return price;
    }
    public int getqty(){
        return qty;
    }
    public String getname(){
        return name;
    }

    //display product
    public void display(){
        System.out.println(itemno+" "+name+" "+price+" "+qty);
    }

}

public class product_customer {
    public static void main(String args[]){
      product p1=new product(1,"toothpaste",110,1);
       p1.display();
    }
}
