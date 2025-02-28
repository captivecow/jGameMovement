package io.github.captivecow;

import io.javalin.Javalin;
import io.javalin.http.staticfiles.Location;

public class JGameMovement
{
    public static void main( String[] args ) {
        Javalin webServer = Javalin.create(config -> {
            config.staticFiles.add("/public", Location.CLASSPATH);
        }).start(8080);
    }
}
