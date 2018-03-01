package edu.tamu.amos.spring.springbootproject.launch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * Created by Amos on 2018/2/8.
 */
@RestController
public class SampleController {

    private final Logger LOGGER =  LoggerFactory.getLogger(SampleController.class);

//    private final AWSS3ClientImpl s3Client;
//
//    @Autowired
//    public SampleController(AWSS3ClientImpl s3Client) {
//        this.s3Client = s3Client;
//    }

    @GetMapping("/items")
    public List<LineItem> getAllLineItems() {
        // Calling a Service then return values
        LOGGER.info("Begin processing getAllLineItems call.");
        List<LineItem> response = Collections.singletonList(new LineItem(3, 12, "Cables", 100));
        LOGGER.info("Finished processing getAllLineItems call.");
        return response;
    }
}
