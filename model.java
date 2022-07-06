package com.example.sqlitecrud;

public class model
{
  String sys,dias,hr;

    public model(String sys, String dias, String hr) {
        this.sys = sys;
        this.dias = dias;
        this.hr = hr;
    }

    public String getSys() {
        return sys;
    }

    public void setSys(String sys) {
        this.sys = sys;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getHr() {
        return hr;
    }

    public void setHr(String hr) {
        this.hr = hr;
    }
}
