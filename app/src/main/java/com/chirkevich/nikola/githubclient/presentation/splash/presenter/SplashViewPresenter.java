package com.chirkevich.nikola.githubclient.presentation.splash.presenter;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.chirkevich.nikola.githubclient.presentation.splash.view.SplashView;

/**
 * Created by Колян on 13.12.2017.
 */

@InjectViewState
public class SplashViewPresenter extends MvpPresenter<SplashView> {
    public SplashViewPresenter() {
        getViewState().showMessage("Hello from presenter");
    }
}
