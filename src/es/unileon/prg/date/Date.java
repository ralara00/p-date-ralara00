package es.unileon.prg.date;

public class Date{

private int day;
private int month;
private int year;
	
	public Date (int day, int month, int year){
		
		this.day=day;
		this.month=month;
		this.year=year;

		this.isRightDay(day, month);
	}

	public int getDay(){
		return this.day;
	}

	public int getMonth(){
		return this.month;
	}

	public int getYear(){
		return this.year;
	}

	//Arreglarlo en los paréntesis del getNumGuess o en el Date randomDate;
	int getNumGuess(){
		int contador=0;
		Date randomDate;
		boolean end=false;
		do{
			randomDate = new Date (this.day, this.month, this.year);
			contador++;
			
			if (this.equals(randomDate)){
				end=true;
			}
		}while(!end);
		return contador;
	}
	
	/*void setDay(int day){
		this.day=day;
	}
	*/
	boolean isSameYear (Date another){
		return another.year==this.year;
		
	}
	boolean isSameDay (Date another){
		return another.day==this.day;
	}

	boolean isSameMonth (Date another){
		return another.month==this.month;
	}

	boolean isSame (Date another){
		if (this.day==another.getDay() && this.month==another.getMonth() && this.year==another.getYear()){
		return true;
		}else{
		return false;
		}
	}

	boolean isRightDay(int day, int month){
		if (day<1 && day>this.numDaysMonth(month)){
			return false;
		}else{
			return true;
		}
	}
	
	private int numDaysMonth(int month){
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
			default:
				n=-1;
				
		}
		return n;
	}
	int numDaysMonth(){
	return this.numDaysMonth(this.month);	
	}
	
	private String monthSeason(int month){
		String n="";
		switch(month){
			case 1:
			case 2:
			case 12:
				n="Invierno";
			break;
			case 4:
			case 5:
			case 3:
				n="Primavera";
			break;
			case 7:
			case 8:
			case 6:
				n="Verano";
			break;
			case 10:
			case 11:
			case 9:
				n="Otoño";
			break;
		}
		return n;
	}
	String monthSeason(){
	return this.monthSeason(this.month);	
	}

	private String monthName (int month){
		String n="";
		switch(month){
			case 1:
				n="Enero";
			break;
			case 2:
				n="Febrero";
			break;
			case 3:
				n="Marzo";
			break;
			case 4:
				n="Abril";
			break;
			case 5:
				n="Mayo";
			break;
			case 6:
				n="Junio";
			break;
			case 7:
				n="Julio";
			break;
			case 8:
				n="Agosto";
			break;
			case 9:
				n="Septiembre";
			break;
			case 10:
				n="Octubre";
			break;
			case 11:
				n="Noviembre";
			break;
			case 12:
				n="Diciembre";
			break;
			
		}
		return n;
	}
	String monthName(){
	return this.monthName(this.month);	
	}

	public int numberMonthsUntilEndOfTheYear(){
		int cont=0;
		for (int i=this.month;i<12;i++){
			cont=cont + 1;
		}
		return cont;
	}

	/*private String monthsUntilEndOfTheYear(int month){
		String mon="";
		for (String i=this.monthName();i!=mon;i++){
			mon=i+1;
		}
		return mon;
	}
	String monthsUntilEndOfTheYear(){
	return this.monthsUntilEndOfTheYear(this.month);	
	}*/

	//Falta que imprima todas las fechas
	public int daysUntilEndOfTheMonth(){
		int cont=0;
		for (int i=this.day;i<31;i++){
			cont=cont + 1;
			//System.out.println(Date);			
		}
		return cont;
	}

	/*public String monthsWithSameDays(int month){
		//int numDaysMonth(int month);
		int months=0;
		for (int i=this.month;i<12;i++){
			months=this.getMonth+1;
			System.out.println(this.month);		
		}
		return months;
	}
*/
	/*public int countDaysOfTheYear(){
	int year;
	int cont=0;
		for (int i=1;i<this.month;i++){
			cont=cont+countDaysOfTheMonth(i);
		}
	cont+=this.day;
	return cont;
	}
	*/

	//Que sume los días del primer mes, los del segundo, y fuera del for los del mes actual, y devuelva todo en el contador

	/*public int daysFromTheFirstOne(){
		int count=0;
		for (int i=1;i<=this.month;i++){
			count=count + this.numDaysMonth(this.month);
		}
		count=count-this.daysUntilEndOfTheMonth();
		return count;
	}
	*/
	public int daysFromTheFirstOne(){
		int count=0;
		for (int i=1;i<this.month;i++){
			count=count + this.numDaysMonth(this.month);
		}
		count=count+this.day;
		return count;
	}
	


	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}
	




















}
