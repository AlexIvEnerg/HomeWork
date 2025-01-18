public class Aspirant extends Student {
    protected String scientif; // научная работа

    public Aspirant(String firstName, String lastName, String group, String scientif) {
        super(firstName, lastName, group);
        this.scientif = scientif;
    }

    public Aspirant() {
    }

    @Override
    public double getScholarship() {        
        if(getAverageMark() == 5) setScolarship(2500);
        else setScolarship(2200);
        return scolarship;
    }

}
