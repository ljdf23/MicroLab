package microlab.encb.com.microlab.contracts;

/**
 * Created by Gerardo on 28/08/2017.
 */

public class SplashScreenContract {

    public static interface View {
        void showMainMenu();
        void showLogin();
        void clearView();
    }


    public static interface Action {
        void delayProcess();
    }


    public static interface Repository {
    }
}
