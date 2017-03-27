package es.unileon.prg.date;

public class Date{

private int day;
private int month;
private int year;
	
	public Date (int day, int month, int year){
		
		this.day=day;
		this.month=month;
		this.year=year;
	}
	int getDay(){
		return this.day;
	}
	int getMonth(){
		return this.month;
	}
	int getYear(){
		return this.year;
	}
	/*int getNumGuess(){
		int contador=0;
		Date randomDate;
		boolean end=false;
		while(!end){
			randomDate = new Date (this.year);
			contador++;
		}	
		if (this.equals(randomDate)){
			end=true;
		}

		return contador;
	}
	*/
	/*void setDay(int day){
		this.day=day;
	}
	*/
	boolean isSameYear (Date another){
		return another.year==this.year;
		
	}
	boolean isSameDay (Date another){
	if (this.day==another.getDay()){
		return true;
	}else{
		return false;
	}
	}

	private int countDaysOfTheMonth(int month){
		int n=0;
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				n=31;
			break;
			case 4:
			case 6:
			case 9:
			case 11:
				n=30;
			break;
			case 2:
				n=28;
			break;
		}
		return n;
	}
	int countDaysOfTheMonth(){
	return this.countDaysOfTheMonth(this.month);	
	}

	public int countDaysOfTheYear(){
	int year;
	int cont=0;
		for (int i=1;i<this.month;i++){
			cont=cont+countDaysOfTheMonth(i);
		}
	cont+=this.day;
	return cont;
	}
	
	




















}
