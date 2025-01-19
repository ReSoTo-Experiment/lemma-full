package edu.resoto.saz.Survey.domain.Tenant.gen;

import edu.resoto.saz.Survey.domain.Tenant.Survey;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface SurveyRepositoryGen extends JpaRepository<Survey, Long> {

//    List<Survey> getSurveysCollection();
//
//    void setSurveysCollection(List<Survey> surveysCollection);

    Survey findByGuid(String guid);
}
