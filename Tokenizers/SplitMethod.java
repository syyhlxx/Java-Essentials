/*
split() method

The first way to split a string into
multiple parts is to use the split()method.
A regular expression that defines a special delimiting
string must be passed as a parameter.

String str = "Good news everyone!";
The result will be an array of three strings:
String[] strings = str.split("ne");
["Good ", "ws everyo", "!"]

System.out.println(Arrays.toString(strings));

StringTokenizer class

String nextToken()                                  Returns the next substring

boolean hasMoreTokens()                             Checks whether there are more substrings.

StringTokenizer name = new StringTokenizer(string, delimiters);

String str = "Good news everyone!";
*/

import java.util.Arrays;
import java.util.StringTokenizer;

public class SplitMethod {

    public static void main(String[] args) {
        //Establish string for testing.
        String str = "Veisa phralae 'Hello World!' hrrau Rihannsu?";
        String[] fragments = str.split(" ");

        //Print out result.
        System.out.println(Arrays.toString(fragments));
    }

}
