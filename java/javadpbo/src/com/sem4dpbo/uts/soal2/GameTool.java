package com.sem4dpbo.uts.soal2;

public abstract class GameTool {

    public GameTool(){

    }

    public abstract Boolean isResultEqual(int val);

    public abstract int generateResult();

    public abstract String convertResultToString(int result);
}
