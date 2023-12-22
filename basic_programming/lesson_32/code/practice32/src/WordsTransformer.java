public class WordsTransformer {

    public String transform( String sentence, WordsChecker wordsChecker){

        String[] words = sentence.split(" ");

        for( int i = 0; i < words.length; i++){
            if( wordsChecker.checkWord(words[i])){
                words[i] = wordsChecker.transformWord(words[i]);
            }
        }
        return String.join(" ",words);
    }
}
