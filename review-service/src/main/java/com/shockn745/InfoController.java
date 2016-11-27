package com.shockn745;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kempenich Florian
 */
@RestController
@RequestMapping(value = "info")
public class InfoController {


    @RequestMapping
    public OkInfo ok() {
        return new OkInfo();
    }


    private static class OkInfo {

        public final String status;

        private OkInfo() {
            status = "ok";
        }
    }

}
