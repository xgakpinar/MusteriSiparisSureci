package musteriSiparisSureci;

import musteriSiparisSureci.validators.InvalidException;
import musteriSiparisSureci.validators.Kna1Check;

public class KNA1 extends VBase {

	private String NAME1; // Name 1 (35)
	private String ADRNR; // Address (10)
	private int PSTLZ; // Postal Code (10)
	private String TELF1; // First telephone number (16)
	
	// Get instance from coach check
	private Kna1Check kna1check = new Kna1Check(this);

	public KNA1() {

	}
	
	// Constructor method
	public KNA1(String KUNNR, String NAME1, String ADRNR, int PSTLZ, String TELF1) throws InvalidException {
		this.setKUNNR(KUNNR);
		this.setNAME1(NAME1);
		this.setADRNR(ADRNR);
		this.setPSTLZ(PSTLZ);
		this.setTELF1(TELF1);
		
		kna1check.checkAll(this);
	}
	
	// Setter getter methods
	public String getNAME1() {
		return NAME1;
	}
	public void setNAME1(String nAME1) {
		NAME1 = nAME1;
	}
	public String getADRNR() {
		return ADRNR;
	}
	public void setADRNR(String aDRNR) {
		ADRNR = aDRNR;
	}
	public int getPSTLZ() {
		return PSTLZ;
	}
	public void setPSTLZ(int pSTLZ) {
		PSTLZ = pSTLZ;
	}
	public String getTELF1() {
		return TELF1;
	}
	public void setTELF1(String tELF1) {
		TELF1 = tELF1;
	}

}
