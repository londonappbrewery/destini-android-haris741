package com.londonappbrewery.destini;

public class Story {

    private int storyText;
    private int Button1;
    private int Button2;

    public Story(int storyText, int button1, int button2) {
        this.storyText = storyText;
        Button1 = button1;
        Button2 = button2;
    }

    public int getStoryText() {
        return storyText;
    }

    public void setStoryText(int storyText) {
        this.storyText = storyText;
    }

    public int getButton1() {
        return Button1;
    }

    public void setButton1(int button1) {
        Button1 = button1;
    }

    public int getButton2() {
        return Button2;
    }

    public void setButton2(int button2) {
        Button2 = button2;
    }
}
