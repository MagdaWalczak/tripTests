package wycieczka;



public class Test {

    public static void main(String[] args) {
        TravelOffice to = new TravelOffice();

        Date start = new Date(2018, 11, 30);
        Date end = new Date(2018, 12, 13);
Trip trip;

        trip = new DomesticTrip("Rzeszow",
                new Date(2018, 12, 13),
                new Date(2018, 12, 29),
                90,
                20.53);
        ((DomesticTrip)trip).getPrice();
        to.addTrip("1", trip);

        trip = new AbroadTrip("Berlin",
                new Date(2019, 1, 13),
                new Date(2019, 2, 2),
                80.00,
                30.00);
        ((AbroadTrip)trip).getPrice();
        ((AbroadTrip)trip).getInsurance();
        to.addTrip("2", trip);



        Customer customer1 = new Customer("Jan Kowalski");
        customer1.setAddress(new Address("Marszalkowska 10", "00-876", "Warszawa"));
        customer1.assignTrip(to.getTripMap().get("1"));
        to.addCustomer(customer1);

        Customer customer2 = new Customer("Jozef Nowak");
        customer2.setAddress(new Address("Al. Jerozolimskie 120", "00-345", "Warszawa"));
        customer2.assignTrip(to.getTripMap().get("2"));
        to.addCustomer(customer2);

        Customer customer3 = new Customer("Jaroslaw Lis");
        customer3.setAddress(new Address("Swietokrzyska 14", "00-666", "Warszawa"));
        customer3.assignTrip(to.getTripMap().get("2"));
        to.addCustomer(customer3);

        System.out.println("liczba osob w travel office: " + to.getCustomerSet().size());
        to.removeCustomer(customer2);
        System.out.println("liczba osob w travel office: po remove: " + to.getCustomerSet().size());
//        System.out.println(domesticTrip);        customer1.assignTrip(domesticTrip);
        System.out.println( "osoba znajduje sie na liscie" + to.findCustomerByName("Jaroslaw Lis"));
        System.out.println("------------");
        System.out.println("liczba wycieczek: " + to.tripMap.size());
        to.addTrip("nowa", new DomesticTrip("Poznan ", start, end, 900, 30));
        System.out.println(to.getTripMap());

        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println("---------------------------");
        System.out.println(to);
    }





}
