public class CapitalizeIMPP {
    public static void main(String[] args) {
        String str = "take u forward is awesome";
        char[] arr = str.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == arr.length - 1 || arr[i - 1] == ' ' || (i < arr.length - 1 && arr[i + 1] == ' ')) {
                arr[i] = Character.toUpperCase(arr[i]);
            }
        }

        System.out.println(new String(arr));
    }
}