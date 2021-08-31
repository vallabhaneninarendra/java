package parking;

public class Car {
	int slotNum=0;
	String carColor;
    String registrationNum;
    
    public Car(int slot,String color,String regno)
    {
    	slotNum=slot;
    	carColor=color;
    	registrationNum=regno;
    	
    }
  public int getSlotNumber() {
   	 return slotNum;
    }
 public void setSlotNumber(int slotNum) {
   	 this.slotNum = slotNum;
    }
 public String getCarColors() {
	 return carColor;
 }
 public void setCarColors(String carColor) {
	 this.carColor = carColor;
 }
 
 public String getRegistrationNumbers() {
   	 return registrationNum;
    }
 public void setRegistrationNumer(String registrationNum) {
   	 this.registrationNum = registrationNum;
   }
@Override
public String toString() {
	return "Car [slotNum=" + slotNum + ", carColor=" + carColor + ", registrationNum=" + registrationNum + "]";
}

}
