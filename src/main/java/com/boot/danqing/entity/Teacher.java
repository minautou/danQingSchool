package com.boot.danqing.entity;

import java.sql.Timestamp;

public class Teacher {

    private int id;
    private Timestamp jointime;
    private String teacherid;
    private String teachername;
    private String teachernickname;
    private String sex;
    private String idcard;
    private String address;
    private String degree;
    private String graduateschool;
    private int isfulltime;
    private int iseffect;
    private Timestamp graduatetime;
    private Timestamp createtime;
    private Timestamp modifytime;

    public Timestamp getJointime() {
        return jointime;
    }

    public void setJointime(Timestamp jointime) {
        this.jointime = jointime;
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getTeachernickname() {
        return teachernickname;
    }

    public void setTeachernickname(String teachernickname) {
        this.teachernickname = teachernickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getGraduateschool() {
        return graduateschool;
    }

    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool;
    }

    public int getIsfulltime() {
        return isfulltime;
    }

    public void setIsfulltime(int isfulltime) {
        this.isfulltime = isfulltime;
    }

    public int getIseffect() {
        return iseffect;
    }

    public void setIseffect(int iseffect) {
        this.iseffect = iseffect;
    }

    public Timestamp getGraduatetime() {
        return graduatetime;
    }

    public void setGraduatetime(Timestamp graduatetime) {
        this.graduatetime = graduatetime;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public Timestamp getModifytime() {
        return modifytime;
    }

    public void setModifytime(Timestamp modifytime) {
        this.modifytime = modifytime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", jointime=" + jointime +
                ", teacherid='" + teacherid + '\'' +
                ", teachername='" + teachername + '\'' +
                ", teachernickname='" + teachernickname + '\'' +
                ", sex='" + sex + '\'' +
                ", idcard='" + idcard + '\'' +
                ", address='" + address + '\'' +
                ", degree='" + degree + '\'' +
                ", graduateschool='" + graduateschool + '\'' +
                ", isfulltime=" + isfulltime +
                ", iseffect=" + iseffect +
                ", graduatetime=" + graduatetime +
                ", createtime=" + createtime +
                ", modifytime=" + modifytime +
                '}';
    }
}
