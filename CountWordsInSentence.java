public class CountWordsInSentence {
    public static void main(String[] args) {
        String sentence = "Hello world this is Java";
        String []words=sentence.split(" ");
        System.out.println("Number of words in the sentence: " + words.length);
    }

}