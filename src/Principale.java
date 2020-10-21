import java.time.LocalDate;

public class Principale {

	public static void main(String[] args) {
		
		MyDate md = new MyDate();
		MyDate md2= new MyDate();
		md.setMese(12);
	    md.setGiorno(13);
	    md.setAnno(2020);
	    
	    
	    
	 
	    
	    
	    
	    md2.setGiorno(22);
	    
//	    System.out.println("Il giorno è "+md.getGiorno());
//	    System.out.println("Il secondo giorno è "+md2.getGiorno());
	
	  //  md.setFormato("en");
	    System.out.println(md);
	
	}

}
