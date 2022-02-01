public class Word5
{
    public static String showLetters(String word, String letter)
    {
        String string = "";
        for (int i = 0; i < word.length(); i++){
            if((letter + "").contains((word.charAt(i) + "")) == true){
                string += word.charAt(i);
            }
            else{
                string += "_";
            }
        }
        return string;
    }
}
