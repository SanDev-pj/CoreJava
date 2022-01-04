package OOPS;

public class Wall {
    private double width;
    private double height;

//    Wall() {
//
//    }

    Wall(double width, double height) {
        this.width = width;
        this.height = height;
        if (this.width < 0) {
            this.width = 0;
        }
        if (this.height < 0) {
            this.height = 0;
        }
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        if(width<0){
            this.width=0;
        }
        else {
            this.width=width;
        }
    }

    public void setHeight(double height){
        if(height<0){
            this.height=0;
        }
        else {
            this.height=height;
        }
    }

    public double getArea(){
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
