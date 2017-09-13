package musteriSiparisSureci;

import musteriSiparisSureci.validators.InvalidException;

public class Main {

	public static void main(String[] args) {
		
		// Tebrikler!
		// Yaptığın mimari teknik olarak doğru yani her şey istenilen doğrultuda çalışıyor.
		// Öğrendiklerini de doğru uygulamışsın burada da bir problem yok. 
		// Belirlediğin mimari doğrultusunda doğru ilerlemişsin yani.
		
		// Ancak diğer class lar üzerinde yaptığım yorumları dikkate al.
		// Sadece şu an süreci doğru anlayıp, tam ihtiyaca yönelik çözümler üreten bir mimari kurman lazım.
		// Aslında tam olarak danışmanlık ve iyi developer bu şekilde ayrılıyor. Bu da zamanla oturacaktır.
		// Şu an teknik konulara hakim olman için çalışıyoruz.
		// Paralelde uygulamaları yazarken süreçsel ihtiyaçları anlayıp onlara da uygun senaryoları düşünmeye çalış.
		// O zaman birisine ihtiyaç duymadan hataları ve gelebilecek talepleri önceden görmüş olursun. :)
		
		// Bu projedeki tek problem, projede gereksiz yük oluşturmuşsun kendine.
		// Sonuç odaklı olarak gidecek olursak proje tamamlanmış ve başarılı olmuştur.
		// Ancak proje verimini değerlendirecek olursak, kendine ekstra yük çıkartacak bir mimariye girdiğin için
		// bu noktayı geliştirmemiz lazım.
		
		SalesOrder salesOrder = new SalesOrder("VBELNTEST1");
		
		try {
			salesOrder.getKna1().add(new KNA1("TESTCUST1", "Test company name1", "Nidakule Ataşehir Kuzey", 34000, "02163333333"));
			salesOrder.getKna1().add(new KNA1("TESTCUST2", "Test company name2", "Nidakule Ataşehir Kuzey", -1, "02163333334"));
			
		} catch (InvalidException e) {
			e.printStackTrace();
		}
		
	}

}
