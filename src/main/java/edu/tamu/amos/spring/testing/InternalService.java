package edu.tamu.amos.spring.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Amos on 2018/2/8.
 */
public class InternalService {
    private String serviceName;
    private List<Integer> data;

    public InternalService() {
        this.serviceName = "InternalService";
        this.data = new ArrayList<>();
    }

    public void generateData() {
        Random r = new Random(47);
        for (int i=0; i<5; i++) {
            data.add(r.nextInt());
        }
    }

    public List<Integer> getData() {
        return data;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
