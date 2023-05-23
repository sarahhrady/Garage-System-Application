package GarageSystem;

public class PayFees {
	public void payFees(){}
	public void payFees (Garage garage, Vehicle vehicle)
    {

        float x = vehicle.price;
        garage.income+=x;
        
    }
	
}
