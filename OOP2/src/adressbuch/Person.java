package adressbuch;

import java.util.Scanner;

public class Person {
	private String name, vorname;
	private String str,ort;
	private int hausnr, plz;
	private Scanner scanner = new Scanner(System.in);

	
	public Person() {
		
	}
	
	public Person(String name, String vorname, String str, int hausnr, String ort, int plz) {
		this.name=name;
		this.vorname=vorname;
		this.str=str;
		this.hausnr=hausnr;
		this.plz = plz;
		this.ort=ort;
	}
	
	
	private void print() {
		System.out.println(this);
	}
	
	public String toString() {
		return ""	+vorname+" "+name+"\n"
					+str+" "+hausnr+"\n"
					+plz+" "+ort;
	}
	
	private String eingabeStr() {
		String retVal="";
		retVal = scanner.nextLine();
		return retVal;
	}
	
	private int eingabeInt() {
		int retVal=0;
		try {
			retVal = Integer.parseInt(scanner.nextLine());
		}
		catch (NumberFormatException e) {
			System.out.println("Kein numerischer Wert!");
			System.out.println("0 wird gesetzt");
		}
		return retVal;
	}
	
	public void eingabeVorname() {
		System.out.println("Vorname: ");
		this.vorname = eingabeStr();
	}
	public void eingabeNachname() {
		System.out.println("Nachname: ");
		this.name = eingabeStr();
	}
	public void eingabeStraße() {
		System.out.println("Straße: ");
		this.str = eingabeStr();
	}
	public void eingabeHausNr() {
		System.out.println("Haus-Nr: ");
		this.hausnr = eingabeInt();
	}
	public void eingabePLZ() {
		System.out.println("Postleitzahl: ");
		this.plz = eingabeInt();
	}
	public void eingabeOrt() {
		System.out.println("Ort: ");
		this.ort = eingabeStr();
	}
	
	
}
