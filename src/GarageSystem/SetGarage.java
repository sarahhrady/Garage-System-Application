package GarageSystem;
import java.util.*;

public class SetGarage {
	 public void setSlot (Garage obj)
	    {
	        //Scanner sc= new Scanner(System.in);   
	        

	    }

	    public void setSlotDimensions (Garage obj)
	    {
	    	Scanner sc= new Scanner(System.in); 
	        System.out.print("Enter the number of slots in gargae: \n");  
	        obj.numberOfSlots = sc.nextInt();
	        
	    	obj.slots = new Slot[obj.numberOfSlots];
			for (int i=0; i<obj.numberOfSlots ; i+=1){
				obj.slots[i] = new Slot();
				obj.slots[i].slotID=i+1;
				obj.slots[i].status=false;
			}
			obj.vehicles = new Vehicle[obj.numberOfSlots];
			for (int i=0; i<obj.numberOfSlots ; i+=1){
				obj.vehicles[i] = new Vehicle();
			}
	         
	        System.out.print("Enter the dimensions of the slots: \n"); 
	        for (int i=0; i<obj.numberOfSlots; i++)
	        {  
	            System.out.print("Enter the width of slot "); 
	            System.out.print(i+1);   
	            obj.slots[i].width = sc.nextFloat(); 
	            System.out.print("Enter the depth of slot "); 
	            System.out.print(i+1);   
	            obj.slots[i].depth = sc.nextInt();
	        }
	        
	    }

	    public void setConfiguration(Garage obj){
	    	System.out.print("Enter the configuration for your Garage: 1-\"Best fit\" or 2-\"First fit\""); 
	    	Scanner sc= new Scanner(System.in);
	    	int choice=sc.nextInt(); 
			
	    	obj.configuration=choice;
	}

}
