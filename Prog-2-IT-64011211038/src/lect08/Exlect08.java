package lect08;

public class Exlect08 {

	public static final int ANSWER_1ST_LINE = 2;
	public static final int ANSWER_1ST_COLUMN = 2;
	public static final int ID_COLUMN = 1;

// ==================== searchStringArray ============================
	public static int searchStringArray(String[] arr, String str) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals(str)) {
				index = i;
				break;
			}
		}	

		return index;
	}

// ==================== min ============================
	public static void main(String[] args) {
		// add file
		String enrollFile = "src/lect08/enroll.csv";
		String aswerFile = "src/lect08/midterm-answer.csv";
		String correcredFile = "src/lect08/corrected-answers.csv";

		// Read file to method ReadTextFile
		String[] enrollArray = ReadTextFile.readTextFile(enrollFile);
		String[] aswerArray = ReadTextFile.readTextFile(aswerFile);
		String[] correcredArray = ReadTextFile.readTextFile(correcredFile);

		System.out.println(
				"\n ================================================================================================================ \n ");
		System.out.println("\t \t \t \t \t \t Test check program  ");
		System.out.println(
				"\n ================================================================================================================ \n ");

		// ==================== Create object ============================
		String[] corr = correcredArray[0].split(",");
		

		for (int i = ANSWER_1ST_LINE; i < aswerArray.length; i++) {
			String[] ansSplit = aswerArray[i].split(",");
			String id = ansSplit[ID_COLUMN];
			int mark = 0;
			// ==================== Check answer ============================

			System.out.print("[" + id + "] " + "Ans: ");// Show Student_ID
			for (int k = ANSWER_1ST_COLUMN; k < ansSplit.length; k++) {


				if (ansSplit[k].equals(corr[k - ANSWER_1ST_COLUMN])) { 
					mark += 1;
					System.out.print( "No." + (k - 1) +" " + ansSplit[k] + ":" + corr[k-2]+ "["+"1"+"]" +" "); //corrected
				}
				else
					System.out.print( "No." + (k - 1) +" " + ansSplit[k] + ":" + corr[k-2]+ "["+"0"+"]" +" "); // incorrect
			}
			// ==================== Check Enroll and ID ============================
			int index = searchStringArray(enrollArray, id);

			if (index < 0) {
				System.err.printf(" Error:  ID:%s not found!!! Enroll File \n", id);
				continue;
			}

			// ====================display============================
			System.out.println(" Student ID:" + id + ", Mark:" + mark);
		}
		
	}
}
