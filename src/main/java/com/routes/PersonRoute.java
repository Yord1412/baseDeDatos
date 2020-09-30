/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.routes;

import com.google.gson.Gson;

import com.controller.PersonController;
import static spark.Spark.*;
/**
 *
 * @author jsme4
 */
public class PersonRoute {
    public PersonRoute(){
        Gson gson = new Gson();
        /*
        PersonController personController = new PersonController();
        get("/person", (req, res) -> personController.index(),gson::toJson);
        //get("/person", (req, res) -> personControler.index(),gson:ToJson);
        //get("/person", (req),res) -> personControler.index(),gson::toJson);
        get("/person/:id", "application/json",(req, res)-> {
            int id = Integer.parseInt(req.params(":id"));
            return personController.show(id);
        }, gson::toJson);
        */
        PersonController personController = new PersonController();
        get("/person", (req, res) -> {
            if(req.queryParams().size() > 0){
                if(req.queryParams("email") != null) {   
                    String email = req.queryParams("email");
                    return personController.showByEmail(email);
                } else
                    return null;
            } else
                return personController.index();
        },gson::toJson);
        get("/person/:id", "application/json",(req, res)-> {
            int id = Integer.parseInt(req.params(":id"));
            return personController.show(id);
        }, gson::toJson);
        
    }
}