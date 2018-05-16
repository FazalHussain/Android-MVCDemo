package rxjava.com.mvpdemo.Login;

/**
 * Created by fazal on 5/16/2018.
 */

public interface ILoginInteractor {
    boolean validCredentials(String username, String password);
}
