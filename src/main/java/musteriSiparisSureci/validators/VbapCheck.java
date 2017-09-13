package musteriSiparisSureci.validators;

import musteriSiparisSureci.VBAP;

public class VbapCheck extends SimpleValidator {

	private VBAP vbap;
	
	public VbapCheck(VBAP vbap) {
		this.vbap = vbap;
	}
	
	public void checkNETPR(Double NETPR) throws InvalidException {
		if (NETPR <= 0.0) {
			// Invalid Exception execute and message print
			throw new InvalidException("VBELN ID:" + vbap.getNETPR() + " NETPR cannot be less than 0.0");
		}
	}
	
	public void checkKPEIN(String KPEIN) throws InvalidException {
		if (KPEIN != "TRY") {
			// If name equal null
			// Invalid Exception execute and message print
			throw new InvalidException("VBELN ID:" + vbap.getKPEIN() + " KPEIN should be TRY");
		}
	}
	
	@Override
	public void checkAll(Object object) throws InvalidException {
		// Burada önce super.checkAll() çağırılmalı
		// Çünkü öncelikle root objedeki kontroller yapılmalı
		// O kontrollerden geçerse bu class'a ait kontrollere girmeli
		
		VBAP vbap = (VBAP) object;
		checkVBELN(vbap.getVBELN());
		checkNETPR(vbap.getNETPR());
		checkKPEIN(vbap.getKPEIN());
		super.checkAll(object);
	}
}
