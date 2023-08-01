package main;

public class Printing implements Print {

	@Override
	public String print1(String a) {
		return a;
	}

	@Override
	public String print1(String a, int b) {
		return "Invalid "+a;
	}
	
}
