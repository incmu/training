package lab6;

public class MilitaryService implements NationalService {

    private int DaysLeft;

    public MilitaryService(int DaysLeft){
        this.DaysLeft = DaysLeft;
    }

    @Override
    public int getDaysLeft(){
        return DaysLeft;
    }

    @Override
    public void work(){
        if(DaysLeft>0){
            DaysLeft--;
        }
    }
}
