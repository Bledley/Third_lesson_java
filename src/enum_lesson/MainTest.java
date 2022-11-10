package enum_lesson;

public class MainTest {
    public static void main(String[] args) {
        LocationData[] locationData = LocationData.values();
        for (int i = 0; i < locationData.length; i++){
            System.out.println(locationData[i].toString() + " ip: " + locationData[i].getIp());
        }
        LocationData temp = LocationData.valueOf(LocationData.GBR.name());
        System.out.println("City: " + temp.getCity() + " ip: " + temp.getIp());

    }
}
