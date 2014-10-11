package com.geekcap.akka;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import akka.actor.UntypedActor;

/**
 * Created with IntelliJ IDEA.
 * User: shaines
 * Date: 2/12/13
 * Time: 1:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyActor extends UntypedActor
{
    public void onReceive(Object message)
    {
        if( message instanceof MyMessage )
        {
            System.out.println( "My message is: " + ( ( MyMessage )message ).getMessage() );
        }
    }

    public static void main( String[] args )
    {
        ActorSystem actorSystem = ActorSystem.create( "MySystem" );
        ActorRef actorRef = actorSystem.actorOf( new Props( MyActor.class ), "myActor" );
        actorRef.tell( new MyMessage( "Hello, Akka!" ) );


    }
}
