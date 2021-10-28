package com.fluffy.setdatewindows;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.now();
        short hour = 18;
        short minute = 45;
        WindowsSetDateTime windowsSetDateTime = new WindowsSetDateTime();
        windowsSetDateTime.SetLocalTime(
                (short)ldt.getYear(),
                (short)ldt.getMonth().getValue(),
                (short) ldt.getDayOfMonth(),
                hour,
                minute,
                (short) 0);
    }

}
