package OOPS;

public interface Instruments {
    public void play();

    static void main(String[] args) {
        Instruments instrument[] = new Instruments[10];
        instrument[0] = new Piano();
        instrument[0] = new Piano();
        instrument[1] = new Flute();
        instrument[2] = new Guitar();
        instrument[3] = new Piano();
        instrument[4] = new Flute();
        instrument[5] = new Guitar();
        instrument[6] = new Piano();
        instrument[7] = new Flute();
        instrument[8] = new Guitar();
        instrument[9] = new Piano();
        for(int i=0;i<10;i++){
            instrument[i].play();
        }


    }
}

class Piano implements Instruments {
    @Override
    public void play() {
        System.out.println("Piano is playing pee peee peee");
    }
}

class Flute implements Instruments {
    @Override
    public void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar implements Instruments {
    @Override
    public void play() {
        System.out.println("“Guitar is playing tin tin tin tin");
    }
}


