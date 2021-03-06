package exception;
/**
 * Custom Exception
 * @author suryavanshi
 *
 */

class InvalidProductException extends Exception
{
	public InvalidProductException(String s) {
		super(s);
	}
}

public class Example4 {

	void productCheck(int weight) throws InvalidProductException {
		if (weight < 100) {
			throw new InvalidProductException("Product Invalid");
		}
	}

	public static void main(String args[])
	{
		Example4 obj = new Example4();
		try {
			obj.productCheck(60);
		}
		catch (InvalidProductException ex) {
			System.out.println("Caught the exception");
			System.out.println(ex.getMessage());
		}
	}
}