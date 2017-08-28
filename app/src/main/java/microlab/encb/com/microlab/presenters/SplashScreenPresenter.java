package microlab.encb.com.microlab.presenters;
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
        android.os.SystemClock.sleep(2000);
        mView.showMainMenu();
    }
}
