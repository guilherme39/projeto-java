package smart_tv;

public class usuario_tv {
		
	public static void main(String[] args) throws Exception {

	SmartTv smartTv = new SmartTv();
	
	smartTv.diminuirVolume();
	smartTv.diminuirVolume();
	smartTv.diminuirVolume();
	smartTv.aumentarVolume();
	smartTv.aumentarCanal();
	smartTv.diminuirCanal();
	
	System.out.println("canal antes " + smartTv.canal);
	
	smartTv.mudarCanal(13);;
	
	System.out.println("canal atual " + smartTv.canal);
	System.out.println(" volume atual " + smartTv.volume);
	System.out.println("TV ligada ?" + smartTv.ligada);
	System.out.println("canal atual " + smartTv.canal);
	System.out.println("volume atual " + smartTv.volume);
	
	smartTv.ligar();
	System.out.println(" novo Status TV ligada ?" + smartTv.ligada);
	
	smartTv.desligar();
	System.out.println(" novo Status TV desligada " + smartTv.ligada);
	
		
		}	
}
