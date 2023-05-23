package GarageSystem;

import java.time.LocalTime;

public class ParkIn extends Park{
	
	@Override public int parkIn(Vehicle vehicle, Garage garage){
		bestFit=new BestFit();
		firstFit=new FirstFit();
		int position=-1;
		if(checkIfNoPlace(vehicle, garage)){
			System.out.println("There's no empty space in garage");
			return -1;
		}
		else if(garage.configuration==1){
			//System.out.println("here best fit");
			position=bestFit.pickSlot(vehicle, garage.slots);
			if (position!=-1){
				garage.slots[position-1].changeStatus();
				vehicle.slotID=position;
			}
			
		}
		else if(garage.configuration==2){
			position=firstFit.pickSlot(vehicle, garage.slots);
			if (position!=-1){
				garage.slots[position-1].changeStatus();
				vehicle.slotID=position;
			}
		}
		if (position==-1)
		{
			System.out.println("There's no available slot for your vehicle. ");
			return -1;
		}
		garage.vehicles[garage.numberOfVehicles]=vehicle;
		garage.numberOfVehicles++;
		vehicle.entryTime=captureTime();
		System.out.println("The slot picked for you is slot with ID: ");
		System.out.println(position);
		return position;
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
	@Override public void parkOut(Vehicle vehicle, Garage garage){};
}
