package com.example.marekdef.framework;

import com.example.marekdef.interfaces.AllComponents;
import com.example.marekdef.interfaces.ModuleA;
import com.example.marekdef.interfaces.ModuleB;
import com.example.marekdef.modulea.ModuleAModule;
import com.example.marekdef.moduleb.ModuleBModule;

import dagger.Component;

import static com.example.marekdef.interfaces.InternalInjector.INTERNAL_INJECTOR;

/**
 * Created by marekdef on 27.09.15.
 */
public enum Injector implements AllComponents {
    INJECTOR;

    Injector() {
        INTERNAL_INJECTOR.setRealInjector(this);
    }


    @Override
    public ModuleA providesModuleA() {
        return DaggerInjector_DaggerComponent.create().providesModuleA();
    }

    @Override
    public ModuleB providesModuleB() {
        return DaggerInjector_DaggerComponent.create().providesModuleB();
    }

    @Component(modules = {ModuleAModule.class, ModuleBModule.class}, dependencies = {})
    static interface DaggerComponent extends ModuleA.Component, ModuleB.Component {

    }
}
