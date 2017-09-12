package musteriSiparisSureci.validators;

import musteriSiparisSureci.VBAK;

public class VbakCheck extends SimpleValidator {

	private VBAK vbak;
	
	public VbakCheck(VBAK vbak) {
		this.vbak = vbak;
	}
	
	public void checkBSTNK(String BSTNK) throws InvalidException {
		// BSTNK check method
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
