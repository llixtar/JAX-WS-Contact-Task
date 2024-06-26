package org.example.server.utils;

import org.example.server.service.DataServicePublisher;

import java.util.Scanner;

public class ServerRunner {

    private static final Scanner scanner = new Scanner(System.in);
    private final static String STOP_SERVER_KEY = "exit";

    public void runServer() {
        onPublish();
        stopServer(startServer());
    }

    private void onPublish() {
        new DataServicePublisher().publish();
    }

    private String startServer() {
        System.out.print(">> Server has been started.\n" +
                "To stop the Server, input '" + STOP_SERVER_KEY + "': ");
        return scanner.nextLine().trim();
    }

    private void stopServer(String input) {
        while (!input.equals("exit")) {
            System.out.print(">> Server is working." +
                    "\nTo stop the Server, input '" + STOP_SERVER_KEY + "': ");
            input = scanner.nextLine().trim();
        }
        System.out.println(">> Server has been stopped.");
        scanner.close();
        System.exit(0);
    }
}
