package com.leonard.core.spi;

public class ShudownCommand implements Command {
    @Override
    public void start() {
        System.out.println("ShudownCommand...");
    }
}
