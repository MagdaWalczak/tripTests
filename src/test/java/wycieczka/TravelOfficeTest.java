package wycieczka;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class TravelOfficeTest {

    static TravelOffice travelOffice;
    static Customer customer;
    static Customer customer1;
    static Trip trip;
    static Date start;
     static Date end;

    @BeforeClass
    public static void inicjalizuj () {
        travelOffice=new TravelOffice();
        customer=new Customer("Jan Kowalski");
        customer1=new Customer ("Anna Dymna");
        trip = new DomesticTrip("Poznan", start, end, 100, 20);
    }

    @Test
    public void shouldAddCustomer1() {
        Set<Customer> customers = new HashSet<>();
        customers.add(customer);
        travelOffice.addCustomer(customer);
        assertArrayEquals(customers.toArray(), travelOffice.getCustomerSet().toArray());
    }

    @Test
    public void shouldAddCustomer2() {
       customer = new Customer("Anna Dymna");
        travelOffice.addCustomer(customer);
        assertTrue(travelOffice.getCustomerCount()==1);
    }

    @Test
    public void shouldAddTrip() {
        travelOffice.addTrip("1", trip);
        assertTrue(travelOffice.getTripMap().size()==1);
    }

    @Test
    public void shouldRemoveTrip() {
        travelOffice.addTrip("1", trip);
        travelOffice.addTrip("2", trip);
        travelOffice.removeTrip("1");
        assertFalse(travelOffice.getTripMap().containsKey("1"));
    }

    @Test
    public void shouldFindCustomerByName() {
        travelOffice.addCustomer(customer);
//        if (c.toString().startsWith("Name: "+ name + "\n")) {
        assertTrue(travelOffice.findCustomerByName("Jan Kowalski").getName()
                .equals(customer.getName()));
    }

    @Test
    public void shouldRemoveCustomer() {
        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer);
        assertTrue(travelOffice.removeCustomer(customer1));
    }

    @Test
    public void shouldRemoveCustomer2() {
        travelOffice.addCustomer(customer1);
        travelOffice.addCustomer(customer);
        travelOffice.removeCustomer(customer1);
        assertEquals(1, travelOffice.getCustomerSet().size());
    }

    @Test
    public void shouldgetCustomerCount() {
        travelOffice.addCustomer(customer);
        travelOffice.addCustomer(customer1);
        assertTrue(travelOffice.getCustomerSet().size()==2);
    }
}