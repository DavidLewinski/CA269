public class Word4
{
    public static String showLetter(String word, char guess)
    {
        String string = "";
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == guess){
                string += word.charAt(i);
            }
            else{
                string += "_";
            }
        }
        return string;
    }
}
