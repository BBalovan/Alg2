import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;

public class Algo {

	public static void main(String[] args) {

		Calendar date1 = Calendar.getInstance();
		date1.set(2010, 10, 12);
		Calendar date2 = Calendar.getInstance();
		
		int[] A = new int[] {4, 1, 3, 5, 6, 2};

		int see = triangle(4);
		System.out.println(see);
		ArrayList<String> sejj = monthList(date1, date2);
		System.out.println(sejj);
		insertionSort(A);
		int na = hackerrankLoveLetter("sasmadara");
		System.out.println(na);

	}

	public static int triangle(int input) {
		int ans = -1;

		if (input == 1 || input == 2)
			ans = -1;
		else if (input % 2 != 0)
			ans = 2;
		else if (input % 4 == 0)
			ans = 4;
		else if (input % 2 == 0 && (input) % 4 != 0)
			ans = 3;

		return ans;
	}

	public static ArrayList<String> monthList(Calendar inDate1, Calendar inDate2) {
		ArrayList<String> outputList = new ArrayList<String>();
		Calendar date1 = inDate1;

		while (date1.before(inDate2)) {
			Integer year = date1.get(Calendar.YEAR);
			outputList.add(year.toString());
			outputList.add(new DateFormatSymbols().getMonths()[date1
					.get(Calendar.MONTH)]);
			date1.add(Calendar.MONTH, 1);
		}

		return outputList;
	}

	public static int hackerrankLoveLetter(String willBePal) {
		int ans = 0;
		ArrayList<Character> karList = new ArrayList<Character>();
		for (int i = 0; i < willBePal.length(); i++) {
			karList.add(willBePal.charAt(i));
		}
		char karEleje = 'a';
		char karVege = 'a';

		for (int i = 0; i < karList.size()/2; i++) {

			karEleje = karList.get(i);
			karVege = karList.get(karList.size() - 1 - i);

			if (karEleje > karVege) {
				while (karEleje != karVege) {
					karEleje--;
					karList.set(i, karEleje);
					ans++;
				}
			} else {
				while (karVege != karEleje) {
					karVege--;
					karList.set(karList.size()-i-1, karVege);
					ans++;
				}
			}
		}
		return ans;
	}

    public static void insertionSort(int[] A){
  for(int i = 1; i < A.length; i++){
    int value = A[i];
    int j = i - 1;
    while(j >= 0 && A[j] > value){
      A[j + 1] = A[j];
      j = j - 1;
    }
    A[j + 1] = value;
  }
        
        printArray(A);
}

    
    static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
      }
}

/*
 * HACKERRANK
 * 
 * import java.io.*; import java.util.*; import java.text.*; import java.math.*;
 * import java.util.regex.*;
 * 
 * public class Solution {
 * 
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * int turn = in.nextInt();
 * 
 * for (int j = 0; j < turn; j++) { String cycle = in.next();
 * System.out.println(hackerrankLoveLetter(cycle));
 * 
 * } } public static int hackerrankLoveLetter(String willBePal) { int ans = 0;
 * ArrayList<Character> karList = new ArrayList<Character>(); for (int i = 0; i
 * < willBePal.length(); i++) { karList.add(willBePal.charAt(i)); } char
 * karEleje = 'a'; char karVege = 'a';
 * 
 * for (int i = 0; i < karList.size(); i++) {
 * 
 * karEleje = karList.get(i); karVege = karList.get(karList.size()-1-i);
 * 
 * if (karEleje > karVege) { while (karEleje != karVege) { karEleje--;
 * karList.set(i, karEleje); ans++; } } else { while (karVege != karEleje) {
 * karVege--; karList.set(karList.size()-i-1, karVege); ans++; } } }
 * return ans; } }
 */
