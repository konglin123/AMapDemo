package com.example.a12902.amapdemo.ui;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.a12902.amapdemo.R;

public class ScreenActivity extends AppCompatActivity {

    private Dialog dialog;
    private View inflate;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen);
        initListener();
    }

    private void initListener() {
        findViewById(R.id.search_icon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showScreenDialog();
            }
        });
        findViewById(R.id.title).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ScreenActivity.this,"农田小鬼",Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showScreenDialog() {
        dialog = new Dialog(this, R.style.ActionSheetDialogStyle);
        inflate = LayoutInflater.from(this).inflate(R.layout.dialog_layout, null);
//        choosePhoto = inflate.findViewById(R.id.choosePhoto);
//        takePhoto = inflate.findViewById(R.id.takePhoto);
//        choosePhoto.setOnClickListener(this);
//        takePhoto.setOnClickListener(this);
        dialog.setContentView(inflate);
        Window dialogWindow = dialog.getWindow();
        dialogWindow.setGravity(Gravity.TOP);
        WindowManager.LayoutParams attributes = dialogWindow.getAttributes();
        attributes.width=this.getWindowManager().getDefaultDisplay().getWidth();
        attributes.y = 120;
        dialogWindow.setAttributes(attributes);
        dialog.show();
    }

    public static int getStatusBarHeight(Context context) {
        int result = 0;
        int resId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resId > 0) {
            result = context.getResources().getDimensionPixelOffset(resId);
        }
        return result;
    }
}
