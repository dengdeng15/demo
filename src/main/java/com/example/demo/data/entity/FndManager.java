package com.example.demo.data.entity;

import java.util.Date;

public class FndManager {
    private String personid;

    private String yhcode;

    private String fundcode;

    private String positontype;

    private Date startdate;

    private Date enddate;

    private Date pubdate;

    private String createtimestamp;

    private String updatetimestamp;

    private String removetag;

    private String fundgroup;

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public String getYhcode() {
        return yhcode;
    }

    public void setYhcode(String yhcode) {
        this.yhcode = yhcode == null ? null : yhcode.trim();
    }

    public String getFundcode() {
        return fundcode;
    }

    public void setFundcode(String fundcode) {
        this.fundcode = fundcode == null ? null : fundcode.trim();
    }

    public String getPositontype() {
        return positontype;
    }

    public void setPositontype(String positontype) {
        this.positontype = positontype == null ? null : positontype.trim();
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Date getPubdate() {
        return pubdate;
    }

    public void setPubdate(Date pubdate) {
        this.pubdate = pubdate;
    }

    public String getCreatetimestamp() {
        return createtimestamp;
    }

    public void setCreatetimestamp(String createtimestamp) {
        this.createtimestamp = createtimestamp == null ? null : createtimestamp.trim();
    }

    public String getUpdatetimestamp() {
        return updatetimestamp;
    }

    public void setUpdatetimestamp(String updatetimestamp) {
        this.updatetimestamp = updatetimestamp == null ? null : updatetimestamp.trim();
    }

    public String getRemovetag() {
        return removetag;
    }

    public void setRemovetag(String removetag) {
        this.removetag = removetag == null ? null : removetag.trim();
    }

    public String getFundgroup() {
        return fundgroup;
    }

    public void setFundgroup(String fundgroup) {
        this.fundgroup = fundgroup == null ? null : fundgroup.trim();
    }
}