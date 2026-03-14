import java.util.HashMap;
import java.util.Map;

class BannerCharacterArray {

    private char character;
    private String[] pattern;

    public BannerCharacterArray(char character, String[] pattern) {
        this.character = character;
        this.pattern = pattern;
    }

    public char getCharacter() {
        return character;
    }

    public String[] getPattern() {
        return pattern;
    }
}

class BannerUtility {

    public static Map<Character, BannerCharacterArray> buildCharacterPatternMap() {

        Map<Character, BannerCharacterArray> map = new HashMap<>();

        String[] O = {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };

        String[] P = {
            "**** ",
            "*   *",
            "**** ",
            "*    ",
            "*    "
        };

        String[] S = {
            " ****",
            "*    ",
            " *** ",
            "    *",
            "**** "
        };

        map.put('O', new BannerCharacterArray('O', O));
        map.put('P', new BannerCharacterArray('P', P));
        map.put('S', new BannerCharacterArray('S', S));

        return map;
    }

    public static void renderBanner(String word, Map<Character, BannerCharacterArray> map) {

        int rows = 5;

        for (int i = 0; i < rows; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                BannerCharacterArray bannerChar = map.get(c);
                line.append(bannerChar.getPattern()[i]).append("  ");
            }

            System.out.println(line.toString());
        }
    }
}

public class BannerUC8 {

    public static void main(String[] args) {

        Map<Character, BannerCharacterArray> patternMap =
                BannerUtility.buildCharacterPatternMap();

        String word = "OOPS";

        BannerUtility.renderBanner(word, patternMap);
    }
}