package meetup.after.observers;

public class MeetupOrganizer implements Observer {

    public void meetupTime() {
		System.out.println("The meetup will start.");
	}

	@Override
	public void update(boolean status) {
		if(status) {
			meetupTime();
		} else {
			System.out.println("Hold on...");
		}
	}
    
}
