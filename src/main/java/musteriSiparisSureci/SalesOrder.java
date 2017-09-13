package musteriSiparisSureci;

import java.util.ArrayList;
import java.util.List;

public class SalesOrder extends VBase{
	
	// Sipariş - müşteri ilişkisi DB tablolarında böyle tutuluyor 
	// Ancak bir nesne üzerinde çalışırken, sipariş nesnesi müşteri nesnesini içermeli
	// Yani kna1 class ı VBAK class ı içersinde tanımlanmalı.
	
	// Ayrıca VBAK demek zaten SalesOrder demek
	// Hem VBAK hem SalesOrder diye iki farklı class'ın olması süreçsel bir yanlış olur
	
	// Ya sadece VBAK olmalı ya da sadece SalesOrder olmalı sana almanca tablo kısaltmalarını kullanma demiştim :))
	// İsimler kafanı karıştırmış normal olarak. Unutma "Keep It Simple Stupid" (KISS) :)

	
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
