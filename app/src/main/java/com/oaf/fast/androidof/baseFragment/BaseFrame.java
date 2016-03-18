package com.oaf.fast.androidof.baseFragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.oaf.fast.androidof.baseActivity.IBasic;

/**
 * Created by liukun on 16/3/18.
 */
public abstract class BaseFrame extends android.support.v4.app.Fragment implements IBasic {
    protected View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        int layoutId = getLayoutId();
        if (layoutId != 0) {
            mView = inflater.inflate(layoutId, container, false);
        }
        iniVariable();
        settingViews();
        return mView;
    }

    @Override
    public void onDestroy() {
        // TODO Auto-generated method stub
        super.onDestroy();
    }
}
