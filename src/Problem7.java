
public class Problem7{
	private static int count = 0;
	static void isPrimeNumber(int n) {  
        if (n == 2) { 
        	count++;
            return;  
        }else{
        if (n == 3) { 
        	count++;
            return;  
        }else{ 
        double max = Math.sqrt(n);  
        for (int i = 2; i <= max; i++) {  
            if (n % i == 0) {  
                return;  
            }  
        }
        count++;
        return; 
        }
    }
}
	public static void main(String[] args){
		int i=2;
		while(count<10000){
			i++;
			isPrimeNumber(i);
		}
		System.out.print(i);
	}
}
