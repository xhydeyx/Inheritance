import java.time.LocalDate;

public class PastEvents{
    public static final double eventCost=10_000;

    private LocalDate eventStartDate;
    private LocalDate eventEndDate;
    private String paymentStatus;
    private boolean requiresExtension;
    private String paymentDetails;
    private int totalParticipants;
    private int totalEventDays;
    private String eventID;
    private String eventName;
    private String eventLocation;
    private String pointOfContact;

    public PastEvents(String eventID,String eventName,String eventLocation,String pointOfConntact,int totalParticipants,int totalEventDays,LocalDate eventStartDate,LocalDate eventEndDate,
    String paymentStatus,boolean requiresExtension){
        this.eventStartDate=eventStartDate;
        this.eventEndDate=eventEndDate;
        this.paymentStatus=paymentStatus;
        this.requiresExtension=requiresExtension;
        this.totalParticipants=totalParticipants;
        this.totalEventDays=totalEventDays;
        this.eventID=eventID;
        this.eventName=eventName;
        this.eventLocation=eventLocation;
        this.pointOfContact=pointOfConntact;
    }

    public LocalDate getEventStartDate() {
        return eventStartDate;
    }

    public void setEventStartDate(LocalDate eventStartDate) {
        this.eventStartDate = eventStartDate;
    }

    public LocalDate getEventEndDate() {
        return eventEndDate;
    }

    public void setEventEndDate(LocalDate eventEndDate) {
        this.eventEndDate = eventEndDate;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public boolean isRequiresExtension() {
        return requiresExtension;
    }

    public void setRequiresExtension(boolean requiresExtension) {
        this.requiresExtension = requiresExtension;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public int getTotalParticipants() {
        return totalParticipants;
    }

    public void setTotalParticipants(int totalParticipants) {
        this.totalParticipants = totalParticipants;
    }

    public int getTotalEventDays() {
        return totalEventDays;
    }

    public void setTotalEventDays(int totalEventDays) {
        this.totalEventDays = totalEventDays;
    }

    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getPointOfContact() {
        return pointOfContact;
    }

    public void setPointOfContact(String pointOfContact) {
        this.pointOfContact = pointOfContact;
    }

    public void setPaymentDetails(String paymentStatus,boolean requiresExtension) {
        this.paymentDetails = "The event cost was"+eventCost+"and the payment status is"+paymentStatus+"The Customer requires extension?:"+requiresExtension;
    }

    @Override 
    public String toString(){
        return "\n"+"Event ID:"+getEventID()+"\n"+"The past event details:"+"\n"+
        "The payment details are as folloes:"+"\n"+
        paymentDetails;
    }
}
