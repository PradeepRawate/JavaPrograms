package others;

public class WiproItrvSequence {

	public static void main(String[] args) {
		int[] arr = new int[100];
		arr[0] = 0;
		for(int i=1; i < 99; i++) {
			int position = 0;
			boolean found = false;
			for(int j = i-1 ; j >= 0; j--) {
				if(arr[i] == arr[j]) {
					position = j;
					found = true;
					break;
				}
			}
			if(found) {
				arr[i+1] = i - position;
			} else {
				arr[i+1] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
