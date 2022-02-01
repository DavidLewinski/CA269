public class Word3
{
    public static boolean allDone(String word, String guesses)
    {
        int len = word.length();
        int count = 0;
        for (int i = 0; i < guesses.length(); i++){
            for (int j = 0; j < word.length(); j++){
                if (guesses.charAt(i) == word.charAt(j)){
                    count++;
                }
            }
        }
        if (count == len){
            return true;
        }
        else{
            return false;
        }
    }
}