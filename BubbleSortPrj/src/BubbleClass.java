import java.util.Arrays;

public class BubbleClass {
	
	// BubbleSort 처리용 메서드
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			// i를 빼는 이유: 한번의 싸이클을 돌면 뒷자리가 정렬된 상태이기 때문에 하나씩 소거(i가 1씩 증가하기 때문에 i를 제거)
			for(int j = 0; j < arr.length - i - 1; j++) {
				int temp;
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;				
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] items = {5, 6, 1, 4, 3, 7, 2};
		System.out.println(Arrays.toString(items));
		
		bubbleSort(items);
		System.out.println(Arrays.toString(items));
	}
}
