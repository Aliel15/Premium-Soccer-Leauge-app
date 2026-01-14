package com.pl.premier_zone.player;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="player_stats")
public class Player {
    @Id
    @Column(name="name",unique = true)
    private String name;
    private String nation;
    private String pos;
    private Integer age;
    private String mp;
    private Integer starts;
    private double min;
    private double gls;
    private double ast;
    private double crdy;
    private double crdr;
    private double xg;
    private double xgr;
    private String team;

    public Player() {
    }

    public Player(String name,
                  String nation,
                  String pos,
                  Integer age,
                  String mp,
                  Integer starts,
                  double min,
                  double gls,
                  double ast,
                  double crdy,
                  double crdr,
                  double xg,
                  double xgr,
                  String team) {
        this.name = name;
        this.nation = nation;
        this.pos = pos;
        this.age = age;
        this.mp = mp;
        this.starts = starts;
        this.min = min;
        this.gls = gls;
        this.ast = ast;
        this.crdy = crdy;
        this.crdr = crdr;
        this.xg = xg;
        this.xgr = xgr;
        this.team = team;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getMp() {
        return mp;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getGls() {
        return gls;
    }

    public void setGls(double gls) {
        this.gls = gls;
    }

    public double getAst() {
        return ast;
    }

    public void setAst(double ast) {
        this.ast = ast;
    }

    public double getCrdy() {
        return crdy;
    }

    public void setCrdy(double crdy) {
        this.crdy = crdy;
    }

    public double getCrdr() {
        return crdr;
    }

    public void setCrdr(double crdr) {
        this.crdr = crdr;
    }

    public double getXg() {
        return xg;
    }

    public void setXg(double xg) {
        this.xg = xg;
    }

    public double getXgr() {
        return xgr;
    }

    public void setXgr(double xgr) {
        this.xgr = xgr;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}
