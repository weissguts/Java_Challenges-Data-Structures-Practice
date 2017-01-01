/**
 * Created by Daniel Hernandez on 12/29/2016.
 * -Recreation of school project at Regis University.
 * 1st Version- Array
 *
 */

import java.io.*;
import java.util.StringTokenizer;


public class CharityRecreate {

    //constant to hold filename.
    final static String INPUT_FILENAME = "input/charity1input.txt";

    public static void main(String[] args) throws FileNotFoundException {

        //Test donor object WITH parameters.
        Donor donorTest = new Donor(2,"John","Smith","303-333-3333",
                "jsmith@gmail.com" );


        BufferedReader f = new BufferedReader(new FileReader(INPUT_FILENAME));
        System.out.println("Running Test 1a: ");
        System.out.println(donorTest.toString());

    }
}
