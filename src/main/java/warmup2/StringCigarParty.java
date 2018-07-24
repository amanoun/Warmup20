package warmup2;

public class StringCigarParty {

    public boolean cigarParty(int cigars, boolean isWeekend) {


        if (cigars >= 40 && cigars <= 60) {
            return true;

        } else if (isWeekend == true && cigars > 60) {
            return true;
        }
        return false;
    }

}
