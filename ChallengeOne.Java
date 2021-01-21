public class ChallengeOne {
    /** @returns the number of words found in a string */
    private static int countWords(String inputstr) {
        int length = inputstr.length();
        if (length == 0) {
            return 0;
        }
        int count = 1;
        for (int i = 0; i < length; i++) {
            char c = inputstr.charAt(i);
            if ('A' <= c && c <= 'Z') {
                count++;
            }
            else if (c == ' ') {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String input = "thisContainsFourWords";
        System.out.println(countWords(input));
    }
}