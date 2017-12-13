package com.chirkevich.nikola.githubclient.presentation.splash.view;

import android.os.Bundle;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.chirkevich.nikola.githubclient.R;
import com.chirkevich.nikola.githubclient.presentation.splash.presenter.SplashViewPresenter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Колян on 13.12.2017.
 */

public class SplashViewActivity extends MvpAppCompatActivity implements SplashView{

    @InjectPresenter
    SplashViewPresenter splashViewPresenter;

    @BindView(R.id.splash_activity_info_message_text_view)
    TextView infoMessageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splah_activity);
        ButterKnife.bind(this);

    }

    @Override
    public void showLoginActivity() {

    }

    @Override
    public void showMainActivity() {

    }

    @Override
    public void showMessage(String message) {

        infoMessageView.setText(message);
    }
}
