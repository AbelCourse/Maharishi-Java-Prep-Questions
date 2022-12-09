
public class SquarePair {

//    Define a square pair to be the tuple <x, y> where x and y are positive, non-zero integers, x<y and x + y is a perfect square.

//    Write a function named countSquarePairs that takes an array and returns the number of square pairs that can be constructed from the elements in the
//    array. For example, if the array is {11, 5, 4, 20} the function would return 3 because the only square pairs that can be constructed from
//    those numbers are <5, 11>,<5, 20> and <4, 5>.
//    You may assume that there exists a function named isPerfectSquare that returns 1 if its argument is a perfect square and 0 otherwise. E.G., isPerfectSquare(4) returns 1 and isPerfectSquare(8) returns 0

    public static void main(String[] args) {
    
        System.out.println(countSquarePairs(new int[]{9, 0, 2, -5, 7}));
        System.out.println(countSquarePairs(new int[]{9}));
        
    }
    static int countSquarePairs(int[] arr){

        int counter = 0;
        for (int x: arr){
            for (int y : arr){
                    int sum = x+y;
                if(x<0 || y<0)
                    break;
                if(x>y)
                    break;
                if(isPerfectSquare(sum))
                    counter+=1;
            }
        }


        return counter;
    }
    static boolean isPerfectSquare(int num){
        for(int i = 0; i < num/2; i++){
            if (i * i == num)
                return true;
        }
        return false;
    }

}
