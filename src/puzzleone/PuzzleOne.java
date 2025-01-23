package puzzleone;

public class PuzzleOne {

	public static void main(String[] args) {

		countappearance();

	}

	public static void countappearance() {
		int appearsRight = 0;
		int countedLeft = 0;
		int similarityScore = 0;
		while (countedLeft < 999) {
			int countednumber = InputOne.inputone[countedLeft]; 
			for (int i = 0; i < InputOne.inputone.length; i++) {
				if (InputOne.inputone[countedLeft] == InputTwo.inputtwo[i]) {
					System.out.println("Vorkommen von " + InputOne.inputone[countedLeft] + " = " + appearsRight);
					appearsRight++;
				}
			}
			similarityScore = similarityScore + (countednumber* appearsRight);
			System.out.println("Similarity-Score = " + similarityScore);
			countedLeft++;
			appearsRight =0;
		}

	}

	public static void printing(int toprint[]) {
		for (int p = 0; p < toprint.length; p++) {
			System.out.printf(toprint[p] + ",");
		}
		System.out.println("");
		System.out.println(
				"-----------------------------------------------------------------------------------------------");
	}

	public static void bubbleandsubtract() {
		boolean onesorted = true;
		boolean twosorted = true;

		printing(InputOne.inputone);

		printing(InputTwo.inputtwo);

		do {
			onesorted = false;
			for (int i = 1; i < InputOne.inputone.length; i++) {
				if (InputOne.inputone[i] < InputOne.inputone[(i - 1)]) {
					int tempsave = InputOne.inputone[i];
					InputOne.inputone[i] = InputOne.inputone[(i - 1)];
					InputOne.inputone[(i - 1)] = tempsave;
					onesorted = true;
				}

			}

		} while (onesorted);

		do {
			twosorted = false;
			for (int j = 1; j < InputTwo.inputtwo.length; j++) {
				if (InputTwo.inputtwo[j] < InputTwo.inputtwo[(j - 1)]) {
					int tempsave = InputTwo.inputtwo[j];
					InputTwo.inputtwo[j] = InputTwo.inputtwo[(j - 1)];
					InputTwo.inputtwo[(j - 1)] = tempsave;
					twosorted = true;
				}

			}
		} while (twosorted);

		printing(InputOne.inputone);

		printing(InputTwo.inputtwo);

		int totaldistance = 0;

		for (int k = 0; k < InputOne.inputone.length; k++) {
			if (InputOne.inputone[k] < InputTwo.inputtwo[k]) {
				totaldistance = totaldistance + (InputTwo.inputtwo[k] - InputOne.inputone[k]);
			} else if (InputOne.inputone[k] > InputTwo.inputtwo[k]) {
				totaldistance = totaldistance + (InputOne.inputone[k] - InputTwo.inputtwo[k]);
			}
		}
		System.out.println("Gesamtdistanz = " + totaldistance);

	}

}
