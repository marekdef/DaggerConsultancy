package com.example.marekdef.moduleb;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marekdef.interfaces.InternalInjector;
import com.example.marekdef.interfaces.ModuleB;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {
    @Inject
    ModuleB moduleB;

    public FragmentB() {
        // Required empty public constructor
        moduleB = InternalInjector.INTERNAL_INJECTOR.providesModuleB();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = inflater.inflate(R.layout.fragment_b, container, false);

        TextView textView = (TextView) inflate.findViewById(R.id.textViewB);
        textView.setText(moduleB.getMessage());
        return inflate;
    }
}
