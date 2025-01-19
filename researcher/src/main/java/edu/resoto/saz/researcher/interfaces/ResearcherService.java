package edu.resoto.saz.researcher.interfaces;

import edu.resoto.saz.researcher.domain.Tenant.Survey;
import edu.resoto.saz.researcher.interfaces.gen.ResearcherServiceGen;
import edu.resoto.saz.researcher.managers.ResearchManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component()
@RestController()
@RequestMapping("/researcher")
public class ResearcherService implements ResearcherServiceGen {

    private final ResearchManager researchManager;

    @Autowired
    public ResearcherService(ResearchManager researchManager) {
        this.researchManager = researchManager;
    }
    @GetMapping(value = "/survey/{surveyGuid}")
    protected Survey getResults(@PathVariable() String surveyGuid) {
        checkRequiredParametersOfGetResults(surveyGuid);

        if (researchManager != null) {
            return researchManager.getSurvey(surveyGuid);
        }
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfGetResults(String surveyGuid) {
        if (surveyGuid == null)
            throw new IllegalArgumentException("Required parameter \"surveyGuid\" must not be null");
    }

    @PostMapping(value = "/survey")
    protected Boolean createSurvey(@RequestBody() Survey user) {
        checkRequiredParametersOfCreateSurvey(user);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfCreateSurvey(Survey user) {
        if (user == null)
            throw new IllegalArgumentException("Required parameter \"user\" must not be null");
    }

    @PutMapping(value = "/survey")
    protected Boolean updateSurvey(@RequestBody() Survey user) {
        checkRequiredParametersOfUpdateSurvey(user);
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private void checkRequiredParametersOfUpdateSurvey(Survey user) {
        if (user == null)
            throw new IllegalArgumentException("Required parameter \"user\" must not be null");
    }

    @DeleteMapping(value = "/survey/{surveyGuid}")
    protected void deleteSurvey(@PathVariable() String surveyGuid) {
        checkRequiredParametersOfDeleteSurvey(surveyGuid);
    }

    private void checkRequiredParametersOfDeleteSurvey(String surveyGuid) {
        if (surveyGuid == null)
            throw new IllegalArgumentException("Required parameter \"surveyGuid\" must not be null");
    }
}
