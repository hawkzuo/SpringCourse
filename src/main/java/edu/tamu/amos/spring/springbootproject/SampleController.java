package edu.tamu.amos.spring.springbootproject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Amos on 2018/2/8.
 */
@RestController
public class SampleController {

    private final Logger LOGGER =  LoggerFactory.getLogger(SampleController.class);

    @GetMapping("/items")
    public List<LineItem> getAllLineItems() {
        // Calling a Service then return values
        LOGGER.info("Begin processing getAllLineItems call.");
        List<LineItem> response = Collections.singletonList(new LineItem(3, 12, "Cablesd", 100));
        LOGGER.info("Finished processing getAllLineItems call.");
        return response;
    }
}
