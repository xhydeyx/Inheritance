public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent=new ConferenceEvent("E001", "AI Conference", "Paris", "Peng Tian", 0, 0, 0, 0, 0, 0);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);

        MusicConcertEvent musicConcertEvent=new MusicConcertEvent("E002", "Music", "School", "AA", 0, 0, 0, 0);
        musicConcertEvent.calculateEventCost();
        System.out.println(musicConcertEvent);
    }
}