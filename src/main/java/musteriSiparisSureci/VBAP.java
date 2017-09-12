package musteriSiparisSureci;

public class VBAP extends VBase {

	private String POSNR; // Sales Document Item (6)
	private String MEINS; // Base Unit of Measure (3)
	private String MATNR; // Material Number (18)
	private Double NETPR; // Net price (11(2))
	private String KPEIN; // Condition pricing unit (5)
	private String PSTYV; // Sales document item category (4)
	
	public VBAP(String VBELN, String POSNR, String MEINS, String MATNR, Double NETPR, String KPEIN, String PSTYV) {
		this.setVBELN(VBELN);
		this.setPOSNR(POSNR);
		this.setMEINS(MEINS);
		this.setMATNR(MATNR);
		this.setNETPR(NETPR);
		this.setKPEIN(KPEIN);
		this.setPSTYV(PSTYV);
	}

	public String getPOSNR() {
		return POSNR;
	}
	public void setPOSNR(String pOSNR) {
		POSNR = pOSNR;
	}
	public String getMEINS() {
		return MEINS;
	}
	public void setMEINS(String mEINS) {
		MEINS = mEINS;
	}
	public String getMATNR() {
		return MATNR;
	}
	public void setMATNR(String mATNR) {
		MATNR = mATNR;
	}
	public Double getNETPR() {
		return NETPR;
	}
	public void setNETPR(Double nETPR) {
		NETPR = nETPR;
	}
	public String getKPEIN() {
		return KPEIN;
	}
	public void setKPEIN(String kPEIN) {
		KPEIN = kPEIN;
	}
	public String getPSTYV() {
		return PSTYV;
	}
	public void setPSTYV(String pSTYV) {
		PSTYV = pSTYV;
	}
	
	
}
