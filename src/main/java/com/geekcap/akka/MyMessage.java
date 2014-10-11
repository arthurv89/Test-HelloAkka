package com.geekcap.akka;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: shaines
 * Date: 2/12/13
 * Time: 12:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyMessage implements Serializable
{
    private String message;

    public MyMessage(String message)
    {
        this.message = message;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
