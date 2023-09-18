
public class Elevator {
    public int currentFloor;
    public boolean isdoorOpen;
    public String request;
    public int floorNumber; 
}

public Elevator(int currentFloor, boolean isdoorOpen, String request, int floorNumber) {
    this.currentFloor = currentFloor;
    this.isdoorOpen = isdoorOpen;
    this.request = request;
    this.floorNumber = floorNumber;
}

public int getcurrenFloor() {
    return currentFloor;
}

public void setCurrentFloor(int currentFloor) {
    this.currentFloor = currentFloor;
}
public String getRequest() {
    return request;
}

public void setRequest(String request) {
    this.request = request;
}

public boolean getIsdoorOpen() {
    return isdoorOpen;
}

public void setIsdoorOpen(boolean isdoorOpen) {
    this.isdoorOpen = isdoorOpen;
}

public int getFloorNumber() {
    return floorNumber;
}

public void setFloorNumber(int floorNumber) {
    this.floorNumber = floorNumber;
}

public void setCurrentFloor() {
}


