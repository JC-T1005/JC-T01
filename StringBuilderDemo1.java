package demo2; 

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        //调用方法把数组变成字符串
        String str=ReverseString(arr);
        System.out.println(str);
    }

    public static String ReverseString(int arr[]) {
        StringBuilder sb=new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if(i< arr.length-1) {
                sb.append(arr[i]).append(",");
            }
            else {
                sb.append(arr[i]);
            }
        }
        sb.append("]");
        return sb.toString();

    }
}
