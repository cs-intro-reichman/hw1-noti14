// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int rnd1 = (int) (Math.random() * lim);
		int rnd2 = (int) (Math.random() * lim);
		int rnd3  = (int) (Math.random() * lim);

		System.out.println(rnd1 + " " + rnd2 + " " + rnd3);


		int max = Math.max(rnd1, Math.max(rnd2, rnd3));
		int min = Math.min(rnd1, Math.min(rnd2, rnd3));
		int middle = rnd1 + rnd2 + rnd3 - (max + min);

		System.out.println(min + " " + middle + " " + max);
		
	}
}
