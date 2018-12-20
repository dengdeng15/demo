package com.example.demo.data.entity;

import java.util.Date;

public class FndHghmanager {
    private String personid;

    private String yhmngcode;

    private String managerlevel;

    private Date startdate;

    private Date enddate;

    private String namecn;

    private String fSname;

    private String memo;

    private String chargefield;

    private String createtimestamp;

    private String updatetimestamp;

    private String removetag;

    public String getPersonid() {
        return personid;
    }

    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    public String getYhmngcode() {
        return yhmngcode;
    }

    public void setYhmngcode(String yhmngcode) {
        this.yhmngcode = yhmngcode == null ? null : yhmngcode.trim();
    }

    public String getManagerlevel() {
        return managerlevel;
    }

    public void setManagerlevel(String managerlevel) {
        this.managerlevel = managerlevel == null ? null : managerlevel.trim();
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

    public String getNamecn() {
        return namecn;
    }

    public void setNamecn(String namecn) {
        this.namecn = namecn == null ? null : namecn.trim();
    }

    public String getfSname() {
        return fSname;
    }

    public void setfSname(String fSname) {
        this.fSname = fSname == null ? null : fSname.trim();
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public String getChargefield() {
        return chargefield;
    }

    public void setChargefield(String chargefield) {
        this.chargefield = chargefield == null ? null : chargefield.trim();
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
}