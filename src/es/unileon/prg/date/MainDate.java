package es.unileon.prg.date;

public class MainDate{
	public static void main(String[] args){
		Date today, tomorrow;
		today=new Date (20,3,2017);
		tomorrow=new Date (28,3,2017);	
		System.out.println("Comparación entre hoy y mañana: "+today.isSame(tomorrow));
		System.out.println("Mes: "+today.getMonth()+", "+today.monthName());
		//System.out.println("¿Es el día correcto? "+today.isRightDay());
		System.out.println("¿Cuántos días tiene el mes? "+today.numDaysMonth());
		System.out.println("Estamos en la estación: "+today.monthSeason());
		System.out.println(today.toString());
		//System.out.println("asd: "+today.getNumGuess()+", ");
		System.out.println("Meses hasta final de año: "+today.numberMonthsUntilEndOfTheYear());
		//System.out.println("Meses hasta final de año: "+today.monthsUntilEndOfTheYear());
		System.out.println("Días hasta final de mes: "+today.daysUntilEndOfTheMonth());
		//System.out.println("Meses con los mismos días: "+today.monthsWithSameDays());
		System.out.println("El número de días que hay es: "+today.daysFromTheFirstOne());

	}













}
