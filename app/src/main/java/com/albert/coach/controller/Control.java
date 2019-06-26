package com.albert.coach.controller;

import android.content.Context;

import com.albert.coach.model.Profile;
import com.albert.coach.tools.Serializer;

public final class Control {

    private static Profile profil;

    private static String filename="saveprofil";

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
    public void createProfil(Integer weight, Integer size, Integer age, Integer sex, Context context)
    {
        profil = new Profile(weight,size,age,sex);
        Serializer.serialize(filename,profil,context);
    }

    /**
     *Recovery bmi from profil
     * @return Bmi
     */
    public float getBmi()
    {
        return profil.getBmi();
    }

    /**
     * recovery message from profil
     * @return message
     */
    public String getMessage()
    {
        return profil.getMessage();
    }

    private static void recoverySerialize(Context context)
    {
        profil = (Profile)Serializer.deSerialize(filename, context);
    }

}
