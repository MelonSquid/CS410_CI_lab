import java.util.Scanner;

public class CILab implements CILabInterface {
    private String myString;

    @Override
    public String getString() {
        return myString;
    }

    @Override
    public void setString(String string) {
        myString = string;
    }

    @Override
    public boolean detectCapitalUse() {
        //pass string into scanner object.
        //the scanner object has easy to use functionality
        //that enables easy parsing of myString to single words
        Scanner scan = new Scanner(myString);


        //while loop to check the whole string
        while (scan.hasNext()) {
            String currentWord = scan.next(); //grab next word

            //Conditions -- if all of these conditions are ever false
            //for any of the words in the string, then return false immediately

            //Conditions to look for:
            //      -String is all capital letters
            //      -String is all lowercase letters
            //      -Only the first char is capitalized

            if(currentWord.equals(currentWord.toUpperCase())) { //word is all caps
                continue;
            }else if (currentWord.equals(currentWord.toLowerCase())) { //word has no caps
                continue;
            }else if (currentWord.charAt(0) == Character.toUpperCase(currentWord.charAt(0))) {//word starts with a capital
                for(int i = 1; i < currentWord.length(); i++) {
                    char currentChar = currentWord.charAt(i);
                    char currentCharLowerCase = Character.toLowerCase(currentWord.charAt(i));

                    //check to see if the condition was violated
                    if (currentChar != currentCharLowerCase) {
                        //If current character is not lowercase, then this condition is false.
                        //Since this is the last statement in the if-elseif, if this condition is reached,
                        //the other cases are already false. Therefore, all cases are false, and this word
                        //violates the conditions. Return false immediately.
                        return false;
                    }
                }
            }else { //if all three conditions are false
                return false;
            }

        } //END WHILE LOOP

        //If this statement is reached, it means every word in the string keeps the conditions.
        //Therefore, return true.
        return true;
    }

}

