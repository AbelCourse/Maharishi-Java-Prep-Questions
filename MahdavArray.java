public class MahdavArray {

    public static void main(String[] args) {

        int[] a = {2, 1, 1, 4, -1, -1};
        int[] b = {6, 2, 4, 2, 2, 2, 1, 5, 0, 0};
        int[] c = {18, 9, 10, 6, 6, 6};
        int[] d = {-6, -3, -3, 8, -5, -4};
        int[] e = {3, 1, 2, 3, 0};
        int[] f = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, -2, -1};
        System.out.println(mahdavArray(a));
        System.out.println(mahdavArray(b));
        System.out.println(mahdavArray(c));
        System.out.println(mahdavArray(d));
        System.out.println(mahdavArray(e));
        System.out.println(mahdavArray(f));

    }
    static int mahdavArray(int[] arr){


        boolean ch = false;
        for(int i = 0; i <= arr.length; i++ ){
            if (arr.length == (i*(i+1)/2 )) {
                ch = true;
                break;
            }
        }
        if(ch == false)
            return 0;
        if (ch){
            int diff = 2;
            for (int i = 1; i < arr.length; i++){
                int iSum = 0;
                for(int j = 0; j < diff; j++){
                    iSum += arr[i+j];
                }
                i--;
                if(arr[0] != iSum)
                    return 0;
                i += diff;
                diff++;
            }
        }
        return 1;
    }
}
