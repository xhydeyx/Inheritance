import java.time.LocalDate;

public class Main {
    public static void main(String[] args) throws Exception {
        ConferenceEvent conferenceEvent=new ConferenceEvent("E001", "AA", "aa", "dd", 50, 3, 4, 5, 6);
        System.out.println(conferenceEvent);

        MusicConcertEvent musicConcertEvent=new MusicConcertEvent("E002", "BB", "bb", "ee", 200, 2, 50);
        musicConcertEvent.calculateEventCost();
        System.out.println(musicConcertEvent);

        PastEvents pastEvent=new PastEvents("E003", "CC", "cc", "gg", 50, 3, LocalDate.of(2024, 03, 01), LocalDate.of(2024, 03, 25), "Paid", true);
        pastEvent.setPaymentDetails("Paid",true);
        System.out.println(pastEvent);
    }
}