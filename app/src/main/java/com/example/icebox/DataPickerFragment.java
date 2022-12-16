package com.example.icebox;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;

import java.util.Calendar;


public class DataPickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener
{
    //设置对话框方法
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final Calendar c = Calendar.getInstance();   //調用getInstance
        int year = c.get(Calendar.YEAR);    // 得到年
        int month = c.get(Calendar.MONTH);   //月
        int day = c.get(Calendar.DAY_OF_MONTH);   //日
        return new DatePickerDialog(getActivity(),this,year,month,day);
    }
    // 设置onDateSet方法  年，月，日
    @Override
    public void onDateSet(DatePicker view, int year, int month, int day)
    {
//        Fragment_Home_Page home_page=(Fragment_Home_Page) getActivity();
//        home_page.processDatePickerResult(year, month, day);    // 傳入
    }
}