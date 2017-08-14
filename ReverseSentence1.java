
public class ReverseSentence1 {

	public static void main(String[] args) {
		String inputStr= "This is a test string";
		
		String[] wordsArr = inputStr.split(" ");
		
		int strlen = wordsArr.length;
		String[] resultArr = new String[strlen];
		
		System.out.print("Reversing the whole sentence:");
		
		for(int i=strlen-1,j=0;i>=0 || j<strlen;i--,j++) {
			System.out.print(wordsArr[i] +" ");
			resultArr[j] = wordsArr[i];
		}

		System.out.println(" ");
		System.out.print("Reversing the sentence and words: ");
		
		for(int i=0;i<strlen;i++) {
			System.out.print(reverseWord(resultArr[i]) +" ");
		}
		
		System.out.println(" ");
		System.out.print("Reversing the words only: ");
		
		for(int i=0;i<strlen;i++) {
			System.out.print(reverseWord(wordsArr[i]) +" ");
		}
	}

	public static String reverseWord(String inputWord) {
		
		int wordLen = inputWord.length();
		String[] inputArr = inputWord.split("");
		StringBuilder resultstr  = new StringBuilder();
		for(int i=0,j=wordLen-1;i<wordLen/2 || j>wordLen/2;i++,j--) {
			String temp = inputArr[i];
			inputArr[i] = inputArr[j];
			inputArr[j] = temp;
		}
		for(int i=0;i<wordLen;i++) {
			resultstr.append(inputArr[i]);
		}
		//System.out.println(inputWord);
		return resultstr.toString();
	}
}
