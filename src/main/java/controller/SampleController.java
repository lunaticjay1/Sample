package controller;

import service.SampleService;

public class SampleController {

    public void getSample(){
        SampleService sampleService = new SampleService();
        System.out.println(sampleService.s);
    }
}
