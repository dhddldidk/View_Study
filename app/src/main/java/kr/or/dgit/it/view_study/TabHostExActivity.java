package kr.or.dgit.it.view_study;

import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class TabHostExActivity extends AppCompatActivity {
    TabHost host;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_host_ex);
        setTitle(getIntent().getStringExtra("title"));

        host = findViewById(R.id.host);
        host.setup();

        addTabSpec("tab1", R.drawable.tab_icon1, R.id.tab_content1);
        addTabSpec("tab2", R.drawable.tab_icon2, R.id.tab_content2);
        addTabSpec("tab3", R.drawable.tab_icon3, R.id.tab_content3);
    }
        private void addTabSpec(String tag, int indicatorImg,int contentId){
            TabHost.TabSpec spec = host.newTabSpec(tag);
            spec.setIndicator(null,ResourcesCompat.getDrawable(getResources(),indicatorImg,null));
            spec.setContent(contentId);
            host.addTab(spec);
        }
    }

        /*TabHost.TabSpec spec = host.newTabSpec("tab1");
        spec.setIndicator(null, ResourcesCompat.getDrawable(
                getResources(), R.drawable.tab_icon1, null
        ));
        spec.setContent(R.id.tab_content1);
        host.addTab(spec);

        spec = host.newTabSpec("tab2");
        spec.setIndicator(null, ResourcesCompat.getDrawable(
                getResources(), R.drawable.tab_icon2, null
        ));
        spec.setContent(R.id.tab_content2);
        host.addTab(spec);

        spec = host.newTabSpec("tab3");
        spec.setIndicator(null, ResourcesCompat.getDrawable(
                getResources(), R.drawable.tab_icon3, null
        ));
        spec.setContent(R.id.tab_content3);
        host.addTab(spec);
    }*/
