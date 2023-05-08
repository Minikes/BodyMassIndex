public class BmiService {
    public int index (double heightMeter, int massKilogram){

        double bmi1 = massKilogram / (heightMeter * heightMeter);
        int bmi = (int)bmi1;

        return bmi;

    }

}
