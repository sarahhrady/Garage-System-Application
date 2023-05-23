package GarageSystem;
import java.util.*;

public class Authentication {
	String Email;
	String Password;
	public void set_credentials(GarageOwner owner){
		Scanner sc= new Scanner(System.in);   
        System.out.print("Enter your Email: ");
        String mail = sc.nextLine();
        this.Email = mail;
        owner.Email=mail;
        System.out.print("Enter yourPassword: ");
        String pass = sc.nextLine();
        this.Password = pass;
        owner.Password=mail;
	}
	
	public String get_Email(){
        return Email;
	}
	
	public String get_Password(){
        return Password;
	}
	
	public boolean CheckEmail_Pass(String mail, String pass){
        if(pass == Password && mail == Email ) return true;
        else return false;
    }    
}
