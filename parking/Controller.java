package parking;

import java.util.HashMap;
import java.util.Map;

public class Controller {
	
   Map<Integer,Car> cars=new HashMap<Integer,Car>();
   Integer totalNumberofSlots=5;
//   public Controller(int totalNumberofSlots) {
//	   this.totalNumberofSlots = totalNumberofSlots;
//   }

  public int parkCar(String color,String regNo)
   {
	   int slot=getNextSlot();
	   
	   Car car=new Car(slot, color,regNo);
	   cars.put(slot, car); 
	   
	   return slot;
   }


public int getNextSlot()
   {
	   int next=0;
	   System.out.println("Avilable cars in parking "+cars.size() );
	   for(int i=1;i<=totalNumberofSlots;i++ )
	   {	
		   
		   if(cars.get(i) == null)
		   {
		   System.out.println("Avilable slot is "+i);
		   return i++;		   
		   }
	   }	   
	   return next;	   
   }
   //loop through map
 public void showDetails()
   {
	if(cars.size()==0) {
		System.out.println("No Cars in parking lot");
	}else
	{
		   for (Map.Entry<Integer,Car> entry : cars.entrySet()) {
	         System.out.println("\n **Car slot :" + entry.getKey());
	         System.out.println("Registration number: " + entry.getValue().getRegistrationNumbers());
	         System.out.println("Color: " + entry.getValue().getCarColors());
	      }
    }
		
	   
  }

 public  void searchCarRegistrationNum(String regno) {
	 if(cars.size()==0) {
		 System.out.println("\n No Cars in parking lot \n");
	 }else {
		 boolean found = false;
	      for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
	          if(entry.getValue().getRegistrationNumbers().equalsIgnoreCase(regno)) {
	              System.out.println("slot number:" + entry.getValue().getSlotNumber());
	              found = true;
	              break;
	          }
	      }
	      if(!found) {
	          System.out.println("\n registration number not found \n");
	      }
	 }
	 
	
 }
 public void searchCarColor(String color) {
	 if(cars.size()==0) {
		 System.out.println("\n No Cars in parking lot \n");
	 }else {
		 boolean found = false;
	      for (Map.Entry<Integer, Car> entry : cars.entrySet()) {
	          if(entry.getValue().getCarColors().equalsIgnoreCase(color)) {
	              System.out.println("slot number: " + entry.getValue().getSlotNumber());
	              System.out.println("Reg number: " + entry.getValue().getRegistrationNumbers());
	              found = true;
	             
	          }
	      }
	      if(!found) {
	          System.out.println("\n cars not found \n");
	      }
	 }
 }
public Map<Integer, Car> unParking(Integer slot) 
{
	int slot2 = slot;
    cars.remove(slot2);
	System.out.println("Slot removed "+slot2);
	return cars;	 
 }


public Integer getTotalNumberOfSlots() {
	return totalNumberofSlots;
}

}
