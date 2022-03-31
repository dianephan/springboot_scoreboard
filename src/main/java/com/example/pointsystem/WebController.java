package com.example.pointsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
    private final PointModelRepository pointModel;

    @Autowired
    public WebController(PointModelRepository pointModel) {
        this.pointModel = pointModel;
        System.out.println("yay point system");
    }
    @GetMapping("/")
    public String helloWorld() {
        return "jfkldsafjls";
    }

    @GetMapping("/display")
    public Iterable<PointModel> DisplayTable() { return pointModel.findAll(); }

    @GetMapping("/add")
    public void addEntry() {
        PointModel pointModelObject = new PointModel(10);;
        pointModel.save(pointModelObject);
        return;
    }
}

// look at other models on the repo (findByID, save, query, etc available for pointModel)
// keep db record of sms you received
// look up someones name by phone #