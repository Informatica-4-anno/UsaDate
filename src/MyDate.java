
public class MyDate {
	// Attributi - Proprietà - Variabili di istanza
	private int giorno=0;
	private int mese=0;
	private int anno=0;
	private String formato="it";
	
	/**
	 * @return the formato
	 */
	
	/**
	 * @param formato the formato to set
	 */
	public void setFormato(String formato) {
		this.formato = formato;
	}
	/**
	 * @return the giorno
	 */
	public int getGiorno() {
		return giorno;
	}
	/**
	 * @param giorno the giorno to set
	 */
	public void setGiorno(int giorno) {
		if ( giorno <1) {
			System.out.println("Il giorno deve essere >1");
			return;
		}
		if (mese==0) {
			System.out.println("Devi prima settare il mese");
			return;
		}
		switch (mese) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: 
				if ( giorno >31 ) {
					System.out.println("il giorno deve essere <=31");
					return;
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if ( giorno >30 ) {
					System.out.println("il giorno deve essere <=30");
					return;
				}
				break;
			case 2:
				if ( giorno >28 ) {
					System.out.println("il giorno deve essere <=28");
					return;
				}
				break;
 		}
		
		this.giorno = giorno;
	}
	
	/**
	 * @return the mese
	 */
	public int getMese() {
		return mese;
	}
	/**
	 * @param mese the mese to set
	 */
	public void setMese(int mese) {
		this.mese = mese;
	}
	/**
	 * @return the anno
	 */
	public int getAnno() {
		return anno;
	}
	/**
	 * @param anno the anno to set
	 */
	public void setAnno(int anno) {
		this.anno = anno;
	}
	@Override
	public String toString() {
		if (formato.equalsIgnoreCase("it")) {
		return this.giorno+"/"+this.mese+"/"+this.anno;
		} else {
			return this.mese+"-"+this.giorno+"-"+this.anno;
		}
	}
	
	
	
    
}
