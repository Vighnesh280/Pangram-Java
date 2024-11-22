public class CheckPangram {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over a lazy dog"; // Example input
        boolean isPangram = checkPangram(sentence);
        System.out.println("Is the input a pangram? " + isPangram);
    }

    public static boolean checkPangram(String sentence) {
        boolean[] alphabetFlags = new boolean[26];
        int index = 0;

        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                index = ch - 'a';
                alphabetFlags[index] = true;
            }
        }

        for (boolean flag : alphabetFlags) {
            if (!flag) {
                return false;
            }
        }

        return true;
    }
}
