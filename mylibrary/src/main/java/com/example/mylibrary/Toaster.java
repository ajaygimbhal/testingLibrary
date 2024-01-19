package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;

public class Toaster {
    public static void make(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
    }
}
