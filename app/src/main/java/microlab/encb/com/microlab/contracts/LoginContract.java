package microlab.encb.com.microlab.contracts;

/**
 * Created by Luis on 28/08/2017.
 */

public class LoginContract {

    public interface View {
        void showMainMenu();
    }

    public interface Action {
        boolean validEmail();
        boolean validPassword();
        void showLoginError();
    }

    public interface Repository {

    }
}
