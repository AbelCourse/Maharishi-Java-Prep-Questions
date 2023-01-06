public class MartianArray {
	public static void main(String[] args) {

		int[] a = {1,3};
		int[] b = {1, 2, 1, 2, 1, 2, 1, 2, 1};
		int[] c = {1, 3, 2};
		int[] d = {1, 3, 2, 2, 1, 5, 1, 5};
		int[] e = {1, 2, -18, -18, 1, 2};
		int[] f = {};
		System.out.println(martianArray(a));
		System.out.println(martianArray(b));
		System.out.println(martianArray(c));
		System.out.println(martianArray(d));
		System.out.println(martianArray(e));
		System.out.println(martianArray(f));
	}

	static int martianArray(int[] arr){
		int oC = 0, tC = 0;
		for(int i : arr){
			if(i == 1) oC++;
			if(i == 2) tC++;
		}
		if (arr.length == 0) return 0;
		if(tC >= oC) return 0;

		for(int i = 0; i < arr.length-1; i++){
			if(arr[i] == arr[i+1]) return 0;
		}
		return 1;

	}
}
