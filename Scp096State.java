package com.scp096port.entity;

/** Same four states and order as the 1.12.2 EntityShyGuy.ShyGuyState. */
public enum Scp096State {
    SITTING(true), WALKING(true), CRYING(false), RUNNING(false);

    public final boolean passive;
    Scp096State(boolean passive) { this.passive = passive; }
}
