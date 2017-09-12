package musteriSiparisSureci.validators;

import musteriSiparisSureci.VBase;

public class SimpleValidator {

	public void checkVBELN(String VBELN) throws InvalidException {
		// VBELN check method
		if (VBELN == null) {
			// If name equal null
			// Invalid Exception execute and message print
			throw new InvalidException("VBELN cannot be initial");
		}
	}
	
	public void checkKUNNR(String KUNNR) throws InvalidException {
		// KUNNR check method
		if (KUNNR == null) {
			// If name equal null
			// Invalid Exception execute and message print
			throw new InvalidException("KUNNR cannot be initial");
		}
	}
	
	public void checkAll(Object object) throws InvalidException {
		// All check methods called in checkAll method
		VBase vbase = (VBase) object;
		checkVBELN(vbase.getVBELN());
		checkKUNNR(vbase.getKUNNR());
	}
}
