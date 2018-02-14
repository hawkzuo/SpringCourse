package edu.tamu.amos.spring.springbootproject.clients;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;

/**
 * Created by Amos on 2018/2/13.
 */
public class AWSS3Client {
    // Specify the Looking Path for Credentials Region and other Options
    private final AmazonS3ClientBuilder s3Builder = AmazonS3ClientBuilder.standard()
            .withCredentials(new DefaultAWSCredentialsProviderChain())
            .withRegion(Regions.US_EAST_2);

    public AWSS3Client() {

    }

    public AmazonS3 createClient() {
        return s3Builder.build();
    }



}
