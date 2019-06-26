package com.albert.coach.tools;

import android.content.Context;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public abstract class Serializer {

    /**
     *Serialization an object
     * @param filename
     * @param object
     * @param context
     */
    public static void serialize(String filename, Object object, Context context)
    {

        try
        {
            FileOutputStream file = context.openFileOutput(filename, Context.MODE_PRIVATE);
            ObjectOutputStream oos;
            try
            {
                oos = new ObjectOutputStream(file);
                oos.writeObject(object);
                oos.flush();
                oos.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

}
