package GarageSystem;

import java.util.Scanner;

public class Screen {
	DisplayTotalInc dis=new DisplayTotalInc();
	GetNumOfVehicles totvehicles= new GetNumOfVehicles();
	DisplayAvailSlots emptyslots = new DisplayAvailSlots();
	Garage myGarage;
	GarageOwner owner;
	Authentication authenticate= new Authentication();
	SetGarage garagestarter = new SetGarage();
	Park parking;
	Vehicle tempVehicle;
	LoginVehicle instVehicle=new LoginVehicle();
	int option;
	int userType=2; // 1 for owner , 2 for driver
	Screen()
	{
		Scanner sc= new Scanner(System.in);
		myGarage=new Garage();
		owner=new GarageOwner();
    	authenticate.set_credentials(owner);
		garagestarter.setSlot(myGarage);
		garagestarter.setConfiguration(myGarage);
		garagestarter.setSlotDimensions(myGarage);
		System.out.print("Continue as 1-Garage Owner	2-Vehicle driver 	3-Exit");  
        userType = sc.nextInt();
        while(userType!=3)
        {
        	
            if (userType==1)
            {
        		OwnerOptions();
            }
            else if(userType==2)
            {
            	
            	tempVehicle=new Vehicle();
            	instVehicle.Run(tempVehicle);
            	DriverOptions();
            	
            }
            System.out.print("Continue as 1-Garage Owner	2-Vehicle driver 	3-Exit");  
            userType = sc.nextInt();
        }
        
	}
	public void OwnerOptions(){
		Scanner sc= new Scanner(System.in); 
		System.out.print("What action do you want:  \n");
		System.out.print("1-Display total income of my garage.  \n");
		System.out.print("2-Display number of vehicles in my garage. \n");
		System.out.print("3-Display empty slots in my garage. \n");
		System.out.print("4-Enter -1 to exit.  ");
		option = sc.nextInt();
        while(option!=-1)
        {
            if (option==1)
            {
            	dis.display(myGarage);
            }
            else if (option==2)
            {
            	totvehicles.run(myGarage);
            }
            else if(option==3)
            {
            	emptyslots.display(myGarage);
            }
            System.out.print("What action do you want:  \n");
    		System.out.print("1-Display total income of my garage.  \n");
    		System.out.print("2-Display number of vehicles in my garage. \n");
    		System.out.print("3-Display empty slots in my garage. \n");
    		System.out.print("4-Enter -1 to exit.\n");
    		option = sc.nextInt();
        }
	};
	public void DriverOptions(){
		Scanner sc= new Scanner(System.in);
		System.out.print("What action do you want:  ");
		System.out.print("1-Park in.  ");
		System.out.print("2-Park out.  ");
		System.out.print("3-Display empty slots.\n");
		option = sc.nextInt();
        if (option==1)
        {
        	parking = new ParkIn();
        	parking.parkIn(tempVehicle, myGarage);
        }
        else if (option==2)
        {
        	System.out.print("Enter your slot ID:");
        	int tempID = sc.nextInt();
        	for (int i =0 ; i<myGarage.numberOfVehicles ; i++)
        	{
        		if (myGarage.slots[i].slotID==tempID){
        			parking=new ParkOut();
        			parking.parkOut(myGarage.vehicles[i], myGarage);
        		}
        	}
        	
        }
        else if(option==3)
        {
        	emptyslots.display(myGarage);
        }

	}
	
}
