package GarageSystem;

public class DisplayAvailSlots implements DisplayOnScreen {

    public void display (Garage obj) { 
        if(!obj.checkFull()){
            System.out.println("Empty slots IDs are: ");
               for (int i=0;i<obj.numberOfSlots ; i++){
                   if(obj.slots[i].status==false ){
                       System.out.println(obj.slots[i].slotID);
                   }
        }      
   }
        else{
            System.out.println("There's no empty slots. ");
        }
    }
}