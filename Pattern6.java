package Pattern_note;

public class Pattern6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Pattern6 obj=new Pattern6();
obj.print();
	}

	private void print() {
		// TODO Auto-generated method stub
		int n=0;
		for(int i=5;i>=1;i--)
		{
		
			for(int j=n+1;j<=5;j++)
				{
				System.out.print(j+" ");
				
				}
		
			System.out.println();
			n++;
				}
	}

}
