package rxjava.com.mvpdemo.Login;

/**
 * Created by fazal on 5/16/2018.
 */

public class LoginInteractor implements ILoginInteractor {

    public LoginInteractor() {
    }

    @Override
    public boolean validCredentials(String username, String password) {
        if (username.contains("@gmail")) return true;
        return false;
    }
}
