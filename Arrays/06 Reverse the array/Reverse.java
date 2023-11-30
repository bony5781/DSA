public class Reverse {

    public static String reverseArray(String str) {
        //create a character array for the string
        char[] charArray = str.toCharArray();
        //Initialize start to 0 and end to length - 1
        int start = 0;
        int end = charArray.length - 1;
        //Initialize loop
        while (start < end) {
            //Swap start with end
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            //Update start and end
            start++;
            end--;
        }
        String reversedString = new String(charArray); 
        return reversedString;
    }

    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(reverseArray(s1));
    }
}