package musteriSiparisSureci;

import musteriSiparisSureci.validators.InvalidException;

public class Main {

	public static void main(String[] args) {
		
		SalesOrder salesOrder = new SalesOrder("VBELNTEST1");
		
		try {
			salesOrder.getKna1().add(new KNA1("TESTCUST1", "Test company name1", "Nidakule Ataşehir Kuzey", 34000, "02163333333"));
			salesOrder.getKna1().add(new KNA1("TESTCUST2", "Test company name2", "Nidakule Ataşehir Kuzey", -1, "02163333334"));
			
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		
	}

}
