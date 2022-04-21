import { Component, OnInit } from '@angular/core';
import { Book } from '../book';
import { BookService } from '../book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css'],
})
export class BookComponent implements OnInit {
  books: Book[] | undefined;

  constructor(private bookservice: BookService) {}

  ngOnInit(): void {
    this.bookservice.getBooks().subscribe((data: Book[]) => {
      console.log(data);
      this.books = data;
    });
  }
}
