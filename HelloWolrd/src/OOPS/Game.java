package OOPS;

import java.util.Random;

public interface Game {
    public void start();
    public void play();
    public void stop();

    public static void main(String[] args) {
        Game games[] = new Game[10];
        for(int i=0;i<10;i++){
            Random rand = new Random();
            int randomNum = 1 + rand.nextInt((3 - 1) + 1);
            if(randomNum==1)
                games[i]=new Car();
            else if(randomNum==2)
                games[i]=new Bike();
            else if (randomNum==3)
                games[i]=new Bicycle();

            games[i].start();
            games[i].play();
            games[i].stop();
        }
    }
}
class Car implements Game{
    @Override
    public void start() {
        System.out.println("Car Started");
    }

    @Override
    public void play() {
        System.out.println("Car is Playing");
    }

    @Override
    public void stop() {
        System.out.println("Car Stopped");
    }
}
class Bike implements Game{
    @Override
    public void start() {
        System.out.println("Bike Started");
    }

    @Override
    public void play() {
        System.out.println("Bike is Playing");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopped");
    }
}

class Bicycle implements Game{
    @Override
    public void start() {
        System.out.println("Bicycle Started");
    }

    @Override
    public void play() {
        System.out.println("Bicycle is Playing");
    }

    @Override
    public void stop() {
        System.out.println("Bicycle Stopped");
    }
}
