package microlab.encb.com.microlab.presenters;
import android.os.Handler;

import microlab.encb.com.microlab.contracts.SplashScreenContract;

/**
 * Created by Gerardo on 28/08/2017.
 */

public class SplashScreenPresenter implements SplashScreenContract.Action  {

    public final SplashScreenContract.View mView;

    public SplashScreenPresenter(SplashScreenContract.View mView) {
        this.mView = mView;
    }

    @Override
    public void delayProcess() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mView.showLogin();
                mView.clearView();
            }
        },2000);
    }
}
