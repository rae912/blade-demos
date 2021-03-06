package com.blade.demo;

import com.blade.Blade;

/**
 * @author biezhi
 * @date 2017/9/28
 */
public class HelloApplication {

    public static void main(String[] args) {
        Blade.me().get("/", (request, response) -> response.text("Hello World"))
                .start(HelloApplication.class, args);
    }

}
