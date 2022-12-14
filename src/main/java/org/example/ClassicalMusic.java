package org.example;

public class ClassicalMusic implements Music {
    public void doMyInit(){
        System.out.println("1-ым сработал метод инициализации и вывелся на печать текст");
    }
    public void doMyDestroy(){
        System.out.println("Выше сработал бин , а сейчас распечатался метот destroy");
    }
    public String getSong() {
        return "9-я Симфония Моцарта";
    }
}
