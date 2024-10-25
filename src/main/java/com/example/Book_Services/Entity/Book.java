package com.example.Book_Services.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Book {
    @Id
    private String bookId;
    private String bookTitle;
    private String authorId;
    private double bookPrice;

}
