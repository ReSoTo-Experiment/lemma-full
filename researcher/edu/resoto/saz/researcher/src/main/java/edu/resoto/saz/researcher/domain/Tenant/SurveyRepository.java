package edu.resoto.saz.researcher.domain.Tenant;

import edu.resoto.saz.researcher.domain.Tenant.Survey;
import edu.resoto.saz.researcher.domain.Tenant.gen.SurveyRepositoryGen;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository()
public class SurveyRepository implements SurveyRepositoryGen {

    public SurveyRepository() {
    }

    private List<Survey> surveysCollection;

    @Override
    public List<Survey> getSurveysCollection() {
        return surveysCollection;
    }

    @Override
    public void setSurveysCollection(List<Survey> surveysCollection) {
        this.surveysCollection = surveysCollection;
    }

    public SurveyRepository(List<Survey> surveysCollection) {
        this.surveysCollection = surveysCollection;
    }

    @Override
    public Survey findByGuid(String guid) {
        /* FIXME If you safely want to implement this method, create an extension interface called 
SurveyRepositoryExt in the same folder as this class file and run the code 
generator again. Otherwise, this file and all your changes to it will probably get overwritten 
the next time the code generator is executed. */
        throw new UnsupportedOperationException("Not implemented");
    }
}
