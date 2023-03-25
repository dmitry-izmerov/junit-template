package org.example;

public record MainService(ServiceA serviceA, ServiceB serviceB) {
    public String getText(String param) {
        var num = serviceA.getNum();
        var str = serviceB.getStr(param);
        return num + str;
    }
}
