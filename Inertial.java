public class Inertial {

//    An array is defined to be inertial if the following conditions hold:
//    a. it contains at least one odd value
//    b. the maximum value in the array is even
//    c. every odd value is greater than every even value that is not the maximum value.
//            So {11, 4, 20, 9, 2, 8} is inertial because
//    a. it contains at least one odd value
//    b. the maximum value in the array is 20 which is even
//    c. the two odd values (11 and 9) are greater than all the
//    even values that are not equal to 20 (the maximum), i.e., (4, 2, 8}.

    public static void main(String[] args) {

        System.out.println(iner(new int[]{1}));
        System.out.println(iner(new int[]{2}));
        System.out.println(iner(new int[]{1,2,3,4}));
        System.out.println(iner(new int[]{1, 1, 1, 1, 1, 1, 2}));
        System.out.println(iner(new int[]{2, 12, 12, 4, 6, 8, 11}));
        System.out.println(iner(new int[]{-2, -4, -6, -8, -11}));
        System.out.println(iner(new int[]{2, 3, 5, 7}));

    }

    static int iner(int[] a){
        boolean oOdd = false;
        int max = Integer.MIN_VALUE;
        for (int i : a){
            if (i>max)
                max = i;
            if(i%2!=0)
                oOdd = true;
        }
        if (!oOdd)
            return 0;
        if(max % 2 != 0)
            return 0;

        int oddMax = Integer.MIN_VALUE;
        int oddMin = Integer.MIN_VALUE;
        int evenMax = Integer.MIN_VALUE;

        //Looking and setting for even maximum
        for(int i : a){
            if( i % 2 == 0 && i >= evenMax)
                evenMax = i;
        }
        //Looking and setting for odd maximum
        for(int i : a){
            if( i % 2 != 0 && i >= oddMax)
                oddMax = i;
        }
        if (evenMax<oddMax)
            return 0;

        //Looking for odd minimum
        for(int i : a){
            if( i % 2 != 0 && i <= oddMin)
                oddMin = i;
        }

        for (int i : a){
            if(i%2 == 0 && i != evenMax)
                if (i > oddMin)
                    return 0;
        }


        return 1;
    }

}
