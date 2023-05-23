package GarageSystem;

public class DisplayTotalInc implements DisplayOnScreen{
	public void display(Garage obj)
    {
        float income=  obj.getTotalinc();
        System.out.print("The total income is");
        System.out.print(income);
    }
}
