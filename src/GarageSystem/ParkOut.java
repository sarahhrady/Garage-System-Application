package GarageSystem;

import java.time.LocalTime;

public class ParkOut extends Park{
	@Override public void parkOut(Vehicle vehicle, Garage garage){
		vehicle.getPrice();
		Display= new DisplayFees();
		pay=new PayFees();
		int position;
		position=vehicle.slotID;
		Display.display(vehicle); //display fees
		pay.payFees(garage, vehicle); //pay fees
		garage.slots[position-1].changeStatus();
		//garage.vehicles[garage.numberOfVehicles]=null;
		vehicle.exitTime=captureTime();
		for (int i=0 ; i<garage.numberOfVehicles ; i++)
		{
			if (garage.slots[i].slotID==vehicle.slotID)
			{
				garage.slots[i]=null;
				garage.numberOfVehicles--;
			}
			
		}
		
	}
	@Override public boolean checkIfNoPlace(Vehicle vehicle,Garage garage) //check if there's no place
	{
		if(garage.checkFull())
		{return true;} 
		return false;
	}
	@Override public LocalTime captureTime(){
		LocalTime start = LocalTime.now();
		return start;
	}
	@Override public int parkIn(Vehicle vehicle, Garage garage){return -1;};
}
