package com.example.marekdef.moduleb;

import com.example.marekdef.interfaces.ModuleA;
import com.example.marekdef.interfaces.ModuleB;

import javax.inject.Inject;

/**
 * Created by marekdef on 25.09.15.
 */
public class ModuleBImplementation implements ModuleB {
    @Inject
    public ModuleBImplementation(final ModuleA moduleA) {
        this.moduleA = moduleA;
    }

    ModuleA moduleA;

    @Override
    public String getMessage() {
        return "Message from ModuleB and " + moduleA.getMessage();
    }
}
