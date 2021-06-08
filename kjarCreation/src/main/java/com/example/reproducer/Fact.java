package com.example.reproducer;

import java.math.BigDecimal;
import java.util.List;


public class Fact {
    private BigDecimal bd;
    private String str;

    public Fact() { }

    public Fact(BigDecimal bd, String str) {
        this.bd = bd;
	this.str = str;
    }

    public BigDecimal getBd() {
        return bd;
    }

    public void setBd(BigDecimal bd) {
        this.bd = bd;
    }

    public BigDecimal getData() {
        return getBd();
    }

    public void setData(BigDecimal bd) {
        setBd(bd);
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String get文字列() {
        return getStr();
    }

    public void set文字列(String str) {
        setStr(str);
    }

    public String getText() {
        return getStr();
    }

    public void setText(String str) {
        setStr(str);
    }

    public static BigDecimal str2bd(String str){
	    return new BigDecimal(str);
    }
    public String toString() {
	return "Fact [bd=" + bd + ", str="+str+"]";
    }


}
