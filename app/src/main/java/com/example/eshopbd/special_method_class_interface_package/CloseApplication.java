package com.example.eshopbd.special_method_class_interface_package;



public interface CloseApplication {


    // For activity..

    // You have to add annotation and..  use this below for activity closing.....and you must have to override the below method..
    // finishAffinity();
    // ActivityCompat.finishAffinity(Account .this);
    void onClosing_appActivity();





    //  for Fragments..

    void onClosing_Fragments();

}
