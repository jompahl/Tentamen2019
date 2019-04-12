public class Test {

    public static void main(String[] args) {
        //Skapar hamn
        Marina marina = new Marina();

        marina.setAdress("Hamngatan 1");
        marina.setName("Aqua");

        //Skapar hyrasplatser
        Mooring m1 = new Mooring();
        Mooring m2 = new Mooring();
        Mooring m3 = new Mooring();
        Mooring m4 = new Mooring();

        m1.setNbr(1);
        m1.setRent(12000);
        m2.setNbr(2);
        m2.setRent(10000);
        m3.setNbr(3);
        m3.setRent(8000);
        m4.setNbr(4);
        m4.setRent(9000);

        //Skapar Hyrestagare
        Tenant h1 = new Tenant();
        Tenant h2 = new Tenant();
        Tenant h3 = new Tenant();
        Tenant h4 = new Tenant();
        Tenant h5 = new Tenant();
        Tenant h6 = new Tenant();

        h1.setName("Mats");
        h1.setNbr("h1");
        h2.setName("Viktoria");
        h2.setNbr("h2");
        h3.setName("Anders");
        h3.setNbr("h3");
        h4.setName("Anna");
        h4.setNbr("h4");
        h5.setName("Eva");
        h5.setNbr("h5");
        h6.setName("Sven");
        h6.setNbr("h6");

        //Dubbelkopplar alla
        marina.addMooring(m1);
        marina.addMooring(m2);
        marina.addMooring(m3);
        marina.addMooring(m4);

        m1.setMarina(marina);
        m2.setMarina(marina);
        m3.setMarina(marina);
        m4.setMarina(marina);

        m1.addTenant(h1);
        m1.addTenant(h2);
        m2.addTenant(h3);
        m2.addTenant(h4);
        m3.addTenant(h5);
        m3.addTenant(h6);

        h1.setMooring(m1);
        h2.setMooring(m1);
        h3.setMooring(m2);
        h4.setMooring(m2);
        h5.setMooring(m3);
        h6.setMooring(m3);

        //För alla Mooring i getAvailableMoorings skriv ut dens Nbr
        for(Mooring tmpMooring : marina.getAvailableMoorings()) {
            System.out.println(tmpMooring.getNbr());
        }

        System.out.println(marina.getRentsForMarina());


    }
}
