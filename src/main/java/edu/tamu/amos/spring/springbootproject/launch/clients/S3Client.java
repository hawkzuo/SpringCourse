package edu.tamu.amos.spring.springbootproject.launch.clients;

import java.io.File;
import java.io.InputStream;

/*
 * Created by Amos on 2/14/18.
 */
public interface S3Client {


    public void putFile(String bucketName, String key, File fileToUpload);

    public File saveObjectToTempFile(String bucketName, String key, String randomID);

    public InputStream readObjectAsInputStream(String bucketName, String key);

    public String generatePreSignedUrl(String bucketName, String key, String fileName, Long expirationTimeInMilliSeconds);


}
