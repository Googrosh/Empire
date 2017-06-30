package empire.ui;
import empire.util.Date;
import empire.util.Time;

public class EmpireUI {
	
	public EmpireUI() {
	}
	
	public static String start(Date arrivalDate, Time arrivalTime, Time travelTime) {
		int compare;
		for(int i = 0; i < (travelTime.getHour() / 24); i++)
			arrivalDate.takeAwayOneDay();
		travelTime.setHour(travelTime.getHour() % 24);
		compare = arrivalTime.compareTo(travelTime);
		if(compare >= 0) { // arrivalTime >= travelTime
			arrivalTime.takeAwaySomeTime(travelTime);
		} else { // arrivalTime < travelTime
			arrivalDate.takeAwayOneDay();
			travelTime.takeAwaySomeTime(arrivalTime);
			arrivalTime.setTime(23 - travelTime.getHour(), 60 - travelTime.getMinute());
		}
		return arrivalDate.toString() + " - " + arrivalTime.toString();
	}
}
