package globalConvertor;

public class Decimal extends Base {

	/*
	 * displays decimal values from ASCII characters
	 * of user input
	 * */
	@Override
	public void convertir(ChaineCar tabchar) {
		// afficher tab
		int sizeTab = tabchar.decimalsArray.length;
		for (int i = 0 ; i < sizeTab ; i++) {
			System.out.print(tabchar.decimalsArray[i] + " ");
		}
		
	}



}
