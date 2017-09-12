package musteriSiparisSureci;


public class VBAK extends VBase {
	private String BSTNK; // Customer purchase order number (20)
	private String ERDAT; // Date on Which Record Was Created (8)
	private String ERZET; // Entry time (6)
	private String ERNAM; // Name of Person who Created the Object (12)
	
	public VBAK(String VBELN, String KUNNR, String BSTNK, String ERDAT, String ERZET, String ERNAM) {
		this.setVBELN(VBELN);
		this.setKUNNR(KUNNR);
		this.setBSTNK(BSTNK);
		this.setERDAT(ERDAT);
		this.setERZET(ERZET);
		this.setERNAM(ERNAM);
	}
	
	public String getBSTNK() {
		return BSTNK;
	}
	public void setBSTNK(String bSTNK) {
		BSTNK = bSTNK;
	}
	public String getERDAT() {
		return ERDAT;
	}
	public void setERDAT(String eRDAT) {
		ERDAT = eRDAT;
	}
	public String getERZET() {
		return ERZET;
	}
	public void setERZET(String eRZET) {
		ERZET = eRZET;
	}
	public String getERNAM() {
		return ERNAM;
	}
	public void setERNAM(String eRNAM) {
		ERNAM = eRNAM;
	}
	
	
}
