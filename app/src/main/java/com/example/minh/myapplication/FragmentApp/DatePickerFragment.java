package com.example.minh.myapplication.FragmentApp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.DatePicker;

import java.util.Calendar;

public class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        Calendar calendar=Calendar.getInstance();
        int iNam=calendar.get(Calendar.YEAR);
        int iThang=calendar.get(Calendar.MONTH);
        int iNgay=calendar.get(Calendar.DAY_OF_MONTH);

        return new DatePickerDialog(getActivity(),this,iNam,iThang,iNgay);
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {


    }
}
