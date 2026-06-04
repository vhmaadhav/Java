// Last updated: 6/4/2026, 7:24:13 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        // Step 1: A pangram must have at least 26 characters
        if (sentence.length() < 26) {
            return false;
        }

        // Step 2: Create a boolean array to track each letter (a-z)
        boolean[] alphabetSeen = new boolean[26];

        // Step 3: Iterate through the string
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            
            // Map 'a' to index 0, 'b' to 1, etc.
            int index = ch - 'a';
            alphabetSeen[index] = true;
        }

        // Step 4: Verify if every letter was found
        for (boolean present : alphabetSeen) {
            if (!present) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true;
    }
}