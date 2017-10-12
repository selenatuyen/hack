//Bubblesort problem
//given an array sort using bubble sort
public class Bubblesort{
	public static int[] bubblesort(int[] arr){
		if (arr.length <= 0){
			return arr;
		}
		int temp = 0;
		for(int i = arr.length-1; i > 0; i--){
			for(int j = 0; j < i; j++){
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(Stringp[] args){
		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] arr = new int[length];
		for(int i = 0; i < length; i++){
			arr[i] = in.nextInt();
		}
		print(bubblesort(arr));
	}
}
