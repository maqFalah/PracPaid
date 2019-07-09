package pracPaid;

public class Address {


 private String streetAddress, cityname, statename;
    private int pinCode;


    //  Sets  address.
    
    public Address(String street, String town, String state, int pin)
    {
        streetAddress = street;
        cityname = town;
        statename = state;
        pinCode = pin;
    }

  
    // Returns detail of address.
    
    public String toString()
    {
        String result;

        result = streetAddress + "\n";
        result += cityname + ", " + statename + " " + pinCode;

        return result;
    }

}

