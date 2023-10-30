package scripts;

public class firstlast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=77864;
		int fd=0;
		int ld=0;
		ld=no%10;
		while(no>=10)
		{
			no=no/10;
			fd=no;
		}
		
		int c=fd+ld;
		System.out.println(c);
	}

}
