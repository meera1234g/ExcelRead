package excelreadnew;

import java.io.IOException;

public class Sampleexcelread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String f = Excelreadsample.getStringData(1,1);
		System.out.println(f);
		String k = Excelreadsample.getIntegerData(1,0);
		System.out.println(k);
	}

}
