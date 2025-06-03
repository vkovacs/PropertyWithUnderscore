package hu.crs.properywithunderscore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class Main {
    @Value("${my.underscored_property}")
    public String myUnderscoredProperty;

    @Value("${my.underscore.less.property}")
    public String myUnderscoreLessProperty;

    @Value("${my.dashed-property}")
    public String myDashedProperty;


    @EventListener(ApplicationStartedEvent.class)
    public void app() {
        System.out.println("Application started successfully!");
        System.out.println("my.underscored_property: " + myUnderscoredProperty); //MY_UNDERSCORED_PROPERTY
        System.out.println("my.underscore.less.property: " + myUnderscoreLessProperty); //MY_UNDERSCORE_LESS_PROPERTY
        System.out.println("my.dashed-property: " + myDashedProperty); //MY_DASHED_PROPERTY
    }
}
