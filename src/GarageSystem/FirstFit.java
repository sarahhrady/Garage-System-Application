package GarageSystem;

public class FirstFit implements ParkingConfig{
	public int pickSlot(Vehicle vehicle, Slot slots[]){
		for (int i=0;i<slots.length ; i++){
			if(slots[i].status==false){
				if (vehicle.width<=slots[i].width && vehicle.depth<=slots[i].depth){
					return ++i;
				}
			}
			
		}
		return -1;
	}
}
