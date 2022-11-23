package meetup.before;

public class Client {
    
    public static void main(String[] args) {
		Receptionist receptionist = new Receptionist();
		MeetupOrganizer meetupOrganizer = new MeetupOrganizer(receptionist);
		
		meetupOrganizer.startMeetupIfPossible();
		
		System.out.println("5 minutes later...");
		meetupOrganizer.startMeetupIfPossible();
		
		System.out.println("5 minutes later...");
		meetupOrganizer.startMeetupIfPossible();
		
		System.out.println("Participants are comming");
		receptionist.setStatus(true);
		
		System.out.println("5 minutes later...");
		meetupOrganizer.startMeetupIfPossible();
	}

}
