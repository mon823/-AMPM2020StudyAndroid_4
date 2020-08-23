package com.example.project816.ui.make;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class makeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public makeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is make fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}