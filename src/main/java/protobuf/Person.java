package protobuf;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class Person {

    private int id;
    private String name;
    private String email;

}
