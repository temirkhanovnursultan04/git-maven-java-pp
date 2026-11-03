package kz.nurs.study;

import kz.nurs.study.service.MyService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        MyService myService = new MyService();
        myService.doSomething();
    }
}
