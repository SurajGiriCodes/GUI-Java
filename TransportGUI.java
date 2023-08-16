
/**
 * The TransportGUI
class should store an array list (not an array) of the type Vehicle class to hold the
AutoRickShaw and ElectricScooter. There should be text fields for entering,There should be text fields for entering,Vehicle Name,Vehicle ID,Vehicle Weight,Vehicle Color,Vehicle Speed,Engine Displacement,Torque,No of seats,Fuel tank capacity,Ground clearance,Charge Amount,Range,
Battery Capacity,Price,Charging Time,Brand. And button add to autorickshaw,electricscooter,book autorickshaw,purchase electricscooter and sell electricscooter.
 *
 * @author (Suraj giri)
 * @version ( version 18)
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class TransportGUI implements ActionListener
{ 
    private JFrame frame_1,frame_2,frame_3;
    private JPanel panel_1,panel_2,panel_3,panel_4,panel_5;
    private JLabel name_1,name_2,name_3,name_4,name_5,name_6,name_7,name_8,name_9,name_10,name_11,name_12,name_13,name_14,name_15,name_16,name_17,name_18,
    name_19,name_20,name_21,name_22,name_23,name_24,name_25,name_26,name_27,name_28,name_29;
    private JTextField field_1,field_2,field_3,field_4,field_5,field_6,field_7,field_8,field_9,field_10,field_11,field_12,field_13,field_14,field_15,
    field_16,field_17,field_18,field_19,field_20,field_21,field_22,field_23,field_24,field_25,field_26;
    private JComboBox box_1,box_2,box_3;
    private JButton button_1,button_2,button_3,button_4,button_5,button_6,button_7,button_8,button_9,button_10,button_11,button_12,button_13;
    
    //Array List
    private JFrame frame;
    ArrayList<Vehicle>arr_list = new ArrayList<Vehicle>();
    
    //method m1
    public  void m1()
    {
      //JFrame
      frame_1= new JFrame("My frame");
      frame_1.setLayout(null);
      frame_1.setBounds(100,100,400,200);
      frame_1.setResizable(false);
      frame_1.setVisible(true);  
      
      //JPanel
      panel_1 = new JPanel();
      frame_1.add(panel_1);
      panel_1.setLayout(null);
      panel_1.setBounds(0,0, 400,200);
      
      //JLabel of name1
      name_1 = new JLabel();
      name_1.setBounds(125,20,200, 25);
      name_1.setText("Transport GUI");
      panel_1.add(name_1);
      //font
      Font ff = new Font("Times New Romen",Font.PLAIN,25);
      name_1.setFont(ff);
      
      //JButton_1
      button_1 = new JButton("Auto Rickshaw");
      button_1.setBounds(40,70,140,45);
      button_1.addActionListener(this);
      panel_1.add(button_1);
       
      //JButton_2
      button_2 = new JButton("Electric Scotter");
      button_2.setBounds(210,70,140,45);
      button_2.addActionListener(this);
      panel_1.add(button_2);

    }
    
    //method m2
    public  void m2()
    {
      //JFrame
      frame_2= new JFrame("AutoRickshaw");
      frame_2.setLayout(null);
      frame_2.setBounds(280,75,1000,650);
      frame_2.setResizable(false);
      frame_2.setVisible(true);
      
      //JLabel of name2
      name_2 = new JLabel();
      name_2.setBounds(400,25,250, 25);
      name_2.setText("AutoRickshaw");
      Font ff = new Font("Times New Romen",Font.PLAIN,30);
      name_2.setFont(ff);
      frame_2.add(name_2);
      
      //JPanel2
      panel_2= new JPanel();
      frame_2.add(panel_2);
      panel_2.setLayout(null);
      panel_2.setBounds(32,95, 450,485);
      panel_2.setBackground(Color.LIGHT_GRAY);
      
      //JPanel3
      panel_3= new JPanel();
      frame_2.add(panel_3);
      panel_3.setLayout(null);
      panel_3.setBounds(505,95, 450,485);
      panel_3.setBackground(Color.LIGHT_GRAY);
  
      //JLabel of name3
       name_3= new JLabel();
       name_3.setBounds(40,30,300,30);
       name_3.setText("Vehicle ID:");
       panel_2.add(name_3);
       
      //creating JTextfield1
      field_1 = new JTextField();
      field_1.setBounds(205,30,210,26);
      panel_2.add(field_1);
       
      //JLabel of name4
      name_4= new JLabel();
      name_4.setBounds(40,70,300,30);
      name_4.setText("Vehicle Name:");
      panel_2.add(name_4);
       
      //creating JTextfield2
      field_2 = new JTextField();
      field_2.setBounds(205,70,210,26);
      panel_2.add(field_2);
       
      //JLabel of name5
      name_5= new JLabel();
      name_5.setBounds(40,110,300,30);
      name_5.setText("Vehicle Weight:");
      panel_2.add(name_5);
       
      //creating JTextfield3
      field_3 = new JTextField();
      field_3.setBounds(205,110,210,26);
      panel_2.add(field_3);
       
      //JLabel of name6
      name_6= new JLabel();
      name_6.setBounds(40,150,300,30);
      name_6.setText("Vehicle Color:");
      panel_2.add(name_6);
       
      //creating JTextfield4
      field_4 = new JTextField();
      field_4.setBounds(205,150,210,26);
      panel_2.add(field_4);
       
      //JLabel of name7
      name_7= new JLabel();
      name_7.setBounds(40,190,300,30);
      name_7.setText("Vehicle Speed:");
      panel_2.add(name_7);
       
      //creating JTextfield5
      field_5 = new JTextField();
      field_5.setBounds(205,190,210,26);
      panel_2.add(field_5);
       
      //JLabel of name8
      name_8= new JLabel();
      name_8.setBounds(40,230,300,30);
      name_8.setText("Engine displacement:");
      panel_2.add(name_8);
       
      //creating JTextfield6
      field_6 = new JTextField();
      field_6.setBounds(205,230,210,26);
      panel_2.add(field_6);
       
      //JLabel of name9
      name_9= new JLabel();
      name_9.setBounds(40,270,300,30);
      name_9.setText("Torque:");
      panel_2.add(name_9);
       
      //creating JTextfield7
      field_7 = new JTextField();
      field_7.setBounds(205,270,210,26);
      panel_2.add(field_7);
       
      //JLabel of name10
      name_10= new JLabel();
      name_10.setBounds(40,310,300,30);
      name_10.setText("Fuel Tank Capacity:");
      panel_2.add(name_10);
       
      //creating JTextfield8
      field_8 = new JTextField();
      field_8.setBounds(205,310,210,26);
      panel_2.add(field_8);
       
      //JLabel of name11
      name_11= new JLabel();
      name_11.setBounds(40,350,300,30);
      name_11.setText("Ground Clearance:");
      panel_2.add(name_11);
       
      //creating JTextfield9
      field_9 = new JTextField();
      field_9.setBounds(205,350,210,26);
      panel_2.add(field_9);
       
      //JButton_3
      button_3 = new JButton("Add an AutoRickshaw");
      button_3.setBounds(40,410,378,35);
      button_3.addActionListener(this);
      panel_2.add(button_3);
      
      //JButton_4
      button_4 = new JButton("Change for ElectricScotter");
      button_4.setBounds(40,30,378,35);
      button_4.addActionListener(this);
      panel_3.add(button_4);
      
      //JLabel of name12
      name_12= new JLabel();
      name_12.setBounds(40,120,300,30);
      name_12.setText("Vehicle ID:");
      panel_3.add(name_12);
       
      //creating JTextfield10
      field_10 = new JTextField();
      field_10.setBounds(205,120,210,26);
      panel_3.add(field_10);
       
      //JLabel of name13
      name_13= new JLabel();
      name_13.setBounds(40,160,300,30);
      name_13.setText("Booked Date:");
      panel_3.add(name_13);
       
      //JComboBox1
      String[] years = {"1995","1996","1997","1998","1999"};
      box_1 = new JComboBox(years);
      box_1.setBounds(205,160,60,26);
      panel_3.add(box_1);
        
      //JComboBox2
      String[] month = {"January","February","March","April","May",
          "June","July","August","September","October","November", "December"};
      box_2 = new JComboBox(month);
      box_2.setBounds(270,160,90,26);
      panel_3.add(box_2);
        
      //JComboBox3
      String[] day = { "01","02","03","04","05","06","07","08","09"
            ,"10"};
      box_3 = new JComboBox(day);
      box_3.setBounds(365,160,50,26);
      panel_3.add(box_3);
       
      //JLabel of name14
      name_14= new JLabel();
      name_14.setBounds(40,200,300,30);
      name_14.setText("Charge Amount:");
      panel_3.add(name_14);
       
      //creating JTextfield12
      field_11 = new JTextField();
      field_11.setBounds(205,200,210,26);
      panel_3.add(field_11);
       
       
      //JLabel of name15
      name_15= new JLabel();
      name_15.setBounds(40,240,300,30);
      name_15.setText("Number of Seats:");
      panel_3.add(name_15);
       
      //creating JTextfield13
      field_12 = new JTextField();
      field_12.setBounds(205,240,210,26);
      panel_3.add(field_12);
       
      //JButton_5
      button_5 = new JButton("Book an Auto Rickshaw");
      button_5.setBounds(40,300,378,35);
      button_5.addActionListener(this);
      panel_3.add(button_5); 
      
      //JButton_6
      button_6 = new JButton("Display");
      button_6.setBounds(73,380,140,36);
      button_6.addActionListener(this);
      panel_3.add(button_6);
       
        
      //JButton_7
      button_7 = new JButton("Clear");
      button_7.setBounds(243,380,140,36);
      button_7.addActionListener(this);
      panel_3.add(button_7);
    }
     
     public void actionPerformed(ActionEvent e)
     {
       //Electricscooter
       if(e.getSource() == button_1)
       {
         this.m2();
       }
       //AutoRickshaw
       else if(e.getSource() == button_2)
       {
         this.m3();
       }
       //change to ElectricScooter
       else if(e.getSource() == button_4)
       {
         this.m3();
       }
       //change to Autoriclshaw
       else if(e.getSource() == button_10)
       {
         this.m2();
       }
       
       //Add an AutoRickshaw
       else if(e.getSource() == button_3)
       {
         //exception handeling
         try
         {
          boolean b1 = false;
          
          String f1=(field_1.getText());
          int a=Integer.parseInt(f1);
             
          String f2=(field_2.getText());
         
          String f3=(field_3.getText());
         
          String f4=(field_4.getText());
        
          String f5=(field_5.getText());
         
          String f6=(field_6.getText());
          int b=Integer.parseInt(f6);
         
          String f7=(field_7.getText());
         
          String f8=(field_8.getText());
          int c=Integer.parseInt(f8);
         
          String f9=(field_9.getText());
          
          //for each loop
          for(Vehicle RR : arr_list)
         {
             //
             if(RR instanceof AutoRickshaw)
             {
                 //Downcasting
                 AutoRickshaw auto_obj = (AutoRickshaw) RR;
                 if(auto_obj.getVehicle_id() == a)
                 {
                        b1 = true;
                 }
             }
          }
          
          if(b1 == false)
          {
          AutoRickshaw BB;
          BB = new AutoRickshaw(a,f2,f3,f4,f5,b,f7,c,f9);
         
          //add autoRickshaw
          arr_list.add(BB);
         
          //massage box
          JOptionPane.showMessageDialog(panel_2,"Successfully Added AutoRickshaw with value: " + "\n" + "Vehicle ID: " + a +"\n"+ "Vehicle name: "+f2+
          "\n"+ "Vehicle weight: "+f3+"\n"+ "vehicle colour: "+f4+"\n"+ "Vehicle speed: "+f5+"\n"+ "Engine displacement: "+b+"\n"+ "torque: "+f5+"\n"+ 
          "Fuel Tank capacity: "+c+"\n"+ "Ground Clearance: "+f9);
          }
          else if(b1 == true)
          {
                //massage box
          JOptionPane.showMessageDialog(panel_2,"The AutoRickshaw with vehicle ID: "+a+" is alrady booked.");
          }
         }
         catch(NumberFormatException ae)
         {
          //massage box
          JOptionPane.showMessageDialog(panel_2,"Please enter correct value for"+"\n"+ "Vehicle ID"+"\n"+"Vehicle Name"+"\n"+"Vehicle Weight"+"\n"+
          "Vehicle Color"+"\n"+"Vehicle Speed"+"\n"+"Engine displacement"+"\n"+"Torque"+"\n"+"fuel Tank capacity"+"\n"+"Ground Clearance.");
         
         }
         
       }
       
       //Book the AutoRickshaw
       else if(e.getSource() == button_5)
       {
        try{
         String f10=(field_10.getText());
         int b=Integer.parseInt(f10);
         
         String yr = box_1.getSelectedItem().toString();
         String mon = box_2.getSelectedItem().toString();
         String day = box_3.getSelectedItem().toString();
         String bookeddate = yr + mon+day;
         
         String f11=(field_11.getText());
         int f=Integer.parseInt(f11);
         
         String f12=(field_12.getText());
         int g=Integer.parseInt(f12);
         
         //enhanced for loop for book AutoRickshaw
         for(Vehicle RR : arr_list)
         {
             //
             if(RR instanceof AutoRickshaw)
             {
                 //downcasting
                 AutoRickshaw auto_obj = (AutoRickshaw) RR;
         
                 //comparison
                 if(auto_obj.getVehicle_id() == b)
                 {
                   //massage dilogs
                   JOptionPane.showMessageDialog(panel_3,"The input valid value for booking AutoRickshaw are: " + "\n" + "Vehicle ID: " + b + "\n"+
                   "Booked date: "+bookeddate+"\n"+ "Charge amount: "+ g +"\n"+ "Number of Seats: "+f);
                   //if autorickshaw is booked
                   if(auto_obj.getisbooked() == true)
                   {
                       JOptionPane.showMessageDialog(panel_3,"Your AutoRickshaw is already booked.");
                       break;
                   }
                   //if autorickshaw is  booked sucessfully
                   else if(auto_obj.getisbooked() == false)
                   {
                       auto_obj.book(bookeddate,f,g);
                       JOptionPane.showMessageDialog(panel_3,"The AutoRickshaw is booked Sucessfully.");
                       break;
                   }
                   
                 }
                 else if(auto_obj.getVehicle_id() != b)
                   {
                     JOptionPane.showMessageDialog(panel_3,"Please enter valid vehicle id!");
                   }
             }
         }
        }
        catch(NumberFormatException ae)
        {
          //massage box
          JOptionPane.showMessageDialog(panel_3,"Please enter correct value for "+"\n"+"Vehicle id" +"\n"+ "Booked date"+"\n"+"Charge Amount"+"\n"+
          "Number of Seats.");
         
        }
       }
       
       //Add an ElectricScooter
       else if(e.getSource() == button_8)
       {
         //exception handeling
         try
         {
           boolean b2 = false;
           
           String f13=(field_13.getText());
           int h=Integer.parseInt(f13);  
         
           String f14=(field_14.getText());
         
           String f15=(field_14.getText());
       
         
           String f16=(field_16.getText());
         
           String f17=(field_17.getText());
       
           String f18=(field_18.getText());
           int g=Integer.parseInt(f18);
           
           //for each loop
           for(Vehicle KK : arr_list)
           {
            //instanceof
            if(KK instanceof ElectricScooter)
            {
                //downcasting
                ElectricScooter auto_obj = (ElectricScooter) KK;
                 
                //comparison
                if(auto_obj.getVehicle_id() == h)
                 {
                     b2 = true;
                 }
            }
           }
           
           if(b2 == false)
           {
           ElectricScooter CC;
           CC = new ElectricScooter(h,f14,f15,f16,f17,g);
         
           //add to arrylist
           arr_list.add(CC);
         
           //massage box
           JOptionPane.showMessageDialog(panel_4,"Successfully Added ElectricScoote with value "+"\n"+"Vehicle ID: "+h+"\n"+" Vehicle name: "+f14+"\n"+
           "Vehicle weight: "+f15+"\n"+"vehicle colour: "+f16+"\n"+ "Vehicle speed: "+f17+"\n"+ "Battery Capacacity: "+g);
           }
           else if(b2 == true)
           {
                //massage box
            JOptionPane.showMessageDialog(panel_4,"The ElectricScooter with vehicle ID: "+h+" is already booked.");
           }
         }
          catch(NumberFormatException ae)
         {
           //massage box
           JOptionPane.showMessageDialog(panel_4,"please enter correct value for "+"\n"+"Vehicle ID"+"\n"+"Vehicle Name"+"\n"+"Vehicle Weight"+"\n"+
           "Vehicle Color"+"\n"+"Vehicle Speed"+"\n"+"Battry Capacity.");
         
         }
        
       }
       
       //sell the ElectricScooter
        else if(e.getSource() == button_9)
        {
         try{
           String f19=(field_19.getText());
           int h=Integer.parseInt(f19);  
           
           String f26=(field_26.getText());
           int z=Integer.parseInt(f26); 
           
        //enhanced for loop
         for(Vehicle OO : arr_list)
         {
            //instanceof
            if(OO instanceof ElectricScooter)
            {
                //downcasting
                ElectricScooter auto_obj = (ElectricScooter) OO;
                 
                //comparison
                if(auto_obj.getVehicle_id() == h)
                 {
                   //massage dilogs
                   JOptionPane.showMessageDialog(panel_4,"The input valid value for Selling ElectricScooter are: " + "\n" + "Vehicle ID: " + h + "\n"+
                   "price: "+z );
                   //if ElectricScooter is sold
                   if(auto_obj.gethassold() == true)
                   {
                       JOptionPane.showMessageDialog(panel_4,"Your ElectricScooter is already Sold.");
                       break;
                   }
                   //if ElectricScooter is  sold sucessfully
                   else if(auto_obj.gethassold() == false)
                   {
                       auto_obj.sell(z);
                       JOptionPane.showMessageDialog(panel_4,"The ElectricScooter is Sold Successfully. ");
                       break;
                   }
                   
                 }
                 else if(auto_obj.getVehicle_id() != h )
                   {
                     JOptionPane.showMessageDialog(panel_4,"Please enter valid vehicle id!");
                   }
             }
         }
        }
         catch(NumberFormatException ae)
         {
           //massage box
           JOptionPane.showMessageDialog(panel_4,"please enter correct value for"+"\n"+ "Vehicle ID"+"\n"+"Price.");
         
         }
        }
       
       //purchase the ElectricScooter
        else if(e.getSource() == button_11)
         {
         try{
         String f20=(field_20.getText());
         int h=Integer.parseInt(f20);
         
         String f21=(field_21.getText());
         
         String f22=(field_22.getText());
         int j=Integer.parseInt(f22);
         
         String f23=(field_23.getText());
         
         
         String f24=(field_24.getText());
         
         String f25=(field_25.getText());
         int k=Integer.parseInt(f25);
         
       
         //enhanced for loop
         for(Vehicle MM : arr_list)
         {
            //
            if(MM instanceof ElectricScooter)
            {
                //downcasting
                ElectricScooter auto_obj = (ElectricScooter) MM;
                 
                //comparison
                if(auto_obj.getVehicle_id() == h)
                 {
                   //massage dilogs
                   JOptionPane.showMessageDialog(panel_5,"The input valid value for Purchasing ElectricScooter are: " + "\n" + "Vehicle ID: " + h + "\n"+
                   "Brand: "+f21 +"\n"+ "Price: "+j+"\n"+ "Charge Time: "+f23+"\n"+ "Mileage: "+f24+"\n"+"Range: "+k);
                   //if ElectricScooter is purchase
                   if(auto_obj.gethaspurchased() == true)
                   {
                       JOptionPane.showMessageDialog(panel_5,"Your ElectricScooter is already Purchased.");
                       break;
                   }
                   //if ElectricScooter is  purchase sucessful
                   else if(auto_obj.gethaspurchased() == false)
                   {
                       auto_obj.purchase(f21,j,f23,f24,k);
                       JOptionPane.showMessageDialog(panel_5,"The ElectricScooter is Purchas Successfully. ");
                       break;
                   }
                 }
                 else if(auto_obj.getVehicle_id() != h )
                   {
                     JOptionPane.showMessageDialog(panel_5,"Please enter valid vehicle id!");
                   }
             }
              
         }
        }
         catch(NumberFormatException ae)
         {
           //massage box
           JOptionPane.showMessageDialog(panel_5,"please enter correct value for "+"\n"+"Vehicle ID"+"\n"+"Brand"+"\n"+"Price"+"\n"+"Charge Time"+"\n"+
           "MIleage"+"\n"+"Range.");
         
         }
    }
        
        //display button for Autorickshaw
        else if(e.getSource() == button_6)
        {
          String f1=(field_1.getText());
          int a=Integer.parseInt(f1);
             
          String f2=(field_2.getText());
         
          String f3=(field_3.getText());
         
          String f4=(field_4.getText());
        
          String f5=(field_5.getText());
         
          String f6=(field_6.getText());
          int b=Integer.parseInt(f6);
         
          String f7=(field_7.getText());
         
          String f8=(field_8.getText());
          int c=Integer.parseInt(f8);
         
          String f9=(field_9.getText());
          
          String yr = box_1.getSelectedItem().toString();
          String mon = box_2.getSelectedItem().toString();
          String day = box_3.getSelectedItem().toString();
          String bookeddate = yr + mon+day;

          String f11=(field_11.getText());
          int f=Integer.parseInt(f11);
         
          String f12=(field_12.getText());
          int g=Integer.parseInt(f12);
        
         //enhanced for loop
         for(Vehicle PP : arr_list)
         {
              
             //using instanceof 
             if(PP instanceof AutoRickshaw)
             {
                 //downcasting
                 AutoRickshaw auto_obj = (AutoRickshaw) PP;
                 //comparison
                if(auto_obj.getVehicle_id() == a)
                {
                  //calling the display method of autorickshaw
                  auto_obj.display();
                
                  //message dialog
                  JOptionPane.showMessageDialog(panel_3,"The valid list of value are: "+ "\n"+ "Vehicle ID: "+ a + "\n" + "Vehicle Name: "+f2+"\n"+
                  "Vehicle Weight: "+f3+"\n"+"Vehicle Color: "+f4+"\n"+"Vehicle Speed: "+f5+"\n"+"Engine displacement: "+ b +"\n"+"Torque: "+f7+"\n"+
                  "fuel tank capacity: "+c+"\n"+"Ground Clerance: "+f9+"\n"+"Booked date: "+bookeddate+"\n"+"Charge Amount: "+f+"\n"+"Number of seat: "+g);
                  
                }
             }
         }
        }
        
        //display button for electricscooter
        else if(e.getSource() == button_12)
        {
            String f13=(field_13.getText());
            int h=Integer.parseInt(f13);  
         
           String f14=(field_14.getText());
         
           String f15=(field_14.getText());
       
         
           String f16=(field_16.getText());
         
           String f17=(field_17.getText());
       
           String f18=(field_18.getText());
           int g=Integer.parseInt(f18); 
           
           String f26=(field_26.getText());
           int z=Integer.parseInt(f26); 
         
           String f21=(field_21.getText());
         
           String f22=(field_22.getText());
           int j=Integer.parseInt(f22);
         
           String f23=(field_23.getText());
         
         
           String f24=(field_24.getText());
         
           String f25=(field_25.getText());
           int k=Integer.parseInt(f25);
         
         for(Vehicle LL : arr_list)
         {
              
             //using instanceof 
             if(LL instanceof ElectricScooter)
             {
                 //downcasting
                 ElectricScooter auto_obj = (ElectricScooter) LL;
                 //comparison
                if(auto_obj.getVehicle_id() == h)
                {
                  //calling the display method of ElectricScooter
                  auto_obj. display();
                
                  //message dialog
                  JOptionPane.showMessageDialog(panel_5,"The valid list of value are: "+ "\n"+ "Vehicle ID: "+ h + "\n" + "Vehicle Name: "+f14+"\n"+
                  "Vehicle Weight: "+f15+"\n"+"Vehicle Color: "+f16+"\n"+"Vehicle Speed: "+f17+"\n"+"Battery Capacity: "+ g +"\n"+"Price of sell:"+z+"\n"+
                  "Brand: "+f21+"\n"+"Price of purchase: "+f22+"\n"+"Charge Time: "+f23+"\n"+"Mileage: "+f24+"\n"+"Range: "+k);
                  
                }
             }
         }
        }
       
        //clear for autorickshaw
        else if (e.getSource() == button_7)
        {
            field_1.setText("");
            field_2.setText("");
            field_3.setText("");
            field_4.setText("");
            field_5.setText("");
            field_6.setText("");
            field_7.setText("");
            field_8.setText("");
            field_9.setText("");
            field_10.setText("");
            field_11.setText("");
            field_12.setText("");
        }
        
        //clear for electricscooter
        else if (e.getSource() == button_13)
        {
            field_13.setText("");
            field_14.setText("");
            field_15.setText("");
            field_16.setText("");
            field_17.setText("");
            field_18.setText("");
            field_19.setText("");
            field_26.setText("");
            field_20.setText("");
            field_21.setText("");
            field_22.setText("");
            field_23.setText("");
            field_24.setText("");
            field_25.setText("");
        }
    }
     
    public  void m3()
    {
      //JFrame
      frame_3= new JFrame("ElectricScooter");
      frame_3.setLayout(null);
      frame_3.setBounds(280,75,1000,650);
      frame_3.setResizable(false);
      frame_3.setVisible(true);
      
      //JLabel of name2
      name_16 = new JLabel();
      name_16.setBounds(395,25,250, 25);
      name_16.setText("ElectricScooter");
      Font ff = new Font("Times New Romen",Font.PLAIN,30);
      name_16.setFont(ff);
      frame_3.add(name_16);
      
      //JPanel4
      panel_4= new JPanel();
      frame_3.add(panel_4);
      panel_4.setLayout(null);
      panel_4.setBounds(32,95, 450,485);
      panel_4.setBackground(Color.LIGHT_GRAY);
      
      //JPanel5
      panel_5= new JPanel();
      frame_3.add(panel_5);
      panel_5.setLayout(null);
      panel_5.setBounds(505,95, 450,485);
      panel_5.setBackground(Color.LIGHT_GRAY);
      
      //JLabel of name17
       name_17= new JLabel();
       name_17.setBounds(40,23,300,30);
       name_17.setText("Vehicle ID:");
       panel_4.add(name_17);
       
      //creating JTextfield13
      field_13 = new JTextField();
      field_13.setBounds(205,23,210,26);
      panel_4.add(field_13);
       
      //JLabel of name18
      name_18= new JLabel();
      name_18.setBounds(40,63,300,30);
      name_18.setText("Vehicle Name:");
      panel_4.add(name_18);
       
      //creating JTextfield14
      field_14 = new JTextField();
      field_14.setBounds(205,63,210,26);
      panel_4.add(field_14);
       
      //JLabel of name19
      name_19= new JLabel();
      name_19.setBounds(40,103,300,30);
      name_19.setText("Vehicle Weight:");
      panel_4.add(name_19);
       
      //creating JTextfield15
      field_15 = new JTextField();
      field_15.setBounds(205,103,210,26);
      panel_4.add(field_15);
       
      //JLabel of name20
      name_20= new JLabel();
      name_20.setBounds(40,143,300,30);
      name_20.setText("Vehicle Color:");
      panel_4.add(name_20);
       
      //creating JTextfield16
      field_16 = new JTextField();
      field_16.setBounds(205,143,210,26);
      panel_4.add(field_16);
       
      //JLabel of name21
      name_21= new JLabel();
      name_21.setBounds(40,183,300,30);
      name_21.setText("Vehicle Speed:");
      panel_4.add(name_21);
       
      //creating JTextfield17
      field_17 = new JTextField();
      field_17.setBounds(205,183,210,26);
      panel_4.add(field_17);
       
      //JLabel of name22
      name_22= new JLabel();
      name_22.setBounds(40,223,300,30);
      name_22.setText("Battery Capacity:");
      panel_4.add(name_22);
       
      //creating JTextfield18
      field_18 = new JTextField();
      field_18.setBounds(205,223,210,26);
      panel_4.add(field_18);
      
      //JButton_3
      button_8 = new JButton("Add an ElectricScooter");
      button_8.setBounds(40,283,378,35);
      button_8.addActionListener(this);
      panel_4.add(button_8);
      
      //JLabel of name23
      name_23= new JLabel();
      name_23.setBounds(40,348,300,30);
      name_23.setText("Vehicle ID:");
      panel_4.add(name_23);
       
      //creating JTextfield19
      field_19 = new JTextField();
      field_19.setBounds(205,348,210,26);
      panel_4.add(field_19);
      
      //JLabel of name23
      name_23= new JLabel();
      name_23.setBounds(40,388,300,30);
      name_23.setText("Price:");
      panel_4.add(name_23);
       
      //creating JTextfield19
      field_26 = new JTextField();
      field_26.setBounds(205,388,210,26);
      panel_4.add(field_26);
      
      //JButton_3
      button_9 = new JButton("Sell the ElectricScooter");
      button_9.setBounds(40,435,378,35);
      button_9.addActionListener(this);
      panel_4.add(button_9);
       
      //JButton_5
      button_10 = new JButton("Change for AutoRickshaw");
      button_10.setBounds(40,30,378,35);
      button_10.addActionListener(this);
      panel_5.add(button_10);
      
      //JLabel of name24
      name_24= new JLabel();
      name_24.setBounds(40,111,300,30);
      name_24.setText("Vehicle ID:");
      panel_5.add(name_24);
       
      //creating JTextfield20
      field_20 = new JTextField();
      field_20.setBounds(205,111,210,26);
      panel_5.add(field_20);
      
      //JLabel of name25
      name_25= new JLabel();
      name_25.setBounds(40,151,300,30);
      name_25.setText("Brand:");
      panel_5.add(name_25);
      
      //creating JTextfield21
      field_21 = new JTextField();
      field_21.setBounds(205,151,210,26);
      panel_5.add(field_21);
      
      //JLabel of name26
      name_26= new JLabel();
      name_26.setBounds(40,191,300,30);
      name_26.setText("Price:");
      panel_5.add(name_26);
       
      //creating JTextfield22
      field_22 = new JTextField();
      field_22.setBounds(205,191,210,26);
      panel_5.add(field_22);
       
       
      //JLabel of name27
      name_27= new JLabel();
      name_27.setBounds(40,231,300,30);
      name_27.setText("Charge Time:");
      panel_5.add(name_27);
       
      //creating JTextfield23
      field_23 = new JTextField();
      field_23.setBounds(205,231,210,26);
      panel_5.add(field_23);
      
      //JLabel of name28
      name_28= new JLabel();
      name_28.setBounds(40,271,300,30);
      name_28.setText("Mileage:");
      panel_5.add(name_28);
       
      //creating JTextfield24
      field_24 = new JTextField();
      field_24.setBounds(205,271,210,26);
      panel_5.add(field_24);
      
      //JLabel of name29
      name_29= new JLabel();
      name_29.setBounds(40,311,300,30);
      name_29.setText("Rang:");
      panel_5.add(name_29);
       
      //creating JTextfield25
      field_25 = new JTextField();
      field_25.setBounds(205,311,210,26);
      panel_5.add(field_25);
      
      //JButton_11
      button_11 = new JButton("Purchase the ElectricScooter");
      button_11.setBounds(40,371,374,35);
      button_11.addActionListener(this);
      panel_5.add(button_11); 
      
      //JButton_12
      button_12 = new JButton("Display");
      button_12.setBounds(73,433,140,36);
      button_12.addActionListener(this);
      panel_5.add(button_12);
       
        
      //JButton_13
      button_13 = new JButton("Clear");
      button_13.setBounds(243,433,140,36);
      button_13.addActionListener(this);
      panel_5.add(button_13);
    }
    
    public static void main(String[] args)
    {
        TransportGUI AA = new TransportGUI();
        AA.m1();
    }
    
    }
