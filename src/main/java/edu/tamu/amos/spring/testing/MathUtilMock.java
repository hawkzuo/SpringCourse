package edu.tamu.amos.spring.testing;

/**
 * Created by Amos on 2018/2/8.
 */
public class MathUtilMock {

    private InternalService service;

    public MathUtilMock(InternalService service) {
        this.service = service;
    }


    public int callServiceAndSum() {
        // First load data from service,
        // Then Print it out
        // Since Unit Testing only tests the class "MathUtilMock" behavior,
        // We can mock service data
        int sum = 0;
        for (int i: service.getData()) {
            sum += i;
        }
        System.out.println(sum);
        return sum;
    }


}
