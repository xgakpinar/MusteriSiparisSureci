package musteriSiparisSureci;

import java.util.ArrayList;
import java.util.List;

public class SalesOrder extends VBase{
	private List<KNA1> kna1;
	private List<VBAK> vbak;
	private List<VBAP> vbap;
	
	public SalesOrder(String VBELN) {
		this.setVBELN(VBELN);
		this.kna1 = new ArrayList<KNA1>();
		this.vbak = new ArrayList<VBAK>();
		this.vbap = new ArrayList<VBAP>();
	}
	
	
	public List<KNA1> getKna1() {
		return kna1;
	}
	public void setKna1(List<KNA1> kna1) {
		this.kna1 = kna1;
	}
	public List<VBAK> getVbak() {
		return vbak;
	}
	public void setVbak(List<VBAK> vbak) {
		this.vbak = vbak;
	}
	public List<VBAP> getVbap() {
		return vbap;
	}
	public void setVbap(List<VBAP> vbap) {
		this.vbap = vbap;
	}
	
	
}
