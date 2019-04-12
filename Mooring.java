import java.util.ArrayList;

public class Mooring {

    private int nbr;
    private double rent;
    private Marina marina;
    private ArrayList<Tenant> tenantList = new ArrayList<Tenant>();

    public int getNbr() {
        return nbr;
    }

    public void setNbr(int nbr) {
        this.nbr = nbr;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public Marina getMarina() {
        return marina;
    }

    public void setMarina(Marina marina) {
        this.marina = marina;
    }

    public ArrayList<Tenant> getTenantList() {
        return tenantList;
    }
    public void addTenant(Tenant h) {
        tenantList.add(h);
    }

    public Tenant findTenant(String nbr) {

        for(Tenant tmpTenant : tenantList) {
            if(tmpTenant.getNbr().equals(nbr)) {
                return tmpTenant;
            }
        }
        return null;
    }
}
