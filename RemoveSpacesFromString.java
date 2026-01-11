public class RemoveSpacesFromString {
    public static void main(String[] args) {
        String str = "This is a sample string with spaces.";
        String result="";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar != ' ') {
                result += currentChar;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("String without spaces: " + result);
    }
}
