package COLLECTION;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StatesAndCapitals {

    Map<String,String> state_capital = new HashMap<>();

    public void add_state_capital(String state, String capital){

        state_capital.put(state, capital);
    }

    public String viewCapital(String state) {

        return state_capital.get(state);

    }
}
class OperateStateAndCapitals {

    public static void main(String[] args) {
        Scanner readVal = new Scanner(System.in);
        StatesAndCapitals obj = new StatesAndCapitals();
        int i=0;
        String stateName,capital;
        while(i!=10) {

            System.out.printf("Enter the State = ");
            stateName = readVal.nextLine();

            System.out.printf("Capital of of the %s state = ",stateName);
            capital = readVal.nextLine();

            obj.add_state_capital(stateName, capital);
            i++;
        }

        System.out.printf("\n\nEnter the State name to find the capiatl of =>");
        stateName = readVal.nextLine();

        System.out.println("Capital => " +obj.viewCapital(stateName));

        readVal.close();

    }

}
