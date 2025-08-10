package com.example.mybatissample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.mybatissample.entity.Book;

@Mapper
public interface BookMapper {
  
  List<Book> getAllBooks();
  Book getBookById( int id );
  int insertBook( Book book );
  int updateBook( Book book );
  int deleteBookById( int id );
  
}
