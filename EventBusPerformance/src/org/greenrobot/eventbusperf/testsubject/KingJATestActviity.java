package org.greenrobot.eventbusperf.testsubject;

import android.app.Activity;
import android.os.Bundle;

import org.greenrobot.eventbus.EventBus;

/**
 * Description:TODO
 * Create Time:2017/4/10 13:39
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class KingJATestActviity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EventBus.getDefault().register(this);
    }
}
