package GarageSystem;

import java.time.LocalTime;

public abstract class Park {
	public BestFit bestFit;
	public FirstFit firstFit;
	public PayFees pay;
	public DisplayFees Display;
	abstract public int parkIn(Vehicle vehicle, Garage garage);
	/*{
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
	}*/
	abstract public void parkOut(Vehicle vehicle, Garage garage);/*{
		vehicle.getPrice();
		
		int position=vehicle.slotID;
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
		
	}*/
	abstract public boolean checkIfNoPlace(Vehicle vehicle,Garage garage) ;//check if there's no place
	/*{
		if(garage.checkFull())
		{return true;} 
		return false;
	}*/
	abstract public LocalTime captureTime();/*{
		LocalTime start = LocalTime.now();
		return start;
	}*/
}
