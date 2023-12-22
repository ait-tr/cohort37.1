public class StarChecker implements WordsChecker{
    @Override
    public boolean checkWord(String word) {
        return word.length() == 5;
    }

    @Override
    public String transformWord(String word) {
        return "*****";
    }
}
