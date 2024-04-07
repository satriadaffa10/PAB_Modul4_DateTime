package com.example.pab_modul4_time;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import java.util.Calendar;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText tanggal, waktu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanggal = (EditText) findViewById(R.id.tanggal);
        waktu = (EditText) findViewById(R.id.waktu);
    }
    public void setTanggal(View v) { final Calendar
            c = Calendar.getInstance();
        int thn = c.get(Calendar.YEAR);
        int bln = c.get(Calendar.MONTH);
        int tgl = c.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, new
                DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int thn, int bln, int tgl) {
                        tanggal.setText(thn + "/" + (bln+ 1) + "/" + tgl);
                    }
                }, thn, bln, tgl); datePickerDialog.show();
    }
    public void setWaktu(View v) {
        final Calendar c = Calendar.getInstance();
        int jam = c.get(Calendar.HOUR_OF_DAY);
        int menit = c.get(Calendar.MINUTE);
        TimePickerDialog timePickerDialog = new TimePickerDialog(MainActivity.this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int jam, int menit) {
                        waktu.setText(jam + ":" + menit);
                    }
                }, jam, menit, true);
        timePickerDialog.show();
    }
}