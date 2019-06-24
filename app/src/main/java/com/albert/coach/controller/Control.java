package com.albert.coach.controller;

import com.albert.coach.model.Profil;

public final class Control {

    private Profil profil;

    private static Control instance = null;

    /**
     * private constructor
     */
    private Control()
    {
        super();
    }

    /**
     * create an instance
     * @return instance
     */
    public static final Control getInstance()
    {
        if(Control.instance == null)
            Control.instance = new Control();
        return Control.instance;
    }

    /**
     *Create a profil
     * @param weight
     * @param size in cm
     * @param age
     * @param sex 1 for man 0 for woman
     */
    public void createProfil(Integer weight, Integer size, Integer age, Integer sex)
    {
        profil = new Profil(weight,size,age,sex);
    }
}
