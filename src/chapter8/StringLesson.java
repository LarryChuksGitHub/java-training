package chapter8;

public class StringLesson {
    // Intilize the known
    static String text = "You are just good to the world ";
    public static void main(String args []){

        // count the number of words
         countNumberOfWords(text);

        //print words backwards
        printBackwards();

        addSpace("YouAreGreat");

    }

    /**
     *
     * @param text
     */
    public static void countNumberOfWords(String text){

        var words = text.split("");
        int numberOfWords = words.length;
        System.out.println("The text contain: " + numberOfWords + " words ");
        //String message = String.format("Thses are the %d, words:", words);
        System.out.println(" The words are: ");
        for (int i = 0; i < numberOfWords; i++){
            System.out.print(words[i] );

        }

    }

    public static void printBackwards(){
        String textCamel = "camel";
        System.out.println("The Reverse text is: ");
        for (int i = textCamel.length()-1; i >= 0; i--){
            System.out.print(textCamel.charAt(i));
        }
    }

    /**
     * Add Space to a text without Space that have capital letter in them
     * @param text the text to add space to
     */
    public static void addSpace(String text){
        var modifiedText = new StringBuilder(text);
        for (int i = 0; i < modifiedText.length(); i++){
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))){
                modifiedText.insert(i," ");
                i++;


            }

        }
        System.out.println(modifiedText);
    }
}
