
public class StringSearchRun {

	public static void main(String[] args) {
		System.out.println(StringSearch.countLetters("Computerscience" , "t"));
		System.out.println(StringSearch.countWords("Computerscience", "to" ));
		
		System.out.println(StringSearch.countLetters("onetwoonetwofun" , "n"));
		System.out.println(StringSearch.countWords("onefredonetwodog", "one" ));
		
		System.out.println(StringSearch.countLetters("odogdogdogdogo" , "o"));
		System.out.println(StringSearch.countWords("niininininininininini", "ni" ));
	}

}
