/**
 * This class represents a number and provides methods to test its properties.
 */
public class MyNumber {
    
    // Private data member to store the number
    private int data;

    /**
     * Default constructor initializes the number to 0.
     */
    public MyNumber() {
        this.data = 0;
    }

    /**
     * Parameterized constructor initializes the number to a specified value.
     * 
     * @param value The value to initialize the number with.
     */
    public MyNumber(int value) {
        this.data = value;
    }

    /**
     * Checks if the number is negative.
     * 
     * @return true if the number is negative, false otherwise.
     */
    public boolean isNegative() {
        return this.data < 0;
    }

    /**
     * Checks if the number is positive.
     * 
     * @return true if the number is positive, false otherwise.
     */
    public boolean isPositive() {
        return this.data > 0;
    }

    /**
     * Checks if the number is zero.
     * 
     * @return true if the number is zero, false otherwise.
     */
    public boolean isZero() {
        return this.data == 0;
    }

    /**
     * Checks if the number is odd.
     * 
     * @return true if the number is odd, false otherwise.
     */
    public boolean isOdd() {
        return this.data % 2 != 0;
    }

    /**
     * Checks if the number is even.
     * 
     * @return true if the number is even, false otherwise.
     */
    public boolean isEven() {
        return this.data % 2 == 0;
    }

    /**
     * Main method to create an instance of MyNumber using command-line arguments
     * and perform tests on it.
     * 
     * @param args Command-line arguments where the first argument is the number to test.
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int value = Integer.parseInt(args[0]);
                MyNumber number = new MyNumber(value);
                
                System.out.println("Number: " + value);
                System.out.println("Is Negative: " + number.isNegative());
                System.out.println("Is Positive: " + number.isPositive());
                System.out.println("Is Zero: " + number.isZero());
                System.out.println("Is Odd: " + number.isOdd());
                System.out.println("Is Even: " + number.isEven());
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please provide an integer.");
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}
