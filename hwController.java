package com.example.homework1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RestController
public class hwController {

    @GetMapping("/phrases")

    public String phrases() {
        Random rn = new Random();
        List<String> phrases = new ArrayList<>();
        phrases.add("Жизнь - это то, что происходит с нами, когда мы заняты планированием других вещей");
        phrases.add("Будьте изменением, которое вы хотели бы видеть в мире");
        phrases.add("Человек не является ничем большим, чем тем, что он делает из себя");
        phrases.add("Успех - это способность проходить от неудачи к неудаче, не теряя энтузиазма");
        phrases.add("Счастье не заключается в наличии всего, а в том, чтобы находить радость в каждом моменте");
        phrases.add("Самая большая слабость в жизни - это отступление. Единственный способ справиться с жизнью - это бороться, никогда не отступая");
        phrases.add("Если вы хотите жить жизнью, наполненной радостью, освободитесь от гнева, обид и ревности");
        phrases.add("Не стоит сравнивать свою жизнь с жизнью других. Мы все находимся на разных этапах своего пути");
        phrases.add("Возможности появляются тогда, когда мы смело движемся вперед, несмотря на страх и неопределенность");
        phrases.add("Жизнь прекрасна, если только вы увидите красоту в каждом мгновении");

        String phrase = phrases.get(rn.nextInt(phrases.size()));
        return phrase;

    }
}
