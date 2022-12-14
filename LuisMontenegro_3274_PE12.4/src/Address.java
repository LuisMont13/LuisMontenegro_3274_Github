/**
   Describes a mailing address.
   @author: Luis Montenegro
   Date: 11/13/2022
*/
public class Address
{  
   private String name;
   private String street;
   private String city;
   private String state;
   private String zip;

   /**
      Constructs a mailing address. 
      @param aName the recipient name
      @param aStreet the street
      @param aCity the city
      @param aState the two-letter state code
      @param aZip the ZIP postal code
   */
   public Address(String aName, String aStreet,
         String aCity, String aState, String aZip)
   {  
      name = aName;
      street = aStreet;
      city = aCity;
      state = aState;
      zip = aZip;
   }   


public String getName() {
	   return name;
}

public String getStreet() {
	   return street;
}

public String getCity() {
	   return city;
}

public String getState() {
	   return state;
}

public String getZip() {
	   return zip;
}
}