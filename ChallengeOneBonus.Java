public class ChallengeOneBonus {
    /** @returns the number of words found in a string */
    private static int countWords(String inputstr) {
        long number = inputstr.isEmpty() ? 0 : 1 + inputstr.chars().filter(Character::isUpperCase).count();
    
        return Math.toIntExact(number);
    }
    public static void main(String[] args) {
        String input = "thisContainsFourWords";
        System.out.println(countWords(input));
    }
}