import java.util.ArrayList;

public class Marina {

    private String adress;
    private String name;
    private ArrayList<Mooring> mooringList = new ArrayList<Mooring>();

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addMooring(Mooring p) {
        mooringList.add(p);
    }

    public Mooring findMooring(int nbr) {
        for(Mooring tmpMooring : mooringList) {
            if(nbr == tmpMooring.getNbr()) {
                return tmpMooring;
            }
        }
        return null;
    }

    public void addTenant(Tenant h, int mooringNbr) {
        Mooring mooring = findMooring(mooringNbr);

        if(mooring != null) {
            mooring.addTenant(h);
        }
    }

    public double getRentsForMarina() {
        double totalRent = 0;

        for (Mooring tmpMooring : mooringList) {
            totalRent += tmpMooring.getRent();
        }
        return totalRent;
    }

    public ArrayList<Mooring> getAvailableMoorings() {
        ArrayList<Mooring> availableMoorings = new ArrayList<>();

        for(Mooring tmpMooring : mooringList) {
            if(tmpMooring.getTenantList().isEmpty()) {
                availableMoorings.add(tmpMooring);
            }
        }
        return availableMoorings;
    }
}
