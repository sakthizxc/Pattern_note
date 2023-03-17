package Pattern_note;

public class Pattern9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern9 obj=new Pattern9();
obj.rev();
	}

	private void rev() {
		// TODO Auto-generated method stub
	
			for(int j=5;j>=1;j--)
			{
			for(int i=5;i>=j;i--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
			}
		}
	}

