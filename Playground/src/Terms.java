/**
 * Created by sliu on 8/11/2014.
 */

import static java.lang.Math.*;

public class Terms {
    private double Limit;
    private double Deduct;
    private double Loss;

    public Terms(double tiv, double limit, double deduct)
    {
        Limit = limit;
        Deduct = deduct;
        Loss = Math.min(limit, Math.max(0,tiv-deduct));
    }

    public double getLoss()
    {
        return Loss;
    }
}
