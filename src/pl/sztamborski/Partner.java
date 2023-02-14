package pl.sztamborski;

public class Partner {
    private String name;
    private String meal;
    private int phoneNumber;
    private String pack;
    private boolean isStrategic;

    public Partner(String name, String meal, int phoneNumber, String pack, boolean isStrategic) {
        this.name = name.toUpperCase();
        this.meal = meal;
        this.phoneNumber = phoneNumber;
        this.pack = pack.toUpperCase();
        this.isStrategic = isStrategic;
    }

    public String getName() {
        return name;
    }

    public String getMeal() {
        return meal;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isStrategic() {
        return isStrategic;
    }

    public void displayPartnerInformation() {
        System.out.println("Nazwa: " + name);
        System.out.println("Preferowany posiłek: " + meal);
        System.out.println("Numer telefonu: " + phoneNumber);
        String isVeganString = isStrategic ? "tak" : "nie";
        System.out.println("Partner strategiczny: " + isStrategic);
        System.out.println();
    }
}
