package com.example.bai4;

import java.util.ArrayList;

public class DanhSach {
    int logo;
    String lop;
    String ca;
    int next;
    public DanhSach(int logo, String lop, String ca, int next) {
        this.logo = logo;
        this.lop = lop;
        this.ca = ca;
        this.next = next;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public int getNext() {
        return next;
    }

    public void setNext(int next) {
        this.next = next;
    }


    public static ArrayList<DanhSach> dulieu() {
        ArrayList<DanhSach> x =new ArrayList<>();
        int logo[]={R.drawable.logocaothang};
        String lop[]={"CĐ ĐTTT 20A","CĐ ĐTTT 20B","CĐ ĐTTT 21A","CĐ ĐTTT 21B","CĐ ĐTTT 20A","CĐ ĐTTT 20B"};
        String ca[]={"ca 1","ca 2","ca 1","ca 2","ca 1","ca 2"};
        int next[]={R.drawable.icnext};
        for(int i=0;i<lop.length;i++)
            x.add(new DanhSach(logo[0],lop[i],ca[i],next[0]));
        return x;
    }
}
