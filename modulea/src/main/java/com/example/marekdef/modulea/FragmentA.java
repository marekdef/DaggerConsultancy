package com.example.marekdef.modulea;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marekdef.interfaces.InternalInjector;
import com.example.marekdef.interfaces.ModuleA;

import javax.inject.Inject;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentA extends Fragment {
    @Inject
    ModuleA moduleA;


    public FragmentA() {
        // Required empty public constructor
        moduleA = InternalInjector.INTERNAL_INJECTOR.providesModuleA();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = (View) inflater.inflate(R.layout.fragment_a, container, false);
        TextView textView = (TextView) inflate.findViewById(R.id.textViewA);
        textView.setText(moduleA.getMessage());
        return inflate;
    }
}
