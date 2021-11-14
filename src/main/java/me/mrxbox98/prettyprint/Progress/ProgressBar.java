package me.mrxbox98.prettyprint.Progress;

import me.mrxbox98.prettyprint.Color.BrightBackground;
import me.mrxbox98.prettyprint.Format.Format;

public class ProgressBar {

    int progress;

    String progressColor;

    String leftColor=BrightBackground.RESET;

    String start;

    String end;

    public ProgressBar()
    {
        progress=0;
    }

    /**
     * Prints the progress bar
     */
    public void print()
    {
        checkForSetup();
        String progress = Format.BOLD + start + progressColor;
        for(int i=0;i<this.progress;i++)
        {
            progress+=" ";
        }
        progress+=leftColor;
        for(int i=this.progress;i<100;i++)
        {
            progress+=" ";
        }

        progress+=Format.BOLD + end;
        System.out.print(progress);
    }

    /**
     * Gets the progress in the progress bar
     * @return the progress
     */
    public int getProgress() {
        return progress;
    }

    /**
     * Sets the progress of the progress bar
     * @param progress the of the progress bar
     */
    public void setProgress(int progress) {
        this.progress = progress;
    }

    /**
     * Gets the color of the progress left
     * @return the color of the progress left
     */
    public String getLeftColor() {
        return leftColor;
    }

    /**
     * Sets the background color for how much progress is left
     * @param leftColor the color left
     */
    public void setLeftColor(String leftColor) {
        this.leftColor = leftColor;
    }

    /**
     * Gets the start of the progress bar
     * @return the start of the progress bar
     */
    public String getStart() {
        return start;
    }

    /**
     * Sets the start of the progress bar
     * @param start the new start of the progress bar
     */
    public void setStart(String start) {
        this.start = start;
    }

    /**
     * Gets the end of the progress bar
     * @return the end of the progress bar
     */
    public String getEnd() {
        return end;
    }

    /**
     * Sets the end character
     * @param end the end of the progress bar
     */
    public void setEnd(String end) {
        this.end = end;
    }

    /**
     * Checks if any of the variables have not been set
     * @throws IllegalArgumentException when one of the variables are null
     */
    public void checkForSetup()
    {
        if(progressColor==null || start==null || end==null)
        {
            throw new IllegalArgumentException("ProgressColor, start, or end has not been set!");
        }
    }
}
