package meetup.before;

public class MeetupOrganizer {
    
    private Receptionist receptionist;

    public MeetupOrganizer(Receptionist receptionist) {
        this.receptionist = receptionist;
    }

    public void startMeetupIfPossible() {
		if(receptionist.getStatus()) {
			meetupTime();
		} else {
			System.out.println("Hold on...");
		}
	}
	
	public void meetupTime() {
		System.out.println("The meetup will start.");
	}
}
