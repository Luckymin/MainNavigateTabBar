# MainNavigateTabBar
可快速实现Tab标签选项功能

![](http://7xnnm7.com1.z0.glb.clouddn.com/2015-11-24%2016_58_00.gif)

##使用
在xml中定义:

```
<com.startsmake.mainnavigatetabbar.widget.MainNavigateTabBar
		xmlns:app="http://schemas.android.com/apk/res-auto"
        android:id="@+id/navigateTabBar"
        android:layout_width="match_parent"
        android:layout_height="50dp"
        android:layout_alignParentBottom="true"
        app:containerId="@id/main_container"
        app:navigateTabSelectedTextColor="@color/colorPrimary"
        app:navigateTabTextColor="@color/tab_text_normal"/>
```

Activity代码

```
public class MainActivity extends AppCompatActivity {

    private MainNavigateTabBar navigateTabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigateTabBar = (MainNavigateTabBar) findViewById(R.id.navigateTabBar);
        //对应xml中的containerId
        navigateTabBar.setFrameLayoutId(R.id.main_container);
        //对应xml中的navigateTabTextColor
        navigateTabBar.setTabTextColor(getResources().getColor(R.color.tab_text_normal));
        //对应xml中的navigateTabSelectedTextColor
        navigateTabBar.setSelectedTabTextColor(getResources().getColor(R.color.colorPrimary));

        //恢复选项状态
        navigateTabBar.onRestoreInstanceState(savedInstanceState);

        navigateTabBar.addTab(HomeFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_tab_bar_home, R.mipmap.ic_tab_bar_mine_selected, R.string.tab_bar_text_home));
        navigateTabBar.addTab(MomentsFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_tab_bar_moments, R.mipmap.ic_tab_bar_moments_selected, R.string.tab_bar_text_moments));
        navigateTabBar.addTab(FindFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_tab_bar_find, R.mipmap.ic_tab_bar_find_selected, R.string.tab_bar_text_find));
        navigateTabBar.addTab(PersonFragment.class, new MainNavigateTabBar.TabParam(R.mipmap.ic_tab_bar_person, R.mipmap.ic_tab_bar_person_selected, R.string.tab_bar_text_person));   
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        //保存当前选中的选项状态
        navigateTabBar.onSaveInstanceState(outState);
    }
}
```

