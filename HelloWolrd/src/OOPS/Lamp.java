package OOPS;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style,Boolean battery,int globRating){
        this.style=style;
        this.battery=battery;
        this.globRating=globRating;
    }
    public void turnOn(){
        System.out.println("Lamp -> Turning on");
    }
    public String getStyle(){
        return this.style;
    }
    public boolean isBattery(){
        return this.battery;
    }
    public int getGlobRating(){
        return this.globRating;
    }
}

class Bed{
    private String style;
    private int pillows,height,sheets,quilt;

    public Bed(String style,int pillows,int height,int sheets,int quilt){
        this.style=style;
        this.pillows=pillows;
        this.height=height;
        this.sheets=sheets;
        this.quilt=quilt;
    }
    public void make(){
        System.out.println("Bed -> Making | ");
    }
    public String getStyle(){
        return this.style;
    }
    public int getPillows(){
        return this.pillows;
    }
    public int getHeight(){
        return this.height;
    }
    public int getSheets(){
        return this.sheets;
    }
    public int getQuilt(){
        return this.quilt;
    }
}

class Ceiling{
    private int height,paintedColour;

    public Ceiling(int height,int paintedColour){
        this.height=height;
        this.paintedColour=paintedColour;
    }
    public int getHeight() {
        return height;
    }
    public int getPaintedColour() {
        return paintedColour;
    }
}

class walls{
    private String direction;

    public walls(String direction) {
        this.direction = direction;
    }
    public String getDirection() {
        return direction;
    }
}

class Bedroom{
    private String name;
    private walls wall1,wall2,wall3,wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, walls wall1, walls wall2, walls wall3, walls wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom -> Making bed | ");
        this.bed.make();
    }

    public static void main(String[] args) {
        walls wall1=new walls("West");
        walls wall2=new walls("East");
        walls wall3=new walls("South");
        walls wall4=new walls("North");

        Ceiling ceiling=new Ceiling(12,55);
        Bed bed=new Bed("Modern",4,3,2,1);
        Lamp lamp=new Lamp("Classic",false,75);
        Bedroom bedroom=new Bedroom("Sandeep",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}
