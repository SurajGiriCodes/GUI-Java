
/**
 * The AutoRickshaw class is a subclass of vehicle class and has eight attributes they are engine displacement,torque,number of seats, fuel tank capacity, 
 * ground clearance, charge amount, booked date, isbooked,the constructor accepts nine parameters, which are the vehicle id, vehicle name, vehicle weight, 
 * vehicle color, vehicle color, vehicle speed, engine displacement,troque, fuel tank capacity and ground clerance. a call is made to the superclass 
 * constructor with four parameters, the vehicle id, vehicle name, vehicle color and vehicle weight. additionally, in the constructor, assign all 
 * constructor with the parameter value, a whole number,a string of characters, a whole number, a whole number, a whole number, a string of characters,
 * a whole number, a string of characters, either true or false(boolean) respectively.the method to set speed of vehicle and color is also called within 
 * the constructor. the isbooked status is initialized to false. attribute has accessor method a set method to set the charge amount as auto rickshaw have
 * different charges depending on distance covered. the method accepts a new charge amount as a parameter. the parameter value is then assigned to 
 * the attribute charge amount.A method is required to set the number of seats. The method accepts a new number of seats as a parameter and assigns the
 * new value to the attributeNumber of Seats.There is a method to book an auto rickshaw. The method accepts a bookeddate, charge amount and number of seats
 * as a parameter. If the auto rickshaw is not booked, the attribute booked date is initialized with the parameter values. Also, the method to set the 
 * charge amount and number of seats should be called and the status of isBooked is set to true. Also, an appropriate message including vehicle id is
 * booked should be displayed. If the auto rickshaw is already booked, an appropriate message showing the status of isbooked and a message such as auto 
 * rickshaw is already booked should be displayed.A method to display the details of the Auto-Rickshaw is required. It must havethe same signature as 
 * the display method in the Vehicle class. It will call the method in the Vehicle class to display the Vehicle ID, Vehicle name, Vehicle Weight, 
 * Vehicle color and Vehicle speed. If the auto rickshaw is already booked, then Engine Displacement, Torque, Fuel Tank Capacity, Ground Clearance, Booked
 * Date should be displayed. Also, if the charge amount is not set, an empty message should be displayed. Likewise, if the number of seats is not set, an
 * empty message should be displayed. If the charge amount and number of seats are set, the values should be displayed. Each output must be suitably a
 * nnotated 
 *
 * @author (suraj giri)
 * @version (version 18)
 */
public class AutoRickshaw extends Vehicle
{
   //instance variable
   //Declaration of instance variables
   //A variable enginedisplacement is declared with int data type
   private int engine_displacement;
   //A variable torque is declared with string data type
   private String torque;
   //A variable number of seats is declared with int data type
   private int number_of_seats;
   //A variable fule tank capacity is declared with int data type
   private int fuel_tank_capacity;
   //A variable ground clearance capacity is declared with string data type
   private String ground_clearance;
   //A variable charge amount is declared with int data type
   private int charge_amount;
   //A variable booked data is declared with string data type
   private String booked_date;
   //A variable isbooked is declared with boolean data type
   private boolean isbooked;
   
   //constructor of class autorickshaw
   /*
    * The constructor of class AutoRickshaw accepts nine parameter: int vechicleid, string vehicle name, string vehicle weight, string vehicle color, 
    * string vehicle_speed, int enginedispalcement, string torque, int fuel_tank_capacity, string ground_clearance
    */
   public AutoRickshaw(int Vehicle_id, String Vehicle_name, String Vehicle_color, String Vehicle_weight, String Vehicle_speed, int engine_displacement, 
   String torque, int fuel_tank_capacity, String ground_clearance)
   {
      //calling constructor and method
      super(Vehicle_id, Vehicle_name, Vehicle_color, Vehicle_weight);
      super.setVehicle_speed(Vehicle_speed);
      super.setVehicle_color(Vehicle_color);
      
      this.engine_displacement=engine_displacement;
      this.torque=torque;
      this.fuel_tank_capacity=fuel_tank_capacity;
      this.ground_clearance=ground_clearance;
      this.isbooked=false;
   }
   
   //getters method
   //getters method for engine displacement
   public int getengine_displacement()
   {
       return this.engine_displacement;
   }
   //getters method for torque
   public String gettorque()
   {
       return this.torque;
   }
   //getters method for number of seats
   public int getnumber_of_seats()
   {
       return this.number_of_seats;
   }
   //getters method for fueltank capacity
   public int getfuel_tank_capacity()
   {
       return this.fuel_tank_capacity;
   }
   //getters method for ground clearance
   public String getground_clearance()
   {
       return this.ground_clearance;
   }
   //getters method for charge amount
   public int getcharge_amount()
   {
       return this.charge_amount;
   }
   //getters method for booked date
   public String getbooked_date()
   {
       return this.booked_date;
   }
   //getters method for isbooked
   public boolean getisbooked()
   {
       return this.isbooked;
   }
   
   //setters method for charge amount
   public void setcharge_amount(int charge_amount)
   {
       this.charge_amount=charge_amount;
   }
   //setters method for number of seats
   public void setnumber_of_seats(int number_of_seats)
   {
       this.number_of_seats=number_of_seats;
   }
   //method book
   public void book(String booked_date, int charge_amount, int number_of_seats)
   {
       //if,else
       if(this.isbooked == false)
       {
           this.booked_date=booked_date;
           this.setcharge_amount(charge_amount);
           this.setnumber_of_seats(number_of_seats);
           this.isbooked=true;
           
           System.out.println("Vehicle_id is booked");
       }
       else if(this.isbooked ==true)
       {
           System.out.println("Status of isbooked: "+ isbooked);
           System.out.println("AutoRickshaw is already booked");
       }
   }
   
   //method of vehicle display should be same as in autorickshaw subclass
   public void display()
   {
       super.display();
       //if
       if(this.isbooked==true)
       {
           System.out.println("The value of engine_displacement is:" +engine_displacement);
           System.out.println("The value of torque is:" +torque);
           System.out.println("The value of fuel_tank_capacity is: "+fuel_tank_capacity);
           System.out.println("The value of ground_clearance is: "+ground_clearance);
           System.out.println("The value of booked_date is: "+booked_date);
           //if if
           if(this.charge_amount==0)
           {
               System.out.println("empty message");
           }
           if(this.number_of_seats==0)
           {
               System.out.println("empty message");
           }
           
           //else
           else
           {
             System.out.println("charge_amount is:" +this.charge_amount);
             System.out.println("number_of_seats is:" +this.number_of_seats);
           }
       }
   }
}
