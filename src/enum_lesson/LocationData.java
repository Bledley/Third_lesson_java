package enum_lesson;

public enum LocationData {

    GBR("London", "213.171.197.181"),
    ENG("London", "213.171.197.181");

    private final String city;
    private final String ip;

    LocationData(String city, String ip){
        this.city = city;
        this.ip = ip;
    }

    public String getCity(){
        return this.city;
    }

    public String getIp(){
        return this.ip;
    }

}
