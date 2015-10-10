package com.example.marekdef.interfaces;

/**
 * Created by marekdef on 27.09.15.
 */
public enum InternalInjector implements AllComponents{
    INTERNAL_INJECTOR;

    private AllComponents realComponent;

    public ModuleA providesModuleA() {
        return realComponent.providesModuleA();
    }

    public ModuleB providesModuleB() {
        return realComponent.providesModuleB();
    }

    public void setRealInjector(AllComponents injector) {
        realComponent = injector;
    }
}
