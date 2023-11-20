package lab6;

public class CivilService implements NationalService {

   private int DaysLeft;

   public CivilService(){
       this.DaysLeft = DaysLeft;
   }

   @Override
    public int getDaysLeft(){
       return DaysLeft;
   }

   @Override
    public void work(){
       if(DaysLeft > 0){
           DaysLeft--;
       }
   }




}
