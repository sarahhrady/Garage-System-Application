package GarageSystem;

public class GarageOwner {
	String Email;
	String Password;
	public GarageOwner(){}
	public void set_credentials(String username , String pass){
        Email = username;
        Password = pass;
	}
	
	public String get_Username(){
        return Email;
	}
	
	public String get_Password(){
        return Password;
	}
}
