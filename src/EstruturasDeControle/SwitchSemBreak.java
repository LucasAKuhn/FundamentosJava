package EstruturasDeControle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		
		String faixa = "PRETA";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai..");
		case "marron":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		default:
			System.out.println("Estou iniciando");
		}
	}
}
