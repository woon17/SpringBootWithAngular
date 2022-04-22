import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // import and need to inject to the constructor of the book service
import { Observable } from 'rxjs';
import { Book } from './book';

@Injectable({
  providedIn: 'root',
})
export class BookService {
  // use the baseUrl to hit the request
  private baseUrl = 'http://localhost:8080';
  // inject to the constructor of the book service
  constructor(private http: HttpClient) {}

  getBooks(): Observable<Book[]> {
    console.log(`${this.baseUrl}`);
    return this.http.get<Book[]>(`${this.baseUrl}`);
  }

  getBookById(id: number | undefined): Observable<Book> {
    console.log(`${this.baseUrl}/books/${id}`);
    return this.http.get<Book>(`${this.baseUrl}/books/${id}`);
  }

  updateBook(id: number, book: Book): Observable<Object> {
    console.log(`${this.baseUrl}/updatebook/${id}`);
    return this.http.put(`${this.baseUrl}/updatebook/${id}`, book);
  }

  deleteBookById(id: number | undefined) {
    console.log(`${this.baseUrl}}/deletebook/${id}`);
    // this.http.delete(`${this.baseUrl}/deletebook/${id}`).subscribe(() => console.log("user deleted"));;
    return this.http.delete(`${this.baseUrl}/deletebook/${id}`);
  }
}
