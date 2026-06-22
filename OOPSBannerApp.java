package oops;


import java.util.HashMap;


public class OOPSBannerApp {


    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]{
                "  ***  ",
                " ** ** ",
                "**   **",
                "**   **",
                "**   **",
                " ** ** ",
                "  ***  "
        });

        charMap.put('P', new String[]{
                "****** ",
                "**   **",
                "**   **",
                "****** ",
                "**     ",
                "**     ",
                "**     "
        });

        charMap.put('S', new String[]{
                " ******",
                "**     ",
                "**     ",
                " ***** ",
                "     **",
                "     **",
                "****** "
        });


        return charMap;
    }


    public static void displayBanner(String message,
        HashMap<Character, String[]> charMap) {

        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + " ");
                }
            }

            System.out.println();
        }
    }


    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        String message = "OOPS";

        displayBanner(message, charMap);
    }
}     