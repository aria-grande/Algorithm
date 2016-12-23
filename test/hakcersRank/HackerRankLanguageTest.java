package hakcersRank;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import hackersRank.HackerRankLanguage;

import org.junit.Ignore;
import org.junit.Test;

public class HackerRankLanguageTest {

	HackerRankLanguage h = new HackerRankLanguage();

	@Test
	public void empty() {
		System.out.println(-23/10 + ", " + -23%10);
	}

	@Test
	@Ignore
	public void id_is_invalid_test() {
		assertFalse(HackerRankLanguage.isValidLanguage(10, "CPP"));
		assertFalse(HackerRankLanguage.isValidLanguage(10, "CPPX"));
		
	}

	@Test
	@Ignore
	public void lan_name_is_invalid_test() {
		assertFalse(HackerRankLanguage.isValidLanguage(10224, "CPXP"));
		assertFalse(HackerRankLanguage.isValidLanguage(10, "CPXP"));
	}

	@Test
	@Ignore
	public void lan_name_is_valid_test() {
		assertTrue(HackerRankLanguage.isValidLanguage(10224, "CPP"));
		assertTrue(HackerRankLanguage.isValidLanguage(10224, "C"));
	}

	@Test
	public void sample() {
		assertTrue(HackerRankLanguage.isValidLanguage_regex(10224, "CLISP"));
	}
	
	@Test
	@Ignore
	public void test_case_2() {
		String input = "38957 TTDDHKGFA,29839 DART,47865 PERL,82072 GO,65478 ROLALP,71689 IVQWSX,22575 JAVASCRIPT,52364 DSK,88742 SBCL,72362 ARWQWZOIG" +
				"14454 PYTHON,20195 PHP,45343 KQNGX,31897 OBJECTIVEC,53444 LVDUBOTRJ,86550 OCLCLEACIU,89248 K,19908 D,36504 PASCAL,92302 SCALA,50027 OCAML" +
				"87485 CLISP,48317 CPP,21590 HASKELL,50068 GROOVY,73758 ERLANG,76801 PYTHON,37430 WHYUYM,51187 OCAML,96748 CSHARP,35981 B,51236 GZDQZF" +
				"76695 JAVA,10426 O,46486 HAQEH,41057 FD,77274 ACZVXW,25254 T,88591 JAVA,76286 DART,13421 MV,37737 ERLANG,14367 TSCFYJZKW,16793 TC,40710 FOAKFDYO,69883 CLISP,18731 PHP,55495 AAWZ,12073 PYTHON,93068 CD,71277 ERLANG,31741 JAVA,36711 FWJL,31380 LN,45548 BRAINFUCK,40387 XRJS,93770 SBCL,89030 XXGUXDZDR";
		String[] inputs = input.split(",");
		int[] ids = new int[inputs.length];
		String[] lans = new String[inputs.length];
		for (int i = 0; i < inputs.length; ++i) {
			ids[i] = Integer.parseInt(inputs[i].split(" ")[0]);
			lans[i] = inputs[i].split(" ")[1];
		}
		
		String[] results = {"INVALID", "VALID",	"VALID", "VALID", "INVALID", "INVALID", "VALID", "INVALID", "VALID", "INVALID", "VALID", "VALID", "INVALID",
						"VALID", "INVALID", "INVALID", "INVALID", "VALID", "VALID", "VALID", "VALID", "VALID", "VALID", "VALID", "VALID", "VALID",
						"VALID", "INVALID", "VALID", "VALID", "INVALID", "INVALID", "VALID", "INVALID", "INVALID", "INVALID", "INVALID", "INVALID", "VALID", "VALID", "INVALID", "VALID",
						"INVALID", "INVALID", "INVALID", "VALID", "VALID", "INVALID", "VALID", "INVALID", "VALID", "VALID", "INVALID", "INVALID", "VALID", "INVALID", "VALID", "INVALID"};
		
		for (int j = 0; j < inputs.length; ++j) {
			boolean result = "VALID".equals(results[j]) ? true : false;
			boolean realR = HackerRankLanguage.isValidLanguage(ids[j], lans[j]);
			if (result != realR) {
				System.out.println(ids[j] + ", " + lans[j]);	
			}
			assertEquals(result, realR);
			
		}
	}
}
