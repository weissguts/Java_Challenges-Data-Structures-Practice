/**
 * Created by Daniel Hernandez on 12/29/2016.
 * -Recreation of school project at Regis University.
 * -1st Version- Normal object comparison.
 * -Good practice of reading a CSV file into a string array, and then grabbing the data based on the first value of
 * the first line in the String array. In this case it's either "DONOR, or DONATION". Will run 3 tests to test
 * constructor of donor/donation objects with and without parameters.
 *
 */

import java.io.*;


public class CharityRecreate {

    //constant to hold filename.
    final static String INPUT_FILENAME = "input/charity1input.txt";


    //**********************MAIN BEGIN*********************************************************************************

    public static void main(String[] args) throws IOException {

        //Test donor object WITH parameters.
        Donor donorTest = new Donor(2,"John","Smith","303-333-3333",
                "jsmith@gmail.com" );
        //Test donation object WITH parameters.
        Donation donationTest = new Donation(202,2,"Payroll deduction",
                22.22,"03/01/2016",true,2222);


        //Test empty donor object.
        Donor donorTestTwo = new Donor();
        //Test empty donation object.
        Donation donationTestTwo = new Donation();

        //Opens CSV File.
        BufferedReader f = new BufferedReader(new FileReader(INPUT_FILENAME));
        String line = "";

        /**
         * While loop to iterate through CSV file. Will determine whether to add to Donor or Donation object by
         * first line which should equal "DONOR" or "DONATION". p.s. - THANK YOU DEBUGGER. Used debugger to show that
         * when I had line of String lineSplit[] = line.split(","); before my loop, the first iteration of my
         * String array was blank " ". Adding lineSplit after loop initiated my first actual line into String Array.
         */
        while ((line = f.readLine()) != null) {
            String lineSplit[] = line.split(",");
            if (lineSplit[0].equalsIgnoreCase("DONOR")) {
                donorTestTwo = setDonorAttributes(lineSplit);
            } while ((line = f.readLine()) !=null) {
                lineSplit = line.split(",");
                if (lineSplit[0].equals("DONATION")) {
                    donationTestTwo = setDonationAttributes(lineSplit);
                }
            } line = f.readLine();
        } f.close();


        System.out.println("Running Test 1a: ");
        System.out.println(donorTest.toString());

        System.out.println("\nRunning Test 1b: ");
        System.out.println(donationTest.toString());

        System.out.println("\nRunning Test 2a: ");
        getDonorAttributes(donorTestTwo);

        System.out.println("\nRunning Test 2b:");
        getDonationAttributes(donationTestTwo);

        System.out.println("\nRunning Test 3a: ");
        if (donorTest.equals(donorTestTwo)) {
            System.out.println("Donor objects ARE equal.");
        } else {
            System.out.println("Donor objects are NOT equal");
        }

        System.out.println("\nRunning Test 3b: ");
        if (donationTest.equals(donationTestTwo)) {
            System.out.println("Donation objects ARE equal.");
        } else {
            System.out.println("Donation objects are NOT equal");
        }


    }

    //**********************************MAIN END************************************************************************


    /**
     * Method to get if email contains @ symbol. Used for now instead of regex.
     * @param donor - donor object
     * @return
     */
    public static boolean checkEmail(Donor donor) {
        if (donor.getEmailAddress().contains("@")) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Checks if check number is between 100 and 5000. Will continue even if out of range.
     * @param donation
     * @return
     */
    public static boolean checkCheckNumber(Donation donation) {
        if ((donation.getCheckNum() >= 100) && (donation.getCheckNum()<= 5000)) {
            return true;
        } else {
            return false;
        }
    }


    /**
     * Method to set donor object with attributes read from csv file.
     * @param attributes - Breaks up line into an array of strings seperated by comma.
     * @return
     */
    public static Donor setDonorAttributes(String[] attributes) {
        Donor donorTest2a = new Donor();

        donorTest2a.setDonorId(Integer.parseInt(attributes[1]));
        donorTest2a.setFirstName(attributes[2]);
        donorTest2a.setLastName(attributes[3]);
        donorTest2a.setEmailAddress(attributes[4]);
        donorTest2a.setPhoneNumber(attributes[5]);

        return donorTest2a;
    }

    /**
     * Method to set donoation object with attributes read from csv file.
     * @param attributes
     * @return
     */
    public static Donation setDonationAttributes(String[] attributes) {
        Donation donationTest2a = new Donation();

        donationTest2a.setDonationId(Integer.parseInt(attributes[1]));
        donationTest2a.setDonorIdD(Integer.parseInt(attributes[2]));
        donationTest2a.setDonationDescription(attributes[3]);
        donationTest2a.setDonationAmount(Double.parseDouble(attributes[4]));
        donationTest2a.setDonationDate(attributes[5]);
        donationTest2a.setTaxDeductible(Boolean.parseBoolean(attributes[6]));
        donationTest2a.setCheckNum(Integer.parseInt(attributes[7]));

        return donationTest2a;

    }

    /**
     * Gets donor attributes from setDonorAttributes method for empty donor object. Also check donor email
     * to see if it contains @ symbol. Will still continue on even if not working. Then produces a toString style
     * message displaying the attributes from csv file.
     * @param donor
     * @return
     */
    public static Donor getDonorAttributes(Donor donor) {

        if (checkEmail(donor) == false) {
            System.out.println("Email does not contain @ symbol.\n");
        }

        System.out.println("Donor iD = " + donor.getDonorId() +
                "\nDonor firstName = " + donor.getFirstName() +
                "\nDonor lastName = " + donor.getLastName() +
                "\nDonor email = " + donor.getEmailAddress() +
                "\nDonor phoneNumber = " + donor.getPhoneNumber());

        return donor;
    }


    /**
     * Gets donation attributes from setDonationAttributes method for empty donation object. Also checks if donation
     * check number is between 100 and 5000. Will continue even if outside of 100 and 5000. THen produces a toString
     * style message displaying the attributes from csv file.
     * @param donation
     * @return
     */
    public static Donation getDonationAttributes(Donation donation) {
        if(checkCheckNumber(donation) == true) {
            System.out.println("Check number is IN range of 100 & 5000.\n");
        } else if (checkCheckNumber((donation)) == false) {
            System.out.println("Check number is OUT of range of 100 & 5000.\n");
        }

        System.out.println("Donation iD = " + donation.getDonationId() +
                "\nDonation donor's id = " + donation.getDonorIdD() +
                "\nDonation description = " + donation.getDonationDescription() +
                "\nDonation amount = " + donation.getDonationAmount() +
                "\nDonation date = " + donation.getDonationDate() +
                "\nDonation tax deductible? = " + donation.isTaxDeductible() +
                "\nDonation check number = " + donation.getCheckNum());


        return donation;
    }

}
