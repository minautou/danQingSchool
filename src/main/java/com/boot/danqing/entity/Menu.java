package com.boot.danqing.entity;

import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

public class Menu {

    private Integer id;
    private String menuid;
    private String menuname;
    private String parentmenuid;
    private String menuurl;
    private String iseffect;
    private Timestamp createtime;
    private Timestamp modifytime;

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    private List<Menu> menuList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMenuid() {
        return menuid;
    }

    public void setMenuid(String menuid) {
        this.menuid = menuid;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getParentmenuid() {
        return parentmenuid;
    }

    public void setParentmenuid(String parentmenuid) {
        this.parentmenuid = parentmenuid;
    }

    public String getMenuurl() {
        return menuurl;
    }

    public void setMenuurl(String menuurl) {
        this.menuurl = menuurl;
    }

    public String getIseffect() {
        return iseffect;
    }

    public void setIseffect(String iseffect) {
        this.iseffect = iseffect;
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

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", menuid='" + menuid + '\'' +
                ", menuname='" + menuname + '\'' +
                ", parentmenuid='" + parentmenuid + '\'' +
                ", menuurl='" + menuurl + '\'' +
                ", iseffect='" + iseffect + '\'' +
                ", createtime=" + createtime +
                ", modifytime=" + modifytime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Menu menu = (Menu) o;
        return Objects.equals(id, menu.id) &&
                Objects.equals(menuid, menu.menuid) &&
                Objects.equals(menuname, menu.menuname) &&
                Objects.equals(parentmenuid, menu.parentmenuid) &&
                Objects.equals(menuurl, menu.menuurl) &&
                Objects.equals(iseffect, menu.iseffect) &&
                Objects.equals(createtime, menu.createtime) &&
                Objects.equals(modifytime, menu.modifytime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, menuid, menuname, parentmenuid, menuurl, iseffect, createtime, modifytime);
    }
}
