package edu.resoto.saz.researcher.domain.Tenant.gen;

import edu.resoto.saz.researcher.domain.Tenant.Survey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SurveyRepositoryGen extends JpaRepository<Survey, Long> {

    Survey findByGuid(String guid);
}
