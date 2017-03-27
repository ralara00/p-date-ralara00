package es.unileon.prg.date;

public class MainDate{
	public static void main(String[] args){
		Date today, tomorrow;
		today=new Date (27,3,2017);
		tomorrow=new Date (28,3,2017);	
		System.out.println("Comp: "+today.isSame(tomorrow));
		System.out.println("Mes: "+today.getMonth());
		System.out.println("Día correcto?: "+today.rightDay());
		//System.out.println("asd: "+today.getNumGuess());
	
	}













}
