package com.yakisan.mvvmpattern.viewmodels;

import android.text.TextUtils;
import android.util.Patterns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.yakisan.mvvmpattern.BR;
import com.yakisan.mvvmpattern.model.User;

import org.w3c.dom.Text;

/* Properties:
- Logic islemlerin yapildigi yer. (MVP yapisindaki Presenter'in gorevini ustlenir)
- MVP yapisindaki Presenter View (MainActivity.java) kismina referans tasirken ViewModel yapmaz.
-
*/
public class LoginViewModel extends BaseObservable {
    private User user;

    private String successMessage = "Giriş başarılı";
    private String errorMessage = "Email veya şifre hatalı";

    @Bindable
    private String toastMessage = null;


    public String getToastMessage() {
        return toastMessage;
    }


    //Model, ViewModel aracılığıyla görünümü notifyPropertyChanged() ile güncelleyebilir.
    private void setToastMessage(String toastMessage) {
        this.toastMessage = toastMessage;
        notifyPropertyChanged(BR.toastMessage);
    }


    public void setUserEmail(String email) {
        user.setEmail(email);
        notifyPropertyChanged(BR.userEmail);
    }

    @Bindable
    public String getUserEmail() {
        return user.getEmail();
    }

    @Bindable
    public String getUserPassword() {
        return user.getPassword();
    }

    public void setUserPassword(String password) {
        user.setPassword(password);
        notifyPropertyChanged(BR.userPassword);
    }

    public LoginViewModel() {
        user = new User("","");
    }

    //Login ol butonuna tiklandiginda tasarim deseni kontrol edilir, duruma gore toast gosterilir.
    public void onLoginClicked() {
        if (isInputDataValid())
            setToastMessage(successMessage);
        else
            setToastMessage(errorMessage);
    }

    //Email girisi tasarima uygun ve sifre boyutu 5'ten buyukse true doner.
    public boolean isInputDataValid() {
        boolean durum = getUserEmail().equals("yakisan@gmail.com") && (getUserPassword().length()>5 && getUserPassword().equals("123456"));
        return !TextUtils.isEmpty(getUserEmail()) && Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() && getUserPassword().length() > 5 && durum;
    }
}
