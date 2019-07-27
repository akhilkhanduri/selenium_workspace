package fibonacci.series.example;

public class FibonacciExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 20, t1  =0, t2 = 1;
		System.out.println("First : " + n + " Terms ");
		
		for(int i =1; i<=n; ++i) {
			System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
		}

	}

}
