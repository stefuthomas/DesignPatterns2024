package Assignment16;

public class Main {
    public static void main(String[] args) {
        System.out.println("Smart remote for smart TV \n" +
                "-------------------------");
        Device smartTV = new SmartTV();
        SmartRemote smartRemote = new SmartRemote(smartTV);

        smartRemote.togglePower();
        smartRemote.volumeUp();
        smartRemote.volumeUp();
        smartRemote.volumeDown();
        smartRemote.channelUp();
        smartRemote.channelDown();

        smartRemote.setWebsite("www.google.com");
        smartRemote.browseInternet();
        smartRemote.setWebsite("www.youtube.com");
        System.out.println("Website is set to " + smartRemote.getWebsite());
        smartRemote.voiceControl();

        System.out.println("\nAdvanced remote for normal TV \n" +
                "-------------------------");
        Device tv = new TV();
        AdvancedRemote advancedRemote = new AdvancedRemote(tv);

        advancedRemote.togglePower();
        advancedRemote.volumeUp();
        advancedRemote.volumeUp();
        advancedRemote.volumeDown();
        advancedRemote.channelUp();
        advancedRemote.channelDown();
        advancedRemote.mute();
    }
}
