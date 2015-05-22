
public class Asterisk {

    private String value = "";

    public String showOneTime() {
        this.value = this.value.concat("*");
        return value;
    }

    public String showNTimesGivenNumber(int numberOfTimes) {
        try {
            validateNumber(numberOfTimes);
            while (numberOfTimes > 0) {
                this.value = this.value.concat("*");
                numberOfTimes--;
            }
        }
        catch (NegativeNumberException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return this.value;
    }

    private void validateNumber(int number) throws NegativeNumberException {
        if (number < 0) {
            throw new NegativeNumberException();
        }
    }
}
