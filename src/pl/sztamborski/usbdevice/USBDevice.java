package pl.sztamborski.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
