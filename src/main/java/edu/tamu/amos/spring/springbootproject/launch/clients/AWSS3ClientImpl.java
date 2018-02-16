package edu.tamu.amos.spring.springbootproject.launch.clients;

import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.InputStream;

/**
 * Created by Amos on 2018/2/13.
 */
public class AWSS3ClientImpl implements S3Client{

    private final Logger LOGGER = LoggerFactory.getLogger(AWSS3ClientImpl.class);

    // Specify the Looking Path for Credentials Region and other Options
    // TODO: Lacking Retry Logic => Java is not good at this on the design level
    private final AmazonS3 s3Client = generateS3Client();

    // This function is not an object, so it cannot be passed into a RetryUtil.retry()
    // This gives the advance of Scala language
    private AmazonS3 generateS3Client() {
        int trials = 0;
        int maxTrials = 3;
        AmazonS3 result;
        while(true) {
            try {
                result = AmazonS3ClientBuilder.standard()
                        .withCredentials(new DefaultAWSCredentialsProviderChain())
                        .withRegion(Regions.US_EAST_2)
                        .build();
                return result;
            } catch (Exception e) {
                LOGGER.warn("Exception while trying to create S3 client: {}", e.getMessage());
                if (++trials == maxTrials) {
                    LOGGER.error("Max retry limit reached. Failed to generate S3 client");
                    break;
                } else {
                    LOGGER.warn("Trying to re-generate S3 client for the {} time", trials);
                }
            }
        }

        return null;
    }

    public AWSS3ClientImpl() {

    }






    @Override
    public void putFile(String bucketName, String key, File fileToUpload) {
        if (s3Client == null) return;


    }

    @Override
    public File saveObjectToTempFile(String bucketName, String key, String randomID) {
        if (s3Client == null) return null;

        return null;
    }

    @Override
    public InputStream readObjectAsInputStream(String bucketName, String key) {
        if (s3Client == null) return null;

        return null;
    }

    @Override
    public String generatePreSignedUrl(String bucketName, String key, String fileName, Long expirationTimeInMilliSeconds) {
        if (s3Client == null) return null;


        return null;
    }
}
