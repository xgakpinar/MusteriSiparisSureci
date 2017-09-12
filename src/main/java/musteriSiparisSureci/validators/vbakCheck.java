package musteriSiparisSureci.validators;

import musteriSiparisSureci.VBAK;

public class vbakCheck extends SimpleValidator {

	private VBAK vbak;
	
	public vbakCheck(VBAK vbak) {
		this.vbak = vbak;
	}
	
	public void checkBSTNK(String BSTNK) throws InvalidException {
		// KUNNR check method
		if (BSTNK == null) {
			// If name equal null
			// Invalid Exception execute and message print
			throw new InvalidException("VBELN ID:" + vbak.getVBELN() + " BSTNK cannot be initial");
		}
	}

	@Override
	public void checkAll(Object object) throws InvalidException {
		VBAK vbak = (VBAK) object;
		checkVBELN(vbak.getVBELN());
		checkBSTNK(vbak.getBSTNK());
		super.checkAll(object);
	}
}
