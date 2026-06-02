Utility.java
public class Utility {

    public static void greet() {

        System.out.println(
            "Hello from Utility"
        );
    }
}
module-info.java (com.greetings)
module com.greetings {

    requires com.utils;
}
Main.java
package com.greetings;

import com.utils.Utility;

public class Main {

    public static void main(String[] args) {

        Utility.greet();
    }
}
Program 35: TCP Client-Server Chat
Server.java
import java.net.*;
import java.io.*;

public class Server {

    public static void main(String[] args)
            throws Exception {

        ServerSocket ss =
            new ServerSocket(5000);

        System.out.println(
            "Waiting..."
        );

        Socket s = ss.accept();

        DataInputStream dis =
            new DataInputStream(
                s.getInputStream()
            );

        String msg =
            dis.readUTF();

        System.out.println(
            "Client: " + msg
        );

        ss.close();
    }
}
Client.java
import java.net.*;
import java.io.*;

public class Client {

    public static void main(String[] args)
            throws Exception {

        Socket s =
            new Socket(
                "localhost",
                5000
            );

        DataOutputStream dos =
            new DataOutputStream(
                s.getOutputStream()
            );

        dos.writeUTF(
            "Hello Server"
        );

        s.close();
    }
}
