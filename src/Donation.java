/**
 * Created by Owner on 12/31/2016.
 */
public class Donation {

    private int donationId;
    private int donorIdD;
    private String donationDescription;
    private double donationAmount;
    private String donationDate;
    private boolean taxDeductible;
    private int checkNum;


    //Empty constructor
    public Donation() {
    }

    /**
     * Constructor with parameters.
     * @param donationId
     * @param donorIdD
     * @param donationDescription
     * @param donationAmount
     * @param donationDate
     * @param taxDeductible
     * @param checkNum
     */
    public Donation(int donationId, int donorIdD, String donationDescription, double donationAmount,
                    String donationDate, boolean taxDeductible, int checkNum) {
        this.donationId = donationId;
        this.donorIdD = donorIdD;
        this.donationDescription = donationDescription;
        this.donationAmount = donationAmount;
        this.donationDate = donationDate;
        this.taxDeductible = taxDeductible;
        this.checkNum = checkNum;
    }


    //**************************************SETTERS * GETTERS*********************************************************

    public int getDonationId() {
        return donationId;
    }

    public void setDonationId(int donationId) {
        this.donationId = donationId;
    }

    public int getDonorIdD() {
        return donorIdD;
    }

    public void setDonorIdD(int donorIdD) {
        this.donorIdD = donorIdD;
    }

    public String getDonationDescription() {
        return donationDescription;
    }

    public void setDonationDescription(String donationDescription) {
        this.donationDescription = donationDescription;
    }

    public double getDonationAmount() {
        return donationAmount;
    }

    public void setDonationAmount(double donationAmount) {
        this.donationAmount = donationAmount;
    }

    public String getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(String donationDate) {
        this.donationDate = donationDate;
    }

    public boolean isTaxDeductible() {
        return taxDeductible;
    }

    public void setTaxDeductible(boolean taxDeductible) {
        this.taxDeductible = taxDeductible;
    }

    public int getCheckNum() {
        return checkNum;
    }

    public void setCheckNum(int checkNum) {
        this.checkNum = checkNum;
    }

    //**************************************SETTERS * GETTERS END*********************************************************



    /**
     * Overriding default toString method with custom output.
     * @return
     */
    @Override
    public String toString() {
        return "Donation{" +
                "donationId=" + donationId +
                ", donorIdD=" + donorIdD +
                ", donationDescription='" + donationDescription + '\'' +
                ", donationAmount=" + donationAmount +
                ", donationDate='" + donationDate + '\'' +
                ", taxDeductible=" + taxDeductible +
                ", checkNum=" + checkNum +
                '}';
    }


    /**
     * Equals method to test if two donation objects have equal values or point to same reference in heap.
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Donation donation = (Donation) o;

        if (donationId != donation.donationId) return false;
        if (donorIdD != donation.donorIdD) return false;
        if (Double.compare(donation.donationAmount, donationAmount) != 0) return false;
        if (taxDeductible != donation.taxDeductible) return false;
        if (checkNum != donation.checkNum) return false;
        if (donationDescription != null ? !donationDescription.equals(donation.donationDescription) : donation.donationDescription != null)
            return false;
        return donationDate != null ? donationDate.equals(donation.donationDate) : donation.donationDate == null;
    }

}
