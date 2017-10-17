package com.shibuyaxpress.citasmedicasapp.activities;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.shibuyaxpress.citasmedicasapp.R;
import com.shibuyaxpress.citasmedicasapp.activities.SampleSlide;

public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        addSlide(SampleSlide.newInstance(R.layout.slider_1));
        addSlide(SampleSlide.newInstance(R.layout.slider_2));
        addSlide(SampleSlide.newInstance(R.layout.slider_3));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent launcher=new Intent(this,LoginActivity.class);
        startActivity(launcher);
        finish();
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
    }
}
