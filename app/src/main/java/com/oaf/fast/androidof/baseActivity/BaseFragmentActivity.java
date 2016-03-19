package com.oaf.fast.androidof.baseActivity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;


/**
 * Created by liukun on 16/3/18.
 */
public abstract class BaseFragmentActivity extends FragmentActivity implements IBasic {
    protected View mView;
        @Override
        protected void onCreate(Bundle arg0) {
            // TODO Auto-generated method stub
            super.onCreate(arg0);
            int layoutId = getLayoutId();
            if (layoutId != 0) {
                mView = LayoutInflater.from(this).inflate(layoutId, null);
            }
            setContentView(mView);
            iniVariable();
            settingViews();
        }
        @Override
        protected void onDestroy() {
            // TODO Auto-generated method stub
            super.onDestroy();
        }

    }
