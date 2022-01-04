package OOPS;

import java.util.Scanner;

public interface Currency {
    public void GetCurrency();
}
class India implements Currency{
    @Override
    public void GetCurrency() {
        System.out.println("Indian Rupees: INR");
    }
}
class USA implements Currency{
    @Override
    public void GetCurrency() {
        System.out.println("USA Dollar: $");
    }
}
class UK implements Currency{
    @Override
    public void GetCurrency() {
        System.out.println("UK Pound:  £");
    }
}
class CurrencyContainer{
    public static Currency getCurrency(String country){
        if(country.equals("India"))
            return new India();
        else if (country.equals("USA"))
            return new USA();
        else if(country.equals("UK"))
            return new UK();
        else
            throw new IllegalArgumentException();
    }
}
class CurrencyClient{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter Country Name: ");
        String country = scnr.next();
        Currency countryObj= CurrencyContainer.getCurrency(country);
        countryObj.GetCurrency();
    }
}

