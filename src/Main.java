public class Main {

    public static void main(String[] args) {
	// write your code here

        //32 bytes
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        //64 bytes
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5.25d;

        int myIntValue2 = 5;
        float myFloatValue2 = 5f;
        double myDoubleValue2 = 5d;
        System.out.println("MyIntValue = " + myIntValue2);
        System.out.println("MyFloatValue = " + myFloatValue2);
        System.out.println("MyDoubleValue = " + myDoubleValue2);

        int myIntValue1 = 5 / 3;
        float myFloatValue1 = 5f /3f;
        double myDoubleValue1 = 5d /3d;
        System.out.println("MyIntValue = " + myIntValue1);
        System.out.println("MyFloatValue = " + myFloatValue1);
        System.out.println("MyDoubleValue = " + myDoubleValue1);

//rezolvarea mea
        int Pound = 200;
        double Kilogram = 0.45359237;
        System.out.println("MyTotalOfKilograms = " + (double) (Pound * Kilogram));

// rezolvarea trainer-ului
        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        double pi = 3.1415927d;
        double anotherNumber = 3_000_000.4_567_890d;
        System.out.println(pi);
        System.out.println(anotherNumber);

    }
}
