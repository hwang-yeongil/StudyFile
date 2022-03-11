package Day2;

public class ArrayEx {
	public static void main(String[] args) {
		int[]	arr = new int[5];
		int[]	arr2= new int[5];	
				
		for(int i=0;i<arr.length;i++) {
			arr[i] = i + i;
			}
		
		System.out.println("변경전");
		System.out.println("arr.length:"+arr.length);
		for(int i=0; i < arr.length; i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
		}
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		
		
		
		int[] tmp = new int[arr.length*2];
		for(int i=0;i<arr.length;i++) {
			tmp[i] = arr[i];
			}
		
		arr =tmp;
		
		System.out.println("변경후");
		System.out.println("arr.length:"+arr.length);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]:"+arr[i]);
			}
		
		System.out.println("arr2.length:"+arr2.length);
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"]:"+arr2[i]);
			}
		
		 
		
	}
}
