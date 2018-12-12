package wycieczka;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {

    static int customerCount = 0;


    Set<Customer> customerSet = new HashSet<>();
    Map<String, Trip> tripMap = new HashMap<>();


    void addTrip(String key, Trip trip) {
        tripMap.put(key, trip);
    }

    boolean removeTrip(String key) {
        if (tripMap.containsKey(key)) {
            tripMap.remove(key);
            return true;
        } else {
            return false;
        }
    }

    public Customer findCustomerByName(String name) {
        for (Customer c : customerSet) {
            if (c.getName().equals(name)) {
                return c;
            }
        }
        return null;
    }


    boolean removeCustomer(Customer customer) {
        if (customerSet.contains(customer)) {
            customerSet.remove(customer);
            return true;
        } else {
            return false;
        }
    }

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public Map<String, Trip> getTripMap() {
        return tripMap;
    }


     void addCustomer(Customer customer) {
        customerSet.add(customer);
    }

     int getCustomerCount() {
        return customerSet.size();
    }

    @Override
    public String toString() {
        String report = "";
        for (Customer c : customerSet) {
            report += c + "\n";
        }
        return report;
    }

}



