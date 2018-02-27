package springFramework.core;

public class SampleClass {

    String text = "sample text2";
    int number = 987;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static SampleClass createSampleClass(){
        return new SampleClass();
    }

    public SampleClass createSampleClassNotStatic(){
        return new SampleClass();
    }



}
