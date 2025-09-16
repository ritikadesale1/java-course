public class word_count {
    public static void main(String[] args) {
        String text = "Hello Krishna ! This world is Cruel";
        String[] words = text.split("\\s");
        int wordCount = words.length;
        String[] sentences = text.split("[.!?]");
        int sentenceCount = sentences.length;
        String[] phrase = text.split("[,.;:!?]");
        int phraseCount = phrase.length;
        System.out.println("Word count: " + wordCount);
        System.out.println("Sentence count: " + sentenceCount);
        System.out.println("Phrase count: " + phraseCount);

    }
}
