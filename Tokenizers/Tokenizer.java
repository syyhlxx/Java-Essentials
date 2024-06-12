
import java.util.Arrays;
import java.util.StringTokenizer;

public class Tokenizer {

    public static void main(String[] args) {
        //Establish string for testing.
        String packagePath = "java.util.stream";

        //Choose a delimeter.
        String[] tokens = getTokens(packagePath, "\\.");

        //Print out result.
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter) {

        //Initialize and declare a new StringTokenizer
        StringTokenizer strTok = new StringTokenizer(query, delimiter);

        //Declare and initialze a string array the size of tokens
        //in the newly created tokenizer.
        String[] strArray = new String[strTok.countTokens()];

        //Iterate through the tokenizer and place each token
        //in the array. Return the array.
        int i = 0;
        while (strTok.hasMoreTokens()) {
            strArray[i] = strTok.nextToken();
            i++;
        }

        return strArray;
    }
}

