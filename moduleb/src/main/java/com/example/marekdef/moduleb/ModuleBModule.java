package com.example.marekdef.moduleb;

import com.example.marekdef.interfaces.ModuleB;

import dagger.Module;
import dagger.Provides;

/**
 * Created by marekdef on 25.09.15.
 */
@Module
public class ModuleBModule {
    @Provides
    ModuleB providesModuleB(ModuleBImplementation moduleB) {
        return moduleB;
    }
}
