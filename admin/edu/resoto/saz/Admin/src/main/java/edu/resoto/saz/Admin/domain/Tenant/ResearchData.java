package edu.resoto.saz.Admin.domain.Tenant;

import edu.resoto.saz.Admin.domain.Tenant.gen.ResearchDataGen;
import java.util.Date;

public class ResearchData implements ResearchDataGen {

    public ResearchData() {
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

    private String response;

    @Override
    public String getResponse() {
        return response;
    }

    @Override
    public void setResponse(String response) {
        this.response = response;
    }

    private Date timestamp;

    @Override
    public Date getTimestamp() {
        return timestamp;
    }

    @Override
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public ResearchData(String guid, String response, Date timestamp) {
        this.guid = guid;
        this.response = response;
        this.timestamp = timestamp;
    }
}
