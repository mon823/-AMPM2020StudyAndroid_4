package com.example.project816.ui.make;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.project816.R;

public class makeFragment extends Fragment {

    private makeViewModel makeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        makeViewModel =
                ViewModelProviders.of(this).get(makeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_make, container, false);
        final TextView textView = root.findViewById(R.id.textMake);
        makeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
