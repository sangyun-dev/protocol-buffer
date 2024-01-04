package protobuf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import protobuf.Person;

@RestController
@RequiredArgsConstructor
public class JsonController {

    @GetMapping(path = "/json")
    public Person jsonTest() {

        return Person.builder()
                .name("hanwha")
                .id(123)
                .email("hanwha@example.com")
                .build();
    }
}
