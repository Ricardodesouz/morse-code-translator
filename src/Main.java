import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Map<String, String> morseCodeMap = new LinkedHashMap<>();
            Scanner sc = new Scanner(System.in);

            morseCodeMap.put("w", ".--");
            morseCodeMap.put("b", "-...");
            morseCodeMap.put("c", "-.-.");
            morseCodeMap.put("j", ".---");
            morseCodeMap.put("q", "--.-");
            morseCodeMap.put("z", "--..");
            morseCodeMap.put("x", "-..-");
            morseCodeMap.put("p", ".--.");
            morseCodeMap.put("k", "-.-");
            morseCodeMap.put("d", "-..");
            morseCodeMap.put("g", "--.");
            morseCodeMap.put("o", "---");
            morseCodeMap.put("y", "-.--");
            morseCodeMap.put("r", ".-.");
            morseCodeMap.put("a", ".-");
            morseCodeMap.put("i", "..");
            morseCodeMap.put("l", ".-..");
            morseCodeMap.put("u", "..-");
            morseCodeMap.put("n", "-.");
            morseCodeMap.put("m", "--");
            morseCodeMap.put("s", "...");
            morseCodeMap.put("v", "...-");
            morseCodeMap.put("h", "....");
            morseCodeMap.put("f", "..-.");
            morseCodeMap.put("e", ".");
            morseCodeMap.put("t", "-");
            morseCodeMap.put(" ", "/");

            System.out.print("digite a frase ou palavra ");
            String word = sc.nextLine();
            String morseWord = "";
            for (String morse : morseCodeMap.keySet()) {
                if (word.indexOf(morse) != -1) {
                    word = word.replace(morse, morseCodeMap.get(morse));

                }
            }
            System.out.print(word);
        }
    }
