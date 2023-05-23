package GarageSystem;
import java.time.*;
import java.time.temporal.*;

public class Vehicle {
	// Instance Variables
    String modelName;
    float width,depth,price;
    int slotID,IDnumber,modelYear;
    LocalTime entryTime = LocalTime.now();
    LocalTime exitTime = LocalTime.now();
    // Constructor Declaration of Class
    public Vehicle(String modelName, int slotID ,
                   int IDnumber, int modelYear, float width , float depth)
    {
        this.modelName = modelName;
        this.width = width;
        this.depth = depth;
        this.slotID = slotID;
        this.IDnumber = IDnumber;
        this.modelYear = modelYear;
    }
 /*
    // method 1
    public String getmodelName()
    {
        return modelName;
    }
 
    // method 2
    public int getslotID()
    {
        return slotID;
    }
 
    // method 3
    public int getIDnumber()
    {
        return IDnumber;
    }
 
    // method 4
    public int getmodelYear()
    {
        return modelYear;
    }
    public float getwidth()
    {
        return width;
    }
    public float getdepth()
    {
        return depth;
    }
    public void setmodelName(String newName) 
    {
    this.modelName = newName;
    }
    public void setslotID(int newslotID) 
    {
    this.slotID = newslotID;
    }    
    public void setIDnumber(int newIDnumber) 
    {
    this.IDnumber = newIDnumber;
    }    
    public void setmodelYear(int newmodelYear) 
    {
    this.modelYear = newmodelYear;
    }    
    public void setwidth(float newwidth) 
    {
    this.width = newwidth;
    }    
    public void setdepth(float newdepth) 
    {
    this.depth = newdepth;
    }*/
	public Vehicle(){
		
	}
	public float getPrice(){
		float Minutes = Duration.between(entryTime, exitTime).toMinutes();
		float hours;
		if (Minutes%60==0){
			hours=Minutes/60;
		}
		else
		{
			hours=Minutes/60+1;
		}
		price=hours*5;
		return price;
	}
}
