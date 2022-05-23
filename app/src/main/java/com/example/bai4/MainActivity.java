package com.example.bai4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listdanhsach;
    ArrayList<DanhSach> danhsach;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("LỊCH HỌC");
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeAsUpIndicator(R.drawable.icmn);
        listdanhsach=findViewById(R.id.listview);
        danhsach=DanhSach.dulieu();
        AdapterDanhSach adapterDanhSach=new AdapterDanhSach(MainActivity.this,R.layout.item,danhsach);
        listdanhsach.setAdapter(adapterDanhSach);
        }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                //onBackPressed();
                Toast.makeText(this, "Bạn vừa bấm menu", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu1:
                //code xử lý khi bấm menu1
                openActivity1();
                break;
            case R.id.menu2:
                //code xử lý khi bấm menu2
                openActivity2();
                break;
            default:break;
        }

        return super.onOptionsItemSelected(item);
    }
    private void openActivity1() {
        intent = new Intent(this, Main1Activity.class);
        startActivity(intent);
    }

    private void openActivity2() {
        intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

}
