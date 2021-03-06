package musteriSiparisSureci.validators;

import musteriSiparisSureci.KNA1;

public class Kna1Check extends SimpleValidator {

	private KNA1 kna1;
	
	// Constructor include coach class object parameter
	public Kna1Check(KNA1 kna1) {
		this.kna1 = kna1;
	}
	
	public void checkPSTLZ(int PSTLZ) throws InvalidException {
		if (PSTLZ < 1000) {
			throw new InvalidException("KUNNR ID:" + kna1.getKUNNR() + " postal code cannot be less than 1000");
		}
	}
	
	@Override
	public void checkAll(Object object) throws InvalidException {
		KNA1 kna1 = (KNA1) object;
		checkKUNNR(kna1.getKUNNR());
		checkPSTLZ(kna1.getPSTLZ());
	}
}
