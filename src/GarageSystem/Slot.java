package GarageSystem;

public class Slot {
	float width;
	float depth;
	boolean status;
	int slotID;
	public Slot(){
		status=false;
	}
	public Slot(float w, float d){
		width=w;
		depth=d;
		status=false;
	}
	public void changeStatus(){
		if (status==false){
			status=true;
		}
		else{
			status=false;
		}
	}
	
}