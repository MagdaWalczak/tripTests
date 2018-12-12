package wycieczka;

public class Address {
    private String zip;
    private String city;
    private String street;

    public Address(String zip, String city, String street) {
        this.zip = zip;
        this.city = city;
        this.street = street;
    }

    @Override
    public String toString() {
        return "city: "+this.city+ " "
                + " zip: " +this.street+ " "
                + "street "+this.zip;
    }


    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }


}
