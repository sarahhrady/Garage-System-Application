package GarageSystem;
import java.util.*;

public class LoginVehicle {
	 public void Run(Vehicle obj)
	    {
	        Scanner sc= new Scanner(System.in);   
	        System.out.print("Enter Vehicle's Width: ");  
	        float  wid = sc.nextInt(); 
	        
	        System.out.print("Enter Vehicle's Height: ");  
	        float heig = sc.nextInt();
	        
	        Scanner sm= new Scanner(System.in); 

	        System.out.print("Enter Vehicle's Model Name: ");  
	        String modelN = sm.nextLine(); 

	        System.out.print("Enter Vehicle's Model Year: ");  
	        int ModelY = sc.nextInt(); 

	        obj.width=wid;
	        obj.depth=heig;
	        obj.modelName=modelN;
	        obj.modelYear=ModelY;

	    }
}
