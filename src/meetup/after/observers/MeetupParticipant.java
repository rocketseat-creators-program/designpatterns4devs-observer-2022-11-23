package meetup.after.observers;

public class MeetupParticipant implements Observer {

    public void sendData() {
		System.out.println("RG: 329893832");
	}

	@Override
	public void update(boolean status) {
		if(status) {
			sendData();
		} else {
			System.out.println("Sleep...");
		}
	}
    
}
