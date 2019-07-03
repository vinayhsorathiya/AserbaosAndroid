package com.aserbao.aserbaosandroid.aaThird.dagger2.di.components;

import com.aserbao.aserbaosandroid.aaThird.dagger2.DaggerActivity;
import com.aserbao.aserbaosandroid.aaThird.dagger2.beans.Maker;
import com.aserbao.aserbaosandroid.aaThird.dagger2.beans.Wheel;
import com.aserbao.aserbaosandroid.aaThird.dagger2.di.modules.CarModule;
import com.aserbao.aserbaosandroid.aaThird.dagger2.di.modules.SubModule;

import dagger.Component;

/**
 * 功能:
 *
 * @author aserbao
 * @date : On 2019/5/29 8:34 PM
 * @project:AserbaosAndroid
 * @package:com.aserbao.aserbaosandroid.aaThird.dagger2.di.components
 */
@Component(modules = CarModule.class)
public  interface CarComponent {

       SubComponent.Builder requestComponentBuilder();

//     Wheel provideWheel();
//    void inject(DaggerActivity daggerActivity);

//    SubComponent getSubComponent(SubModule subModule);
}