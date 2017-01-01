/**
 * Created by Owner on 12/29/2016.
 */
public class Donor {

    private int donorId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;


    //Empty Constructor
    public Donor() {
    }

    /**
     * Constructor with parameters for Donor object.
     *
     * @param donorId
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param emailAddress
     */
    public Donor(int donorId, String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.donorId = donorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }



    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Method to get if email contains @ symbol. Used for now instead of regex.
     * @param donor - donor object
     * @return
     */
    public boolean checkEmail(Donor donor) {
        if (this.emailAddress.contains("@")) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method to check if two donor objects contain same value.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Donor donor = (Donor) o;

        if (donorId != donor.donorId) return false;
        if (firstName != null ? !firstName.equals(donor.firstName) : donor.firstName != null) return false;
        if (lastName != null ? !lastName.equals(donor.lastName) : donor.lastName != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(donor.phoneNumber) : donor.phoneNumber != null) return false;
        return emailAddress != null ? emailAddress.equals(donor.emailAddress) : donor.emailAddress == null;
    }


    /**
     * Method to customize a print method for donor object.
     * @return
     */
    @Override
    public String toString() {
        return "Donor {donorId= " + this.getDonorId() + ", " + "firstname= " + this.getFirstName() + ", " +
                "lastname= " + this.getLastName() + ", " + "phoneNumber= " + this.getPhoneNumber() + ", "
                + "emailAddress= " + this.getEmailAddress();
    }
}







