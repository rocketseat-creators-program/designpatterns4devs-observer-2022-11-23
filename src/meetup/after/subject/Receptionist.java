package meetup.after.subject;

public class Receptionist extends Subject {

    private boolean status = false;
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean newStatus) {
		this.status = newStatus;
		notifyObservers(newStatus);
	}
    
}
