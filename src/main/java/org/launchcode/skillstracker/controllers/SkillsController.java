package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller


public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String welcome(){


        return "<html>" +
                "<body>" +
                "<h1>Skills tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>JS</li>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "</ol>" +
                "</body>" +
                "</html>";








    }
@GetMapping (value="form")
@ResponseBody
    public String displayForm(){
        return   "<html>" +
                "<body>" +
                "<form action = '/form' method = 'post'>" +
                "<label for='name'>Name:</label>" +
                "<br>" +
                "<input type = 'text' name = 'name' />" +
                "<br>" +
                "<label for='lang'>Select 1st favorite language</label>" +
                "<select name='lang' id='lang'>" +
                "<option value='Java'> Java </option>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Python'> Python </option>" +
                "</select>" +
                "<br>" +

                "<label for='lang02'>Select 2nd favorite language</label>" +
                "<select name='lang02' id='lang02'>" +
                "<option value='Java'> Java </option>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Python'> Python </option>" +
                "</select>" +
                "<br>" +

                "<label for='lang03'>Select 3rd favorite language</label>" +
                "<select name='lang03' id='lang03'>" +
                "<option value='Java'> Java </option>" +
                "<option value='JavaScript'> JavaScript </option>" +
                "<option value='Python'> Python </option>" +
                "</select>" +
                "<input type='submit'/>" +
                "</form<" +
                "</body>" +
                "</html>";

    }
    @RequestMapping(value="form", method=RequestMethod.POST)
    @ResponseBody
    public String sentForm(@RequestParam String name,
                           @RequestParam String lang,
                           @RequestParam String lang02,
                           @RequestParam String lang03
    ){
        if(name == ""){
            name = "guess";
        }
        return "<html>" +
                "<h1>" + name + "</h1>" +
                "<ol>" +
                "<li>" + lang + "</li>" +
                "<li>" + lang02 + "</li>" +
                "<li>" + lang03 + "</li>" +
                "</ol>" +
                "</body>" +
                "</html>";


    }




}
