package adressbuch;

public class Adressbuch {

	Person p;

	public static void main(String[] args) {
		p = new Person();
		p.eingabeVorname();
		p.eingabeNachname();
		p.eingabeStraße();
		p.eingabeHausNr();
		p.eingabePLZ();
		p.eingabeOrt();
		p.print();

	}

}
