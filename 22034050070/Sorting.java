import java.util.Scanner;
class Sorting{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;++i)
		{
			arr[i]=sc.nextInt();
		}
			insertionSort(n,arr);
	}
	
	
	public static void insertionSort(int n,int arr[]){
		
		int temp = arr[n-1];
		for(int i=n-1;i>=0;--i){
			
			//System.out.println("temp = "+temp);
			//System.out.println(i+" "+arr[i]);
			if(temp<arr[i]){
				break;
			
			}
			for(int j=n-2;j>=0;j--){
				
				if(temp<arr[j]){
				arr[i]=arr[i-1];
				}
				else{
					arr[j+1]=temp;
					//System.out.println(i+" "+arr[i]);
					for(int k = 0;k<n;k++){
						System.out.print(arr[k]+" ");
					}
					System.out.println();
					break;
				}
				
			}
			
		}
	}
		
		
		
		
	/*public static void insertionSort(int n,int arr[]){
		
		for(int i=n;i>0;--i){
			int temp = arr[i-1]; //3
			//System.out.println(i);
			for(int j=n-2;j>0;--j){
				if(temp<arr[j]){
			
					break;
				}
				else
				{
					arr[i-1]=arr[j];
					for(int a=0;a<n;++a)
						System.out.print(arr[a]+" ");
					System.out.println();
				}	
	}
	
	}
}*/
}