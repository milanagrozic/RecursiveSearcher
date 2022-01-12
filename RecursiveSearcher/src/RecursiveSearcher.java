
public class RecursiveSearcher {
	
	public int doBinarySearch(IntegerArray arrayToSearch,int target) {
		return doBinarySearch(arrayToSearch, target, 0,arrayToSearch.length() -1);
	}
	
	private int doBinarySearch(IntegerArray arrayToSearch, int target, int low, int high) {
		
		if(low > high) {
			return -1;
		}
		
		int mid = low + (high - low) / 2;
		int value = arrayToSearch.read(mid);
		
		if(target == value) {
			int temp = mid;
			
			while(--mid >= 0 && arrayToSearch.read(mid) == target) {
				temp = mid;
			}
			
			return temp;
		} else if (target < value) {
			return doBinarySearch(arrayToSearch,target, low, mid - 1);
		} else {
			return doBinarySearch(arrayToSearch,target, mid + 1,high);
			
		}
	}
}
