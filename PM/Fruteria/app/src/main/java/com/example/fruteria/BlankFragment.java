package com.example.fruteria;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import com.example.fruteria.ui.gallery.GalleryViewModel;

public class BlankFragment extends Fragment {

    private BlankViewModel blankViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        blankViewModel =
                ViewModelProviders.of(this).get(BlankViewModel.class);
        View root = inflater.inflate(R.layout.fragment_blank, container, false);
        return root;
    }
}
