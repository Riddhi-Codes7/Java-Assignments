public class LargestElement{

    public static void main(String[] args)
    {
        double arrays[] = {45.8, 1000.0, -90.3, -1000.0, 200.9};
        double largest = arrays[0];

        for (int i=0; i< arrays.length; i++){
            if ( largest < arrays[i])
            {
                largest = arrays[i];
            }
        }
        System.out.println("Largest number in the Array is: " +largest);
    }
}