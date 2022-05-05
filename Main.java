class Main {
  static int MaxSubarraySum(int a[]){
    int max_sum = Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
      for(int j=i;j<a.length;j++){
        int current_sum = 0;
        for(int k=i;k<=j;k++){
          current_sum += a[k];
        }
        if(current_sum > max_sum){
          max_sum = current_sum;
        }
      }
      }
    return max_sum;
  }
  public static void main(String[] args) {
    int a[] = {1,2,3,-6,6};
    System.out.println(MaxSubarraySum(a));
  }
}