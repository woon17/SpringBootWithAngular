import { Component, OnInit } from '@angular/core';
import { Book } from '../book';
import { Router, ActivatedRoute } from '@angular/router';
import { BookService } from '../book.service';
import { Observable } from 'rxjs';
@Component({
  selector: 'app-book-by-id',
  templateUrl: './book-by-id.component.html',
  styleUrls: ['./book-by-id.component.css'],
})
export class BookByIdComponent implements OnInit {
  id: number | undefined;
  books: Book[] | undefined;
  book: Book | undefined;
  constructor(
    private bookservice: BookService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.fetchList();
  }

  fetchList() {
    this.bookservice.getBooks().subscribe((data: Book[]) => {
      console.log(data);
      this.books = data;
    });
  }

  bookDetail(id: number | undefined) {
    this.bookservice.getBookById(id).subscribe((data: Book) => {
      this.book = data;
    });
  }

  deleteBook(id: number | undefined) {
    this.bookservice.deleteBookById(id).subscribe(() => {
      this.fetchList();
      this.book=undefined;
      console.log('user deleted');
    });
  }
}
