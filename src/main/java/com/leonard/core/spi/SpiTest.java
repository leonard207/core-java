package com.leonard.core.spi;

import java.util.ServiceLoader;

public class SpiTest {

    public static void main(String[] args) {
        ServiceLoader<Command> serviceLoader = ServiceLoader.load(Command.class);
        for (Command command : serviceLoader) {
            command.start();
        }

    }
}
