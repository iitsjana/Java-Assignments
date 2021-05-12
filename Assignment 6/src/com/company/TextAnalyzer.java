package com.company;

//TextAnalyzer class storing text and functionalities
public class TextAnalyzer {
    private String text;

    // Constructor initializing the text instance variable
    public TextAnalyzer(String text){
        this.text=text;

    }

    // this is our setter
    public void setText(String text) {
        this.text = text;
    }

    /**
     * This method is used to calculate the frequency of each letter
     * @param text
     * @return text
     */

    public String FrequencyCalculator(String text){

    for(char letters='a'; letters<='z';
    letters++) // for letters starting from a to z
    {

        int counter=0;
        for (int i=0;i<text.length(); i++) // for loop for each letter the user entered in his text
        {

            if(letters==text.charAt(i))// if the text the user enters contains a letter in letters
                counter++; //increases the frequency
        }
        System.out.println(letters + "          \t  " + counter); // displays the letters and the frequencies accordingly
    }
    return text;
    }
}

