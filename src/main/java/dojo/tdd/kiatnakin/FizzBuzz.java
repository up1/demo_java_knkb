package dojo.tdd.kiatnakin;

public class FizzBuzz {

    private static final String BUZZ = "Buzz";
    private static final String FIZZ = "Fizz";
    private static final String FIZZ_BUZZ = "FizzBuzz";

    public String say(int countNumber) {
        String said = String.valueOf(countNumber);
        Boolean isFizz = countNumber % 3 == 0;
        Boolean isBuzz = countNumber % 5 == 0;
        if(isFizz && isBuzz)
            said = FIZZ_BUZZ;
        else if (isFizz) 
            said = FIZZ;
        else if (isBuzz)
            said = BUZZ;
        else if (countNumber % 7 == 0) {
            said = "SADDDDD";
        }
        return said;
    }

}
