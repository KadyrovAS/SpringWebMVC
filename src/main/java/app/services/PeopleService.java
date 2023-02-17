package app.services;

import java.util.logging.Logger;

public class PeopleService {
    private static Logger logger = Logger.getLogger(PeopleService.class.getName());
    public PeopleService(){
        logger.info("ROOT CONTEXT INIT");
    }
}
