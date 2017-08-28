package microlab.encb.com.microlab.ui.samples;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import microlab.encb.com.microlab.R;
import microlab.encb.com.microlab.contracts.LoginContract;
import microlab.encb.com.microlab.presenters.LoginPresenter;

/**
 * Created by Luis on 28/08/2017.
 */

public class LoginActivity extends AppCompatActivity implements LoginContract.View{

    private LoginPresenter mLoginPresenter;
    @Override
    public void showMainMenu() {

    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mLoginPresenter = new LoginPresenter(this);
    }
}
