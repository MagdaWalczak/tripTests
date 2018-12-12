package wycieczka;

public abstract class Trip {
    private String destination;
    private Date start;
    private Date end;
    private double price;

    public Trip(String destination, Date start, Date end) {
        this.destination = destination;
        this.start = start;
        this.end = end;
    }

    public Trip(String destination, Date start, Date end, double price) {
        this.destination = destination;
        this.start = start;
        this.end = end;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Destination: "+this.destination+"\n"+ "Departure date: " +this.start+"\n"+ "Arrival date: " + this.end;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

