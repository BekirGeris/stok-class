package Bolum_9_Soru_2;

public class StokTest {
	public static void main(String[] args) {
		
		Stok stok = new Stok("ORCI", "Oracle Corporation");
		
		stok.setOncekiGunStokFiyat(34.5);
		stok.setGuncelStokFiyat(34.35);
		
		System.out.printf("Stok sembolu = %s Stok Adi = %s Yuzdelik Degisim= %4.5f", stok.getSymbol(), stok.getName(), stok.getDegisimYuzdesi());
	}

}
