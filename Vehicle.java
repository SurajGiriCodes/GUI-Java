
/**
 * The vehicle class has five attributes,which correspond to the vehicleid,vehicle name, vehicle weight, vehicle color and vehicle speed.
 * escept vecicle id they are each represented as a string of text and vehicle id as number.they are initialized in the constructor by being assigned 
 * the value of the constructor parameters. each has accessor method. a method to set the vehicle speed to a new speed by accepting the new speed of 
 * the vehicle as a perameter.a set method to set the vehicle colour to a new color by accepting the new color of the vehicle as a parameter. 
 * display method to output vehicle id vehicle name vehicle color, vehicle weight and vehicle speed and if vehicle weight is empty,
 * the empty message should be displayed.  
 * 
 * @author (suraj giri)
 * @version (version 18)
 */
public class Vehicle
{
   //private instance variable
  //Declaration of Instance Variables
  //A variable vehicleid is declared with int data type
  private int Vehicle_id;
  //A variable vehicle_name is declared with string data type
  private String Vehicle_name;
  //A variable vehicle_color is declared with string data type
  private String Vehicle_color;
  //A variable vehicle_weight is declared with string data type
  private String Vehicle_weight;
  //A variable vehicle_speed is declared with string data type
  private String Vehicle_speed;
    
     //constructor of vehicle class
      /*
      * The constructor of vehicle class accepts four parameters: int vehicleid, 
      * string vehicle_name, string vehicle_weight, string vehicle_color
      */
   public Vehicle(int Vehicle_id, String Vehicle_name, String Vehicle_color, 
   String Vehicle_weight)
   {
   this.Vehicle_id=Vehicle_id;
   this.Vehicle_name=Vehicle_name;
   this.Vehicle_color=Vehicle_color;
   this.Vehicle_weight=Vehicle_weight;
   }
    
   //getters method 
   //getters method for Vehicle_id
   public int getVehicle_id()
   {
     return this.Vehicle_id;
   }
    
   //getters method for Vehicle_name
   public String getVehicle_name()
   {
     return this.Vehicle_name; 
   }
    
   //getter method for Vehicle_color
   public String getVehicle_color()
   {
     return this.Vehicle_color;
   }
    
   //getter method for Vehicle_weight
   public String getVehicle_weight()
   {
     return this.Vehicle_weight; 
   }
    
   //getter method for Vehicle_speed
   public String getVehicle_speed()
   {
     return this.Vehicle_speed;
   }
    
   //setters method
   //setters method for Vehicle_speed
   public void setVehicle_speed(String Vehicle_speed)
   {
     this.Vehicle_speed=Vehicle_speed;
   }
    
   //setters method for Vehicle_color
   public void setVehicle_color(String Vehicle_color)
   {
     this.Vehicle_speed=Vehicle_color; 
   }
    
 //display method
 public void display()
 {
    System.out.println("Vehicle_id is:" +this.Vehicle_id);
    System.out.println("Vehicle_name is:" +this.Vehicle_name);
    System.out.println("Vehicle_color is:" +this.Vehicle_color);
    System.out.println("Vehicle_weight is:" +this.Vehicle_weight);
    System.out.println("Vehicle_speed is:" +this.Vehicle_speed);
        
    //if else
    if(this.Vehicle_weight.equals(""))
     {
        System.out.println("empty");
     }
        
     else
     {
        System.out.println("Vehicle_weight is:" +this.Vehicle_weight);
     }
 }

 }
    
     

