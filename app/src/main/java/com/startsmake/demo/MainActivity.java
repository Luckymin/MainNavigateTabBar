package com.startsmake.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.startsmake.demo.fragment.FindFragment;
import com.startsmake.demo.fragment.HomeFragment;
import com.startsmake.demo.fragment.MomentsFragment;
import com.startsmake.demo.fragment.PersonFragment;
import com.startsmake.mainnavigatetabbar.widget.MainNavigateTabBar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainNavigateTabBar navigateTabBar = (MainNavigateTabBar) findViewById(R.id.navigateTabBar);

        navigateTabBar.onRestoreInstanceState(savedInstanceState);
        navigateTabBar.setFrameLayoutId(R.id.main_container);
        navigateTabBar.addTab(HomeFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_tab_bar_home, R.mipmap.ic_tab_bar_mine_selected, R.string.tab_bar_text_home));
        navigateTabBar.addTab(MomentsFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_tab_bar_moments, R.mipmap.ic_tab_bar_moments_selected, R.string.tab_bar_text_moments));
        navigateTabBar.addTab(FindFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_tab_bar_find, R.mipmap.ic_tab_bar_find_selected, R.string.tab_bar_text_find));
        navigateTabBar.addTab(PersonFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_tab_bar_person, R.mipmap.ic_tab_bar_person_selected, R.string.tab_bar_text_person));
    }
}
