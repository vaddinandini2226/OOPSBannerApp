package oops;


public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
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

    public static CharacterPatternMap[] createCharacterPatterns() {

        CharacterPatternMap[] charMaps = new CharacterPatternMap[4];

        // O Pattern
        charMaps[0] = new CharacterPatternMap('O', new String[]{
                "  ***  ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                "  ***  "
        });

        // P Pattern
        charMaps[1] = new CharacterPatternMap('P', new String[]{
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        });

        // S Pattern
        charMaps[2] = new CharacterPatternMap('S', new String[]{
                " ******",
                "**     ",
                "**     ",
                " ***** ",
                "     **",
                "     **",
                "****** "
        });



        return charMaps;
    }

    public static String[] getCharacterPattern(char ch,
        CharacterPatternMap[] charMaps) {

        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return null;
    }

    public static void printMessage(String message,
        CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                String[] pattern =
                        getCharacterPattern(ch, charMaps);

                if (pattern != null) {
                    System.out.print(pattern[row] + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps =
                createCharacterPatterns();

        printMessage("OOPS", charMaps);
    }
}