package Assignment16;

public class SmartRemote extends Remote {
    public SmartRemote(Device device) {
        super(device);
    }

    public void voiceControl() {
        System.out.println("Listening for voice commands...");
    }

    public void setWebsite(String website) {
        if (device instanceof SmartTV) {
            ((SmartTV) device).setWebsite(website);
        } else {
            System.out.println("This device does not support browsing the internet");
        }
    }

    public String getWebsite() {
        if (device instanceof SmartTV) {
            return ((SmartTV) device).getWebsite();
        } else {
            return "This device does not support browsing the internet";
        }
    }

    public void browseInternet() {
        if (device instanceof SmartTV) {
            ((SmartTV) device).browseInternet();
        } else {
            System.out.println("This device does not support browsing the internet");
        }
    }
}
