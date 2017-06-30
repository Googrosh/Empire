package empire.util;
public class Date {

	private int day;
	private int month;
	private int year;
	
	public Date() {
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public Date(int day, String month, int year) {
		this.day = day;
		this.month = numberOfMonth(month);
		this.year = year;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getYear() {
		return year;
	}
	
	public void takeAwayOneDay() {
		if(day != 1)
			day = day - 1;
		else {
			if(month != 1) {
				month = month - 1;
				switch(month) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
					day = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					day = 30;
					break;
				case 2:
					if(year % 4 == 0)
						day = 29;
					else
						day = 28;
				}
			}
			else {
				month = 12;
				day = 31;
				year = year - 1;
			}
		}
	}
	
	public boolean checkDate() {
		boolean check = true;
		if(day == 31) {
			switch(month) {
			case 2:
			case 4:
			case 6:
			case 9:
			case 11:
				check = false;
			}
		} else if(day == 30 && month == 2) {
			check = false;
		} else if(day == 29 && month == 2 && year % 4 != 0) {
			check = false;
		}
		return check;
	}
	
	public int numberOfMonth(String month) {
		int num;
		if(month.compareToIgnoreCase("gennaio") == 0)
			num = 1;
		else if(month.compareToIgnoreCase("febbraio") == 0)
			num = 2;
		else if(month.compareToIgnoreCase("marzo") == 0)
			num = 3;
		else if(month.compareToIgnoreCase("aprile") == 0)
			num = 4;
		else if(month.compareToIgnoreCase("maggio") == 0)
			num = 5;
		else if(month.compareToIgnoreCase("giugno") == 0)
			num = 6;
		else if(month.compareToIgnoreCase("luglio") == 0)
			num = 7;
		else if(month.compareToIgnoreCase("agosto") == 0)
			num = 8;
		else if(month.compareToIgnoreCase("settembre") == 0)
			num = 9;
		else if(month.compareToIgnoreCase("ottobre") == 0)
			num = 10;
		else if(month.compareToIgnoreCase("novembre") == 0)
			num = 11;
		else
			num = 12;
		return num;
	}
	
	public String toString() {
		StringBuilder date = new StringBuilder("");
		if(day < 10)
			date.append("0" + day);
		else
			date.append(day);
		/*if(month < 10)
			date.append("0" + month);
		else
			date.append(month);*/
		switch(month) {
		case 1: date.append(" Gennaio "); break;
		case 2: date.append(" Febbraio "); break;
		case 3: date.append(" Marzo "); break;
		case 4: date.append(" Aprile "); break;
		case 5: date.append(" Maggio "); break;
		case 6: date.append(" Giugno "); break;
		case 7: date.append(" Luglio "); break;
		case 8: date.append(" Agosto "); break;
		case 9: date.append(" Settembre "); break;
		case 10: date.append(" Ottobre "); break;
		case 11: date.append(" Novembre "); break;
		case 12: date.append(" Dicembre "); break;
		}
		date.append(year);
		return date.toString();
	}
}
