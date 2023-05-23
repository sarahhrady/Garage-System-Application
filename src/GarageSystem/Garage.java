package GarageSystem;
import java.util.Scanner;
import java.time.*;
import java.time.temporal.*;

public class Garage {
	int numberOfVehicles=0;
	int numberOfSlots;
	int configuration;
	int slotCounter=0;
	float income=0;
	GarageOwner owner;
	Slot slots[];
	Vehicle vehicles[];
	Garage(){
		
	}
	public boolean checkFull(){
		if(numberOfVehicles==numberOfSlots){
			return true;
		}
		else{
			return false;
		}
	}
	public float getTotalinc(){
		return income;
	}
}