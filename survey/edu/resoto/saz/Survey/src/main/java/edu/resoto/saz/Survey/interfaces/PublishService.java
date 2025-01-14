package edu.resoto.saz.Survey.interfaces;

import edu.resoto.saz.Survey.interfaces.gen.PublishServiceGen;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Component()
@RestController()
public class PublishService implements PublishServiceGen {

    @GetMapping(value = "/survey/publish/{surveyGuid}")
    protected Boolean publishSurvey(@PathVariable() String surveyGuid) {
        checkRequiredParametersOfPublishSurvey(surveyGuid);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfPublishSurvey(String surveyGuid) {
        if (surveyGuid == null)
            throw new IllegalArgumentException("Required parameter \"surveyGuid\" must not be null");
    }

    @GetMapping(value = "/survey/close/{surveyGuid}")
    protected Boolean closeSurvey(@PathVariable() String surveyGuid) {
        checkRequiredParametersOfCloseSurvey(surveyGuid);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfCloseSurvey(String surveyGuid) {
        if (surveyGuid == null)
            throw new IllegalArgumentException("Required parameter \"surveyGuid\" must not be null");
    }
}
