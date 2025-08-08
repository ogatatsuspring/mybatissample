package com.example.mybatissample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.mybatissample.entity.Book;
import com.example.mybatissample.mapper.BookMapper;

@Controller
//@RequiredArgsConstructor
public class BookController {
  
  private final BookMapper bookMapper;
  
  // DI
  public BookController( BookMapper bookMapper ) {
    this.bookMapper = bookMapper;
  }
  
  @GetMapping( "/" )
  public String showIndex() {
    return "book/index";
  }
  
  @GetMapping( "/list" )
  public String showAllBooks( Model model ) {
    model.addAttribute( "message", "一覧表示" );
    model.addAttribute( "books", bookMapper.getAllBooks() );
    return "book/success";
  }
  
  @GetMapping( "/detail/{id}" )
  public String showBook( @PathVariable int id, Model model ) {
    model.addAttribute( "message", "詳細表示" );
    model.addAttribute( "book", bookMapper.getBookById( id ) );
    return "book/success";
  }
  
  @GetMapping( "/create" )
  public String createBook( Model model ) {
    Book book = new Book();
    book.setTitle( "クラウド技術を学ぶ" );
    book.setAuthor( "山田太郎" );
    bookMapper.insertBook( book );
    model.addAttribute( "message", "登録成功" );
    return "book/success";
  }
  
  @GetMapping( "/update/{id}" )
  public String updateBook( @PathVariable int id, Model model ) {
    Book book = new Book();
    book.setId( id );
    book.setTitle( "更新されたタイトル" );
    book.setAuthor( "更新太郎" );
    bookMapper.updateBook( book );
    model.addAttribute( "message", "更新成功" );
    return "book/success";
  }
  
  @GetMapping( "/delete/{id}" )
  public String deleteBook( @PathVariable int id, Model model ) {
    bookMapper.deleteBookById( id );
    model.addAttribute( "message", "削除成功" );
    return "book/success";
  }

}
