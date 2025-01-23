package puzzleone;

public class PuzzleOne {

	public static void main(String[] args) {
		int[] inputonesorted = InputOne.inputone;
		int[] inputtwosorted = InputTwo.inputtwo;
		
		boolean onesorted =true;
		boolean twosorted =true;
		
		do {
			onesorted = false;
			for(int i =1;i<inputonesorted.length;i++) {
				if (inputonesorted[i]<inputonesorted[(i-1)]) {
					int tempsave = inputonesorted[i];
					inputonesorted[i] = inputonesorted[(i-1)];
					inputonesorted[(i-1)] = tempsave;
					onesorted = true;
				}
				
			}
		} while(onesorted);
		
		do {
			twosorted = false;
			for(int j =1;j<inputtwosorted.length;j++) {
				if (inputtwosorted[j]<inputtwosorted[(j-1)]) {
					int tempsave = inputtwosorted[j];
					inputtwosorted[j] = inputtwosorted[(j-1)];
					inputtwosorted[(j-1)] = tempsave;
					onesorted = true;
				}
				
			}
		} while(twosorted);
		
		int totaldistance =0;
		
		for (int k = 0; k < inputonesorted.length;k++ ) {
			if (inputonesorted[k]<inputtwosorted[k]) {
				totaldistance += (inputtwosorted[k]-inputonesorted[k]);
			}
			if (inputonesorted[k]>inputtwosorted[k]) {
				totaldistance += (inputonesorted[k]-inputtwosorted[k]);
			}
		}
		System.out.println("Gesamtdistanz = "+totaldistance);

	}

}
