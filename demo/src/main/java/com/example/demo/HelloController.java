/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo;

/**
 *
 * @author narve
 */
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("ahmet")//hangi kapıyla çağrıldığında hangi method çalışacak
    public String method2() {
        return "Ahmet'den Merhaba!";
    }

    @RestController
    @RequestMapping("/toplam")
    public class demo {
        @CrossOrigin("*")
        @PostMapping("/toplam")
        @ResponseBody
        public int createProduct(@RequestBody PostParamSearch sayi) {
            int sonuc = sayi.getSayi1() + sayi.getSayi2();
            return sonuc;
        }
    }
    

    @PostMapping(value = "hesapla5", consumes={"application/json"})
    public int UniversityYayinYeri(@RequestBody PostParamSearch param) {
        int sonuc = 0;
        try {
            int gelen_sonuc = hesaplametod(param.getSayi1(), param.getSayi2());
            sonuc = gelen_sonuc;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return sonuc;
    }

    public int hesaplametod(int a1, int a2) {
        return (int) Math.pow(a1, a2);
    }

}
