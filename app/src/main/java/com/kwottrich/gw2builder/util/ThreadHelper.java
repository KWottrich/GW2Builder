package com.kwottrich.gw2builder.util;

import java.util.concurrent.Callable;

/**
 * Created by kenny on 10/29/2016.
 */

public final class ThreadHelper {
    public static Object runOnThread(final Callable<? extends Object> func) throws Exception {
        final Object[] result = {null};
        final Exception[] ex = {null};
        new Thread() {
            public void run() {
                try {
                    result[0] = func.call();
                } catch (Exception e) {
                    ex[0] = e;
                }
            }
        }.start();
        if (ex[0] != null) {
            throw ex[0];
        }
        return result[0];
    }
}
