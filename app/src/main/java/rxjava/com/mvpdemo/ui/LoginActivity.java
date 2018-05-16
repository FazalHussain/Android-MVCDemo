package rxjava.com.mvpdemo.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import rxjava.com.mvpdemo.Login.ILoginView;
import rxjava.com.mvpdemo.Login.LoginPresenter;
import rxjava.com.mvpdemo.R;

public class LoginActivity extends AppCompatActivity implements ILoginView {

    LoginPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new LoginPresenter(this);

        presenter.attemptLogin("fazalcs13@.com", "Cds123#");

    }

    @Override
    public void onLoginSuccess() {
        Log.d("status", "Login Success");
    }

    @Override
    public void onLoginFailed() {
        Log.d("status", "Login failed");
    }
}
