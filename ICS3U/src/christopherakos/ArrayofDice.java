package christopherakos;

public class ArrayofDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int dieOne;
		int dieTwo;
		int x;

		String[] roll = new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
		int[] total = new int[11];

		for (int i = 0; i != 10000; i++) {
			dieOne = (int) (Math.random() * 6) + 1;
			dieTwo = (int) (Math.random() * 6) + 1;
			x = dieOne + dieTwo;

			if (x == 2) {
				total[0]++;
			}
			else if (x == 3) {
				total[1]++;
			}
			else if (x == 4) {
				total[2]++;
			}
			else if (x == 5) {
				total[3]++;
			}
			else if (x == 6) {
				total[4]++;
			}
			else if (x == 7) {
				total[5]++;
			}
			else if (x == 8) {
				total[6]++;
			}
			else if (x == 9) {
				total[7]++;
			}
			else if (x == 10) {
				total[8]++;
			}
			else if (x == 11) {
				total[9]++;
			}
			else if (x == 12) {
				total[10]++;
			}
		}
		System.out.println("Total   |   Number of Times Rolled");
		for (int i = 0; i != 11; i++) {
			System.out.println(roll[i] + "          " + total[i]);
		}

	}

}
