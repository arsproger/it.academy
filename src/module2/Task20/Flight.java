package module2.Task20;

public class Flight {
    private int id;
    private String departureTime;
    private String arrivalTime;
    private Aircraft aircraft;
    private String status;


    public Flight(int id, String departureTime, String arrivalTime, Aircraft aircraft, String status) {
        this.id = id;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.aircraft = aircraft;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public Aircraft getAircraft() {
        return aircraft;
    }

    public String getStatus() {
        return status;
    }
}
