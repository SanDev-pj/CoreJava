package COLLECTION;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Player {
    private String name;
    private String email;
    private String city;
    private String state;
    private int age;

    public Player(String name, String email, String city, String state, int age) {
        this.name = name;
        this.email = email;
        this.city = city;
        this.state = state;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getCity() {
        return city;
    }
    public String getState() {
        return state;
    }
    public int getAge() {
        return age;
    }

    public static void getPlayers(ArrayList<Player> football,ArrayList<Player> cricket){

       football.forEach(s->{

           System.out.println(s.getName());
       });

    }

    public static void main(String[] args) {
        ArrayList<Player> footballList=new ArrayList<Player>();
        ArrayList<Player> cricketList=new ArrayList<Player>();
        footballList.add(new Player("Cristiano Ronaldo","cr7@mu.com","Manchester","karington",36));
        footballList.add(new Player("Edison Cavani","ec21@mu.com","urugue","urugue",34));
        footballList.add(new Player("Sergio Ramos","sr4@mu.com","Paris","Paris",34));
        footballList.add(new Player("Jadon Sancho","js30@mu.com","Manchester","karington",22));
        footballList.add(new Player("Kareem Benzema","kb7@mu.com","Madrid","paris",32));

        cricketList.add(new Player("MS Dhoni","ms7@csk.com","Chennai","Tamil Nadu",38));
        cricketList.add(new Player("Virat Kohli","vk9@rcb.com","Bangalore","Karnataka",33));
        cricketList.add(new Player("Kl Rahul","kr@pbks.com","Punjab","punjab",29));
        cricketList.add(new Player("Cristiano Ronaldo","cr7@mu.com","Manchester","karington",36));

        Player.getPlayers(footballList,cricketList);

    }
}
