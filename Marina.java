import java.util.ArrayList;

public class Marina {

	private String address;
	private String name;
	private ArrayList<Mooring> mooringList = new ArrayList<>();
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Mooring> getMooringList() {
		return mooringList;
	}
	public void setMooringList(ArrayList<Mooring> mooringList) {
		this.mooringList = mooringList;
	}	
	
	public void addMooring(Mooring p) {
		mooringList.add(p);
	}
	
	public Mooring findMooring(int nbr) {
		for(Mooring tmpMooring : mooringList) {
			if(tmpMooring.getNbr() == nbr) {
				return tmpMooring;
			}
		}
		return null;
	}
	
	public void addTenant(Tenant h, int mooringNbr) {
		Mooring tmpMooring = this.findMooring(mooringNbr);
		
		if(tmpMooring != null) {
			tmpMooring.addTenant(h);
			h.setMooring(tmpMooring);
		}
	}
	
	public ArrayList<Mooring> getAvailableMoorings() {
		ArrayList<Mooring> tmpList = new ArrayList<>();
		
		for(Mooring tmpMooring : mooringList) {
			if(tmpMooring.getTenantList().isEmpty()) {
				tmpList.add(tmpMooring);
			}
		}
		return tmpList;
	}
	
	public double getRentsForMarina() {
		double totalRent = 0;
		
		for(Mooring tmpMooring : mooringList) {
			if(!tmpMooring.getTenantList().isEmpty()) {
				totalRent += tmpMooring.getRent();
			}
		}
		return totalRent;
	}
	
}




