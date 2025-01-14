package edu.resoto.saz.Admin.domain.Tenant.gen;

import edu.resoto.saz.Admin.domain.Tenant.Survey;
import java.util.List;

public interface SurveyRepositoryGen {

    List<Survey> getSurveysCollection();

    void setSurveysCollection(List<Survey> surveysCollection);

    Survey findByGuid(String guid);
}
