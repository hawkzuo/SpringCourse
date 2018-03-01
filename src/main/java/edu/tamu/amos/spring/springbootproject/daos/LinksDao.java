package edu.tamu.amos.spring.springbootproject.daos;

import edu.tamu.amos.spring.springbootproject.launch.clients.S3Client;

/*
 * Created by Amos on 2/28/18.
 */
public class LinksDao {

    private final S3Client s3Client;

    public LinksDao(S3Client s3Client) {
        this.s3Client = s3Client;
    }


}
