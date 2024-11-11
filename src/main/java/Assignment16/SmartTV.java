package Assignment16;

public class SmartTV implements Device {
    private boolean on = false;
    private int volume = 30;
    private int channel = 1;
    private String website;

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void enable() {
        on = true;
        System.out.println("SmartTV is enabled");
    }

    @Override
    public void disable() {
        on = false;
        System.out.println("SmartTV is disabled");
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Volume is set to " + this.volume);
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
        System.out.println("Channel is set to " + this.channel);
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void browseInternet() {
        System.out.println("Browsing the internet at " + website);
    }
}
