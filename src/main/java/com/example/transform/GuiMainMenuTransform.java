package com.example.transform;

import net.lenni0451.classtransform.InjectionCallback;
import net.lenni0451.classtransform.annotations.CTarget;
import net.lenni0451.classtransform.annotations.CTransformer;
import net.lenni0451.classtransform.annotations.injection.CInject;
import net.minecraft.src.GuiMainMenu;

@CTransformer(GuiMainMenu.class)
public class GuiMainMenuTransform {

    @CInject(method = {"initGui"}, target = @CTarget("HEAD"))
    public void onInitGui(InjectionCallback callback) {
        System.out.println("This is the main menu!");
    }
}
