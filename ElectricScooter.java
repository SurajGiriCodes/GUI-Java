
/**
 * The ElectricScooter class is also a subclass of the vehicle class, and it has eight attributes they are range, battery capacity, price, charging time, 
 * brand, mileage has purchased, hassold each attributes has value they are a whole number, a whole number, a whole number, a string, a string, a string,
 * a string, either true or false(boolean), either true or fale (boolen) respectively.The constructor accepts six parameters which are the Vehicle id, 
 * Vehicle name, Vehicle Weight, Vehicle Speed, Vehicle Color, Battery capacity. A call is made to the superclass constructor with four parameters: 
 * Vehicle id, Vehicle name, Vehicle Color and Vehicle weight. The method to set the speed and color of vehicle is also called within the constructor. 
 * The attribute battery capacity is given the corresponding parameter value. Additionally, the constructor initializes range and price to 0, Brand,
 * Mileage, Charging time to empty ("") string, and hasPurchased and hasSold status to false. Each attribute has a corresponding accessor method. 
 * A method is required to set the brand of the electric scooter. The method accepts a new brand as a parameter and, if the electric scooter is not
 * purchased yet, the new value is assigned to the brand attribute. If the electric scooter is already purchased, then a suitable message is output to 
 * the user indicating that it is therefore not possible to change the brand. There is a method to purchase an electric scooter that takes brand, price, 
 * charging time, mileage and range as parameters. And if the scooter has not been purchased yet, the method to set the brand is called with brand name 
 * as parameter. Also, price, charging-time, mileage, range are initialized by corresponding parameter values and hasPurchased is then set to true. There
 * is another method to sell the electric scooter. The method accepts a new price as a parameter. If the status of hasSold is false, set the price with 
 * the values as specified in the parameter, and set the charging time, mileage to “” and battery capacity, range is set to 0. Also, the status of hasSold
 * is changed to true and hasPurchased to false. If the electric scooter is already sold, a suitable message should be displayed indicating that the 
 * scooter is already sold. A method to display the details of the electric scooter is required. It must have the same signature as the display method 
 * in the Vehicle class. It will call the method in the Vehicle class to display the Vehicle ID, Vehicle name, Vehicle weight, Vehicle speed, and the 
 * Vehicle Color. If the electric scooter is already purchased then the brand, battery capacity, mileage, range, and recharge time must also be displayed.
 * Each output must be suitably annotated.
 * @author (suraj giri)
 * @version (version 18)
 */
public class ElectricScooter extends Vehicle
{
   //instance variable
   // A variable range is declared with int data type 
   private int range;
   // A variable battery_capacity is declared with int data type 
   private int battery_capacity;
   // A variable price is declared with int data type 
   private int price;
   // A variable charging_time is declared with string data type 
   private String charging_time;
   // A variable brand is declared with string data type 
   private String brand;
   // A variable mileage is declared with string data type 
   private String mileage;
   // A variable haspurchased is declared with boolean data type
   private boolean haspurchased;
   // A variable hassold is declared with boolean data type
   private boolean hassold;
   
   //constructor of class electricscooter
   /*The constructor of class ElectricScooter accepts six parameters: int vehicleid, string vehicle_name, string vehicleweight,
    * string vehicle_color, string vehicle_speed, int battery_capacity
    * 
    */
   public ElectricScooter(int Vehicle_id, String Vehicle_name, String Vehicle_color, String Vehicle_weight, String Vehicle_speed, int battery_capacity)
   {
       //calling a super class constructor and method
       super(Vehicle_id,Vehicle_name,Vehicle_color,Vehicle_weight);
       super.setVehicle_speed(Vehicle_speed);
       super.setVehicle_color(Vehicle_color);
       
       this.battery_capacity=battery_capacity;
       this.range=0;
       this.price=0;
       this.brand="";
       this.mileage="";
       this.charging_time="";
       this.haspurchased=false;
       this.hassold=false;
       
   }
   
   //accessor method
   //getters method of range
   public int getrange()
   {
       return this.range;
   }
   
   //getters method for battery capacity
   public int getbattery_capacity()
   {
       return this.battery_capacity;
   }
   
   //getters method for price
   public int getprice()
   {
       return this.price;
   }
   
   //getters method for charging time
   public String getcharging_time()
   {
       return this.charging_time;
   }
   
   //getters method for brand
   public String getbrand()
   {
       return this.brand;
   }
   
   //getters method for mileage
   public String getmileage()
   {
       return this.mileage;
   }
   
   //getters method for haspurchased
   public boolean gethaspurchased()
   {
       return this.haspurchased;
   }
   
   //getters method for hassold
   public boolean gethassold()
   {
       return this.hassold;
   }
   
   //setters method for brand
   public void setbrand(String brand)
   {
       this.brand=brand;
       
       //if else
       if(this.haspurchased==false)
       {
           this.brand=brand;
       }
       
       else
       {
           System.out.println("ElectricScooter is not possible to change the brand");
       }
    }
       //purchase method
   public void purchase(String brand, int price, String charging_time, String mileage, int range)
    {
       //if 
       if(haspurchased==false)
       {
           //calling a brand
           this.setbrand(brand);
           this.price=price;
           this.charging_time=charging_time;
           this.mileage=mileage;
           this.range=range;
           this.haspurchased=true;
       }
    
    }
    //sell method
    public void sell(int price)
    {
        if(this.hassold==false)
        {
            this.price=price;
            this.charging_time="";
            this.mileage="";
            this.battery_capacity=0;
            this.range=0;
            this.hassold = true;
        }
        else if(this.hassold==true)
        {
            System.out.println("The scooter is already sold");
            if(haspurchased==false)
            {
                System.out.println("The scooter is already sold");
            }
        }
    }
    
    //from vehicle class display method 
    public void display()
    {
        super.display();
        
        if(haspurchased==true)
        {
            System.out.println("The value of brand is:" +this.brand);
            System.out.println("The value of battery_capacity is:" +this.battery_capacity);
            System.out.println("The value of mileage is:" +this.mileage);
            System.out.println("The value of range is:" +this.range);
            System.out.println("The value of charging_time is:" +this.charging_time);
        }
    }
}
