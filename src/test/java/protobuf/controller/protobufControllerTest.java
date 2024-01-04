package protobuf.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import protobuf.PersonOuterClass;

@SpringBootTest
class protobufControllerTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void getPersonTest() {

        String url = "http://localhost:8080/protobuf";

        ResponseEntity<PersonOuterClass.Person> response = restTemplate.getForEntity(url, PersonOuterClass.Person.class);
        System.out.println("response = " + response);
    }
}