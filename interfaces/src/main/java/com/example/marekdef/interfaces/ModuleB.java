package com.example.marekdef.interfaces;

/**
 * Created by marekdef on 25.09.15.
 */
public interface ModuleB {
    String getMessage();

    interface Component {
        ModuleB providesModuleB();
    }
}
