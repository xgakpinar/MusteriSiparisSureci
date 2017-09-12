package musteriSiparisSureci;

public class VBase {
	private String VBELN; // Sales Document (10)
	private String KUNNR; // Customer number (10)
	
	// Setter Getter methods
	public String getVBELN() {
		return VBELN;
	}

	public void setVBELN(String vBELN) {
		VBELN = controlVBELN(vBELN);
	}

	public String getKUNNR() {
		return KUNNR;
	}

	public void setKUNNR(String kUNNR) {
		KUNNR = controlKUNNR(kUNNR);
	}

	// Controller methods
	private String controlVBELN(String VBELN) {
		if (VBELN.length() == 0) {
			String newName = "undefined";
			return newName;
		} else {
			return VBELN;
		}
	}
	
	private String controlKUNNR(String KUNNR) {
		if (KUNNR.length() == 0) {
			String newName = "undefined";
			return newName;
		} else {
			return KUNNR;
		}
	}
}
