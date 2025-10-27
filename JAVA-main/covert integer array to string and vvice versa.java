public class StringsInJava {
    public static void main(String[] args) {
        char[] arr = {'H', 'E', 'L', 'L', 'O'};
        System.out.println(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        String s = "Java";
        System.out.println(s.toUpperCase());
        for(int i = 0; i < s.length(); i++){
            System.out.print(s.charAt(i) + " ");
        }
        String college = "Aditye";
        char[] carr = college.toCharArray();
        carr[5] = 'a';
        String x = new String(carr);
        System.out.println(x);
        String str = "Adyaaa";
        for(char each: str.toCharArray()){
            System.out.print(each + " ");
        }
    }
   

}