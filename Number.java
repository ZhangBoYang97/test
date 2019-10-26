public class ExceptionCauseStudy {
    public static void main(String[] args) {
     //这里使用的异常非常的简单，我们用的是数组越界异常
        int a[] = {1,2,3,4,5};
      //  int element = getElement(a, 5);
        // 优化1 访问正确的数值索引下标
        int element = getElement(a.3);
        System.out.println(element);
    }
    public static int getElement(int arr[],int a){
        int number = arr[a];
        return number;
    }
