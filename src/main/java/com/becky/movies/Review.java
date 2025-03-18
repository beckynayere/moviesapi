package com.becky.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "review")
@Data
//@AllArgsConstructor
@NoArgsConstructor

public class Review {
}
