package org.controller;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class TestController {

	private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(method = RequestMethod.GET, produces = "application/json")
    public String getSingleUser() {
        LOGGER.info("#########INFO####################DADADADADADADAFA##########################################");
        LOGGER.debug("########DEBUG#####################DADADADADADADAFA##########################################");
        LOGGER.debug("########WARN#####################DADADADADADADAFA##########################################");
        LOGGER.debug("########ERROR#####################DADADADADADADAFA##########################################");
	    return "getSingleUser";
    }
	
}
