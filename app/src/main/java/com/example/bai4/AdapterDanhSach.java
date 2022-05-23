package com.example.bai4;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdapterDanhSach extends ArrayAdapter<DanhSach> {
    Context context;
    int res;
    ArrayList<DanhSach> listdanhsach;


    public AdapterDanhSach(@NonNull Context context, int resource, @NonNull ArrayList<DanhSach> objects) {
        super(context, resource, objects);
        this.context = context;
        this.res = resource;
        this.listdanhsach = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null)
            convertView= LayoutInflater.from(context).inflate(res,parent,false);
        TextView lop=convertView.findViewById(R.id.lop);
        ImageView logo=convertView.findViewById(R.id.logo);
        TextView ca=convertView.findViewById(R.id.ca);
        ImageButton next=convertView.findViewById(R.id.next);
        DanhSach ds=listdanhsach.get(position);
        int anh=ds.getLogo();
        logo.setImageResource(anh);
        String ten=ds.getLop();
        lop.setText(ten);
        int icon=ds.getNext();
        next.setImageResource(icon);
        String gio= ds.getCa();
        ca.setText(gio);
        return convertView;
    }

}
