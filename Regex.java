import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex{

	public static final String FRASE_TEST = 
			"O aluno jaum esta matriculado em C005, C125 e C103";
	
	public static final String FRASE_TEST2 = 
			"O   aluno jaum     esta    matriculado    em C005,  C125 e   C103";
	
	
	public static void main(String[] args) {
		
		Pattern pattern = Pattern.compile("[A-Z][0-9]{3}"); 
		
		Matcher matcher = pattern.matcher(FRASE_TEST);
		
		List<String> listas = new ArrayList<String>();
		
		while (matcher.find()) {
			listas.add(FRASE_TEST.subSequence
					(matcher.start(), matcher.end()).toString());
		}
		for (String disciplina : listas) {
			System.out.println(disciplina);
		}
		
		String[] palavras = FRASE_TEST2.split("\\s+");
		for (String palavra : palavras) {
			System.out.println(palavra);
		}
		
		String novaPalavra = FRASE_TEST2.replaceAll("\\s+", " ");
		System.out.println(FRASE_TEST2);
		System.out.println(novaPalavra);
	}
}