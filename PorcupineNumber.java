public class PorcupineNumber {
	
	static int findPorcupineNumber (int num){
		//1 last digit is 9
		//2 next prime number that follows ends also in 9
		//method takes a number, finds the next porcupine number
		for(int i = num; i < Integer.MAX_VALUE;i++ ){
			if (isPrime.isPrime(i) && (i%10) == 9){
				for(int j = i+1; j < Integer.MAX_VALUE; j++){
					if(isPrime.isPrime(j) && j%10 != 9)
						break;
					if (isPrime.isPrime(j) && j%10==9 && j!=i) {
						return i;
					}
				}
			}
		}
		return 0;
	}
	
	public static void main (String[] args) {
		System.out.println(findPorcupineNumber(0));
		System.out.println(findPorcupineNumber(138));
		System.out.println(findPorcupineNumber(139));
		System.out.println(findPorcupineNumber(409));
		
	}

}
