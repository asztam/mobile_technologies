package pl.sztamborski;

public class Monitor {
    private int width = 3840;
    private int height = 1920;
    public static int MAX_HEIGHT = 3840; // ta zmienna jest wykorzystywana przez statyczna metode wiec tez musi byc static

    public void setLowResolution() {
        width = 800;
        height = 600;
    }

    public void setHighResolution() {
        width = 3840;
        height = 1920;
    }

    public String getResolution() {
        return width + "x" + height;
    }

    public static int getMaxHeight() { //metoda statyczna (pole statyczne) - dostepna do wywolania bez tworzenia instancji
        // tej klasy, w tej metodzie akurat wykorzystujemy zmienna wiec ona tez musi byc static (musi byc zgodnosc,
        // inaczej wyrzuci blad)
        return MAX_HEIGHT;
    }



}
