package springFramework.core;

public class SampleClass {

    String text = "sample text2";
    String number = "987";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static SampleClass createSampleClass(){
        return new SampleClass();
    }

    public SampleClass createSampleClassNotStatic(){
        return new SampleClass();
    }



}
