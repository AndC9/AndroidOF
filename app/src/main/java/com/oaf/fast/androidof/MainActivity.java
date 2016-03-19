package com.oaf.fast.androidof;
import android.widget.TextView;
import com.oaf.fast.androidof.baseActivity.BaseFragmentActivity;


/**
 * Created by liukun on 16/3/18.
 */
public class MainActivity extends BaseFragmentActivity{

    private TextView t_name;
    @Override
    public int getLayoutId() {
        return R.layout.mian;
    }

    @Override
    public void iniVariable() {

    }

    @Override
    public void settingViews() {
        t_name=(TextView)findViewById(R.id.name);
    }
}
