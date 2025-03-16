package ru.yandex.practicum.catsgram.model;

import java.time.Instant;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(of = { "id" })
public class Post {
    Long id;
    long authorId;
    String description;
    Instant postDate;

}
