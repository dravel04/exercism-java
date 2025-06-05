import java.util.HashMap;

class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder newString = new StringBuilder();
        boolean startWord = false;
        HashMap<Character,Character> replacements = new HashMap<>(){{
            put('4','a');
            put('3','e');
            put('0','o');
            put('1','l');
            put('7','t');
        }};

        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isWhitespace(c)) {
                newString.append('_');
                
            } else if (c == '-') {
                newString.append("");
                startWord = true;
                
            } else if (c == '4' || c == '3' || c == '0' || c == '1' || c == '7') {
                newString.append(replacements.get(c));
                
            } else if(!Character.isLetter(c)) { 
                newString.append("");
           
            } else {
                if (startWord) {
                    newString.append(Character.toUpperCase(c));
                    startWord = false;
                } else {
                    newString.append(c);
                }
            }
        }

        return newString.toString();
    }
    
    // public static void main(String[] args) {
    //     String output1 = SqueakyClean.clean("my   Id");
    //     System.out.println(output1);
    //     String output2 = SqueakyClean.clean("a-bc");
    //     System.out.println(output2);
    //     String output3 = SqueakyClean.clean("H3ll0 W0rld");
    //     System.out.println(output3);
    //     String output4 = SqueakyClean.clean("4 73s7");
    //     System.out.println(output4);
    //     String output5 = SqueakyClean.clean("a$#.b");
    //     System.out.println(output5);
    // }
}
