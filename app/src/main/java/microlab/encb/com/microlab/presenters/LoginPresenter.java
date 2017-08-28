package microlab.encb.com.microlab.presenters;

import microlab.encb.com.microlab.contracts.LoginContract;

/**
 * Created by Luis on 28/08/2017.
 */

public class LoginPresenter implements LoginContract.Action{
    final LoginContract.View mView;

    public LoginPresenter(LoginContract.View view) {
        mView = view;
    }

    @Override
    public boolean validEmail() {
        return false;
    }

    @Override
    public boolean validPassword() {
        return false;
    }

    @Override
    public void showLoginError() {

    }
}
