package hackersRank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HackerRankLanguage {
	
	final static String languages = "C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA:ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART:GROOVY:OBJECTIVEC";
    
	static Set<String> lan_set;
    
	public HackerRankLanguage() {
          
        lan_set = new HashSet<>(Arrays.asList(languages.split(":")));
    
    }
                               
    public static boolean isValidLanguage (int id, String name) {
        
        return (Math.pow(10, 4) <= id && id < Math.pow(10, 5)) && lan_set.contains(name);
    }
    
    public static boolean isValidLanguage_regex (int id, String name) {
    	
    	return (Math.pow(10, 4) <= id && id < Math.pow(10, 5)) && languages.matches("(^.+:| ^)" + name + "(:.+$|$)"); 
    }
}
