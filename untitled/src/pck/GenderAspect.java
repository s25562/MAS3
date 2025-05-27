package pck;


import static pck.GenderType.MALE;

public class GenderAspect {

    private GenderType gender;
    private String maidenName;
    private boolean militaryService;

    public GenderAspect(GenderType gender) {
        this.gender = gender;
    }


    public GenderType getGender() {
        return this.gender;
    }

    public void setMaidenName(String name) throws Exception {
        if (gender == GenderType.FEMALE)
            this.maidenName = name;
        else
            throw new Exception("You are not FEMALE");

    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMilitaryService() throws Exception{
        if (gender == MALE)
            this.militaryService = true;
        else
            throw new Exception("You are not male");
    }

    public boolean getMilitaryService() {
        return militaryService;
    }
}