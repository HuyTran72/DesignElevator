public class ElevatorTest {
    private static char[] isdoorOpen;

    public static void main(String[] args) {
        Elevator elev = new Elevator(0, false, null, 0);

        elev.setCurrentFloor();
        elev.setIsdoorOpen(false);
        elev.setRequest(null);
        elev.setFloorNumber(0);

        System.out.println("CurrentFloor is" + elev.getcurrenFloor());
        System.out.println(isdoorOpen);
        System.out.println("Request Floor" + elev.getRequest());
    }
}
