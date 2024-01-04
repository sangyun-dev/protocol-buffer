package protobuf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import protobuf.PersonOuterClass;

@RestController
@RequiredArgsConstructor
public class protobufController {

    @GetMapping(path = "/protobuf")
    public PersonOuterClass.Person protocolBufferTest() {
        System.out.println("adsfadsfdsafsad = ");
        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder()
                .setId(123)
                .setName("hanwha")
                .setEmail("hanwha@example.com")
                .build();

        return person;
    }
}
