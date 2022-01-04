package OOPS;

public class Product {
    private int pId;
    private String Pname;
    private int Price;

    Product(int id,String name,int Price){
        this.pId=id;
        this.Pname=name;
        this.Price=Price;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public boolean display(){
        System.out.println("ID: "+this.pId);
        System.out.println("Name: "+this.Pname);
        System.out.println("Price: "+this.Price);
        return false;
    }
}
