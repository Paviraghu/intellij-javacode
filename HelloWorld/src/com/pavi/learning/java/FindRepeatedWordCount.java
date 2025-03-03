package com.pavi.learning.java;

public class FindRepeatedWordCount {

    public static void main(String[] args) {

        countWords("mahil tech is now tech mahil and mahil tech also name as mahil tech");
    }

    static void countWords(String st)
    {
        String[] words = st.split("\\s");
        int[] fr = new int[words.length];
        for (int i = 0; i < fr.length; i++)
            fr[i] = 0;
        for (int i = 0; i < words.length; i++)
        {
            for (int j = 0; j < words.length; j++)
            {
                if (words[i].equals(words[j]))
                {
                    fr[i]++;
                }
            }
        }
        for (int i = 0; i < words.length; i++)
        {
            for (int j = 0; j < words.length; j++)
            {
                if (words[i].equals(words[j]))
                {
                    if (i != j)
                    {
                        words[i] = "";
                    }
                }
            }
        }
        int total = 0;
        System.out.println("Words and words count:");
        for (int i = 0; i < words.length; i++)
        {
            if (words[i] != "")
            {
                System.out.println(words[i] + "=" + fr[i]);
                total += fr[i];
            }
        }
        System.out.println("Total words counted: " + total);
    }
}
