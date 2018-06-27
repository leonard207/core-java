package com.leonard.core.spi;

public class StartCommand implements Command {
    @Override
    public void start() {
        System.out.println("StartCommand...");
    }
}
