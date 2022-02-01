public class Word2
{
    public static boolean containsLetter(String word, char letters)
    {
        for (int i = 0; i < word.length(); i++){
            if (letters == word.charAt(i)){
                return true;
            }
        }
        return false;
    }
}