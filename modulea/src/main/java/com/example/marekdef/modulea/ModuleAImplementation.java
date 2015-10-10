package com.example.marekdef.modulea;

import com.example.marekdef.interfaces.ModuleA;

import dagger.Subcomponent;

/**
 * Created by marekdef on 25.09.15.
 */
public class ModuleAImplementation implements ModuleA {
    @Override
    public String getMessage() {
        return "Message from module A";
    }

}
