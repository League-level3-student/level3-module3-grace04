package _00_Text_Funkifier;

public class NoEndsString extends SpecialString{

	public NoEndsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String str = s.substring(1, s.length()-1);
		return str;
	}
}
