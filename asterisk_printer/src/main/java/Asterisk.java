
public class Asterisk {

    private String value = "";

    public String showOneTime() {
        this.value = this.value.concat("*");
        return value;
    }

    public String showNTimesGivenNumber(int numberOfTimes) {
        if(numberOfTimes < 0) { throw new IllegalArgumentException("Not possible to print asterisk negative times"); }

        while (numberOfTimes > 0) {
            this.value = this.value.concat("*");
            numberOfTimes--;
        }

        return this.value;
    }
}
