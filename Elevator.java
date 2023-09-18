
public class Elevator {
    public int currentFloor;
    public boolean isdoorOpen;
    public String request;
    public int floorNum;
    public int floorNumber; 
}

public Elevator(int currentFloor, boolean isdoorOpen, String request, int floorNum, int floorNumber) {
    this.currentFloor = currentFloor;
    this.isdoorOpen = isdoorOpen;
    this.request = request;
    this.floorNum = floorNum;
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


