import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Book } from '../book';
import { BookService } from '../book.service';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css'],
})
export class BookComponent implements OnInit {
  books: Book[] | undefined;
  book: Book | undefined;

  constructor(private bookservice: BookService, private router: Router) {}//inject router in constructor

  ngOnInit(): void {
    this.fetchList();
  }

  fetchList() {
    this.bookservice.getBooks().subscribe((data: Book[]) => {
      console.log(data);
      this.books = data;
    });
  }

  // 2. do routing,
  updateBook(id: number | undefined) {
    this.router.navigate(["update-book", id]);
  }

  deleteBook(id: number | undefined) {
    this.bookservice.deleteBookById(id).subscribe(() => {
      this.fetchList();
      this.book=undefined;
      console.log('book deleted');
    });
  }
}
