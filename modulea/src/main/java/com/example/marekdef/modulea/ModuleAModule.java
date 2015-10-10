package com.example.marekdef.modulea;

import com.example.marekdef.interfaces.ModuleA;

import dagger.Module;
import dagger.Provides;

/**
 * Created by marekdef on 25.09.15.
 */
@Module
public class ModuleAModule {

    @Provides
    ModuleA provideModuleA() {
        return new ModuleAImplementation();
    }
}
