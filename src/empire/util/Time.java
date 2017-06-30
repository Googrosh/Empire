package empire.util;
public class Time {

	private int hour;
	private int minute;
	
	public Time() {
	}
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	
	public void setHour(int hour) {
		if(hour == 24)
			this.hour = 0;
		else
			this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute == 60)
			this.minute = 0;
		else
			this.minute = minute;
	}
	
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setTime(int hour, int minute) {
		if(hour == 24)
			this.hour = 0;
		else
			this.hour = hour;
		if(minute == 60)
			this.minute = 0;
		else
			this.minute = minute;
	}
	
	public int compareTo(Time time) {
		int res;
		if(hour < time.getHour())
			res = -1;
		else if(hour > time.getHour())
			res = 1;
		else if(minute < time.getMinute())
			res = -1;
		else if(minute > time.getMinute())
			res = 1;
		else
			res = 0;
		return res;
	}
	
	public void takeAwaySomeTime(Time time) {
		if(minute < time.getMinute()) {
			time.setMinute(time.getMinute() - minute);
			minute = 60 - time.getMinute();
			hour = hour - time.getHour() - 1;
		} else {
			hour = hour - time.getHour();
			minute = minute - time.getMinute();
		}
	}
	
	public String toString() {
		StringBuilder time = new StringBuilder("");
		if(hour < 10)
			time.append("0" + hour);
		else
			time.append(hour);
		time.append(":");
		if(minute < 10)
			time.append("0" + minute);
		else
			time.append(minute);
		return time.toString();
	}
}
