public class instertion {
    public static void main(String[] args) {
        int arr[] = { 12, 1, 10, 3, 5, 6 };
        for (int i = 1; i < 6; i++) {
            int curr = arr[i];
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = curr;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(arr[i]);
        }
    }

}
