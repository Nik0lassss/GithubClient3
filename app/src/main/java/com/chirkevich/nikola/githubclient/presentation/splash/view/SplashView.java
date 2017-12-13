package com.chirkevich.nikola.githubclient.presentation.splash.view;

import com.arellomobile.mvp.MvpView;

/**
 * Created by Колян on 13.12.2017.
 */

public interface SplashView extends MvpView {

    void showLoginActivity();

    void showMainActivity();

    void showMessage(String message);
}
