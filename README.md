# 🔗 MVVM in Android

🗄️ **Model :** Web servislerinde , veri tabanlarından çekilen verileri temsil etmek için oluşturduğumuz sınıflardır.

🎑 **View :** Kullanıcının etkileşimde bulunduğu önyüzlerin (Activity,Fragment) içerdiği kodların bulunduğu sınıflardır. Bu sınıflarda sayısal işlemler yapılmaz. Bu sınıfların amacı ViewModel’dan istediğimiz verileri Observe (gözlem) etmektir. 

🧠 **ViewModel :** View ile Model’ler arasındaki iletişimi sağlayan sınıflardır. Bu sınıflarda sayısal işlemler gerçekleştirilir.

<p align="center">
  <img width="50%" height="50%" src="https://miro.medium.com/max/960/1*-yY0l4XD3kLcZz0rO1sfRA.png"/>
</p>


## 📱 Proje Tanıtımı

🗄️ **Model :** User -> Kapsülleme

🎑 **View :** MainActivity -> @BindingAdapter({"toastMessage"})

🧠 **ViewModel :** LoginViewModel extends **BaseObservable** -> onLoginClicked(), isInputDataValid()

<p align="left">
  <img width="25%" height="25%" src="https://github.com/yunusemreyakisan/mvvm-android/blob/master/app/Screenshot/MVVM_Login.gif"/>
</p>

## 📝 Referanslar
MVVM : https://rcpyesilkaya.medium.com/nedir-bu-mvvm-8af484655b11  
Data Binding: https://www.mobilhanem.com/android-data-binding-kutuphanesi/
