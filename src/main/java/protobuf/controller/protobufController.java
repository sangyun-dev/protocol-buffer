package protobuf.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import protobuf.proto.PersonOuterClass;

import java.util.Arrays;

@RestController
@RequiredArgsConstructor
public class protobufController {

    @GetMapping(path = "/protobuf")
    public byte[] protocolBufferTest() {

        PersonOuterClass.Person person = PersonOuterClass.Person.newBuilder()
                .setId(123)
                .setName("hanwha")
                .setEmail("hanwha@example.com")
                .build();

        System.out.println("Person.toByteArray() = " + Arrays.toString(person.toByteArray()));

        return person.toByteArray();
    }
}
