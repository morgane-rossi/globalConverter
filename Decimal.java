package globalConvertor;

public class Decimal extends Base {

	/*
	 * displays decimal values from ASCII characters
	 * of user input
	 * */
	@Override
	public void converting(CharStr arrayChar) {
		// afficher tab
		int sizeTab = arrayChar.decimalsArray.length;
		for (int i = 0 ; i < sizeTab ; i++) {
			System.out.print(arrayChar.decimalsArray[i] + " ");
		}
		
	}



}
