package parking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CarParking {
  


	public static void main(String[] args){  

		Scanner input = new Scanner(System.in);
		HashMap<Integer, Car> cars = new HashMap<Integer, Car>();
		Controller controller=new Controller(10);
		System.out.println("Parking area");
		
		while(true)
		{
		
		System.out.println("************  Select the option: *******");
		System.out.println("1: Car parking");		
		System.out.println("2: RegistrationNum search");
		System.out.println("3: Color search");
		System.out.println("4: Display all cars ");
		System.out.println("5: Exit Car");
		System.out.println("6: Exit");
        int c = input.nextInt();
        
        if(c==1)
		{
        	System.out.println("Enter car Reg No :");
        	String rgno=input.next();
        	System.out.println("Enter car Color :");
        	String color=input.next();
        	
        	int no=controller.parkCar(color, rgno);      	
        	if(no==0)
        		System.out.println("No slots available please come again later");
        	else
        		System.out.println("Your car is parked at "+no+" slot.");
        			
		}
        else if(c==2)
        {
        	System.out.println("searching by reg no");
        	String regNo=input.next();
        	controller.searchCarRegistrationNum(regNo);
        	
        } else if(c==3)
        {
        	System.out.println("searching by color");
        	String color=input.next();
        	controller.searchCarColor(color);
        	
        }
        else if(c==4)
        {
        	System.out.println("Showing all cars in parking");
        	controller.showDetails();
        	
        }
        else if(c==5)
        {
        	System.out.println("Return Slot num to exit from parking");
       
         	Integer slot=input.nextInt();
           	controller.unParking(slot);  
        } 
        else if(c==6)
        {
        	System.out.println("Thank you for choosing parking");
      
        	System.exit(1);
        }
        else
        {
        	System.out.println("Enter valid input");
        }
        
		}
		
        
	    }

	public Short getTotalNumberOfSlots() {
		// TODO Auto-generated method stub
		return null;
	}  	
}
