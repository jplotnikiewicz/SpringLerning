package springFramework.core;


import java.beans.ConstructorProperties;

public class SmapleClass2 {

    SampleClass sampleClass;
    int number;
    String text;
    float decimal;


    public SmapleClass2(){

    }

    public SmapleClass2(SampleClass sampleClass ,int number, String text, float decimal){

        this.sampleClass = sampleClass;
        this.number = number;
        this.text = text;
        this.decimal = decimal;
    }


    public SampleClass getSampleClass() {
        return sampleClass;
    }

    public void setSampleClass(SampleClass sampleClass) {
        this.sampleClass = sampleClass;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public float getDecimal() {
        return decimal;
    }

    public void setDecimal(float decimal) {
        this.decimal = decimal;
    }
}
