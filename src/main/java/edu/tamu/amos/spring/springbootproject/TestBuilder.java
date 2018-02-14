package edu.tamu.amos.spring.springbootproject;

import com.amazonaws.services.s3.AmazonS3;
import edu.tamu.amos.spring.springbootproject.clients.AWSS3Client;

/**
 * Created by Amos on 2018/2/14.
 */
public class TestBuilder {
    public static void main(String[] args) {
        AmazonS3 s3Client = new AWSS3Client().createClient();


        System.out.println("123");
    }
}
