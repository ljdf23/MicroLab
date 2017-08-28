package microlab.encb.com.microlab.ui.samples;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import microlab.encb.com.microlab.MainActivity;
import microlab.encb.com.microlab.R;
import microlab.encb.com.microlab.contracts.SplashScreenContract;
import microlab.encb.com.microlab.presenters.SplashScreenPresenter;

/**
 * Created by Luis on 22/08/2017.
 */

public class SplashScreen extends AppCompatActivity implements SplashScreenContract.View{

    private SplashScreenPresenter splashScreenPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        splashScreenPresenter = new SplashScreenPresenter(this);
        splashScreenPresenter.delayProcess();
    }

    @Override
    public void showMainMenu() {
        startActivity(new Intent(this, MainActivity.class));
    }
}
