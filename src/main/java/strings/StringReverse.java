package strings;

public class StringReverse {
	
	public static void main(String[] args) {
		String string = "My name is Pradeep";
		
//		reverse(string);
		
		myReverse(string);
	}

	private static void myReverse(String string) {
		char arr[] = string.toCharArray();
		for (int i = 0; i < arr.length;i++) {
	
			if(arr[i]== ' ' || i == arr.length-1) {
				int j = i-1;
				if (i == arr.length-1)
					j = i;
				while(arr[j]!=' ') {
					System.out.print(arr[j--]);
					if(j < 0) break;
				}
				System.out.print((i == arr.length-1) ? "" : arr[i]);;
			}
			
		}
		
	}

	private static void reverse(String string) {	
		char arr[] = string.toCharArray();
		//char arr2[] = new char[string.length()];
		int space_location=0;
		int previous= space_location;
		for(int i=0; i < arr.length; i++) {
			int cntr = 0;
			space_location = i;
			
			if(arr[i]==' ')
			{
				char[] arr2 = new char[(space_location-1)-previous];
				for(int m=space_location;m>=0;m--)
				{
					System.out.print(arr2[m]);
				}
			}
			previous= space_location;
/*			while(arr[i]!=' ' && i <arr.length-1)
			{	
				arr2[cntr++]=arr[i];
				i++;
				space_location = i;				
			}
			for(int l=space_location-1;l>-1;l--)
			{
				System.out.print(arr[l]);
			/*	if(arr2[l] != ' ')
					System.out.print(arr[l]);
			}
			System.out.print(" ");*/

		}
	}
}