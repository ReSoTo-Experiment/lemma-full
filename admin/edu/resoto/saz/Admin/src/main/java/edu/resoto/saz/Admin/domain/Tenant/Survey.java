package edu.resoto.saz.Admin.domain.Tenant;

import edu.resoto.saz.Admin.domain.Tenant.gen.SurveyGen;
import jakarta.persistence.Entity;

@Entity()
public class Survey implements SurveyGen {

    public Survey() {
    }

    private long id;

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    private String guid;

    @Override
    public String getGuid() {
        return guid;
    }

    @Override
    public void setGuid(String guid) {
        this.guid = guid;
    }

    private String surveyModel;

    @Override
    public String getSurveyModel() {
        return surveyModel;
    }

    @Override
    public void setSurveyModel(String surveyModel) {
        this.surveyModel = surveyModel;
    }

    public Survey(long id, String guid, String surveyModel) {
        this.id = id;
        this.guid = guid;
        this.surveyModel = surveyModel;
    }
}
