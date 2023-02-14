package com.yakisan.mvvmpattern.views;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.yakisan.mvvmpattern.R;
import com.yakisan.mvvmpattern.databinding.ActivityMainBinding;
import com.yakisan.mvvmpattern.viewmodels.LoginViewModel;

/*
MVVM yapisini Android uzerinde baglamak icin iki yol vardır: RxJava ve DataBinding, projede Binding islemini kullanacagiz.
İki Yönlü Veri Bağlama (Data Binding), XML düzenlerindeki nesneleri, düzene veri gönderebilecek şekilde bağlamamıza izin verir ve bunun tersi de geçerlidir.
İki yönlü veri bağlamanın sözdizimi şöyledir: @={variable}
*/
public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewModel(new LoginViewModel()); //Set VM
        binding.executePendingBindings();

    } //eof onCreate()

    @BindingAdapter({"toastMessage"})
    public static void runMe(View view, String message) {
        if (message != null)
            Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show();
    }
}