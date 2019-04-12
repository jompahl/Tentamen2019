public class Tenant {

    private String nbr;
    private String name;
    private Mooring mooring;

    public String getNbr() {
        return nbr;
    }

    public void setNbr(String nbr) {
        this.nbr = nbr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mooring getMooring() {
        return mooring;
    }

    public void setMooring(Mooring mooring) {
        this.mooring = mooring;
    }
}
