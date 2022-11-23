package meetup.after;

import meetup.after.observers.MeetupOrganizer;
import meetup.after.observers.MeetupParticipant;
import meetup.after.subject.Receptionist;

public class Cient {
    

    public static void main(String[] args) {
		Receptionist receptionist = new Receptionist();
		receptionist.add(new MeetupOrganizer());
		receptionist.add(new MeetupParticipant());
		
		System.out.println("Participants are comming....");
		receptionist.setStatus(true);
	}
}
