package rxjava.com.mvpdemo.Login;

/**
 * Created by fazal on 5/16/2018.
 */

public class LoginPresenter {

    ILoginView iLoginView;
    LoginInteractor loginInteractor;

    public LoginPresenter(ILoginView iLoginView) {
        this.iLoginView = iLoginView;
        loginInteractor = new LoginInteractor();
    }

    public void attemptLogin(String username, String password){
        boolean isValid = loginInteractor.validCredentials(username, password);

        if (isValid) iLoginView.onLoginSuccess(); else iLoginView.onLoginFailed();

    }
}
