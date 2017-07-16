package algorithms.EvenTree;

public class Solution{
	public static void main(String[] args) {
		String str = "c";
		
		int left = 0;
		int right = str.length()-1;
		int result = str.length();
		System.out.println(right);
		int count = 0;
		while(left <= right){
			if(!str.substring(left, left+1).equals(str.substring(right, right+1))){
				left++;
				count++;
			}else{
				left++;
				right--;
			}
		}
		
		System.out.println(count+result);
		
	}
}