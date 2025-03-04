package com.pavi.learning.java.Testquestion;

public class FirstLetterWord {

        public static void main(String[] args) {

            String word1a = "California";
            String word1b = "Connecticut";
            String word2a = "NewJersey";
            String word2b = "Maryland";

            System.out.println(" "+ word1a + " " + word1b );
            checkFirstLetterWithoutBoolean(word1a, word1b);

            System.out.println(" " + word2a + " " + word2b );
            checkFirstLetterWithoutBoolean(word2a, word2b);
        }

        public static void checkFirstLetterWithoutBoolean(String word1, String word2) {
            if (word1 == null || word2 == null || word1.isEmpty() || word2.isEmpty()) {
                System.out.println("Invalid input.");
                return;
            }

            String firstLetter1 = word1.substring(0, 1).toLowerCase();
            String firstLetter2 = word2.substring(0, 1).toLowerCase();

            if (firstLetter1.equals(firstLetter2)) {
                System.out.println("Yes, they have the same first letter.");
            } else {
                System.out.println("No, they do not have the same first letter.");
            }
        }
    }

