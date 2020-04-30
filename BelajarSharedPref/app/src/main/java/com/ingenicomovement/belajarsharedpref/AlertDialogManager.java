package com.ingenicomovement.belajarsharedpref;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

public class AlertDialogManager {


    public void showAlertDialog( Context context, String title,String message, Boolean status ){
        AlertDialog alertDialog = new AlertDialog.Builder(context).create();
        alertDialog.setTitle(title);

        alertDialog.setMessage(message);
        if(status != null)
            alertDialog.setIcon((status) ? R.drawable.ic_done_black_24dp : R.drawable.ic_clear_black_24dp);
        alertDialog.setButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        alertDialog.show();

    }



}
