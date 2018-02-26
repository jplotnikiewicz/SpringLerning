package springFramework.core;

public class PetStoreServiceImpl {
    int number;
    String text;


    public PetStoreServiceImpl(){
        number = 123;
        text = "jada chlopcy jada";
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
