package zipcode;

public class Hamming {

    private String strand1;
    private String strand2;

    public Hamming(String s, String s1) { //constructor

        this.strand1 = s;
        this.strand2 = s1;

        if (strand1.length() != strand2.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }


    }



    public int getHammingDistance() { //method

        //hamming distances = differences between the two strings
        //two "equal strings", search for differences between the two at the same index, return the count of the differences
        //kicker - this only works between two equal length string, therefore, we need to account for the uneven strings

        int hammingDistance = 0;


            for (int i = 0; i < strand2.length(); i++) {
                if (strand1.charAt(i) != strand2.charAt(i)) {
                    hammingDistance++;
                }
            }


        return hammingDistance;
    }
}
