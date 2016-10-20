package adressbuch_korrekt;

public class Adressbuch {

	public static void main(String[] args) {
		Person p = new Person();
		p.eingabeVorname();
		p.eingabeNachname();
		p.eingabeStraße();
		p.eingabeHausNr();
		p.eingabePLZ();
		p.eingabeOrt();
		p.print();

	}

}
