package Bolum_9_Soru_2;

public class Stok {

	private String symbol;
	private String name;
	
	private double oncekiGunStokFiyat;
	private double guncelStokFiyat;
	
	public Stok(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}
	
	public void setOncekiGunStokFiyat(double oncekiGunStokFiyat) {
		this.oncekiGunStokFiyat = oncekiGunStokFiyat;
	}
	
	public void setGuncelStokFiyat(double guncelStokFiyat) {
		this.guncelStokFiyat = guncelStokFiyat;
	}
	
	public double getDegisimYuzdesi() {
		return ((guncelStokFiyat - oncekiGunStokFiyat) / oncekiGunStokFiyat) * 100;
	}
	
	public String getSymbol() {
		return symbol;
	}
	
	public String getName() {
		return name;
	}
}
