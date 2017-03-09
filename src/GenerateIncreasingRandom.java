import java.util.Random;

public class GenerateIncreasingRandom {


	public static int[] Random(){

		int i;
		Random random = new Random();
		int[] randomNumbers = new int[5];
		for (  i =0; i < 5; i++){
			randomNumbers[i] = random.nextInt(5)+1;


		}
		return randomNumbers;
	}
	
    public static int[] Sort() {
    	int[] r = Random();
        int i, j, key, temp;

        for (i = 1; i < r.length; i++) {
            key = r[i];
            j = i - 1;
            while (j >= 0 && key < r[j]) {
                temp = r[j];
                r[j] = r[j + 1];
                r[j + 1] = temp;
                j--;

            }
        }


        return r;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] p = Sort();

        for (int i =0; i < p.length;i ++) {
            System.out.print(p[i]+" ");
        }
	}


}


