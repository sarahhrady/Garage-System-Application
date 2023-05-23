package GarageSystem;

public class BestFit implements ParkingConfig{
	//@Override
	 public int pickSlot(Vehicle vehicle, Slot[] slots){
		int ID=-1;
		 for (int i=0; i<slots.length ; i++){
				if(slots[i].depth > vehicle.depth && slots[i].width > vehicle.width && slots[i].status!=true){
					ID = i+1;
					break;
				}
			}
			if (ID == -1){
				return -1;
			}
			for ( int i=0 ; i<slots.length ; i++){
				if(slots[i].depth > vehicle.depth && slots[i].width > vehicle.width && slots[i].status!=true){
					if (slots[i].depth < slots[ID-1].depth ||slots[i].width < slots[ID-1].width ){
						if ((slots[i].depth*slots[i].width)<(slots[ID-1].width*slots[ID-1].depth)){
							ID = i+1;
						}
						
					}
					
				}
			}
		
		return ID;
	}
}
