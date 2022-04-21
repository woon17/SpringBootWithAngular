import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'; // import and need to inject to the constructor of the book service
import { Observable } from 'rxjs';
import { Book } from './book';


@Injectable({
  providedIn: 'root'
})

export class BookService {
  // use the baseUrl to hit the request
  private baseUrl = "http://localhost:8080/books";
  // inject to the constructor of the book service
  constructor(private http:HttpClient) { }

  getBooks():Observable<Book[]>{
    return this.http.get<Book[]>(`${this.baseUrl}`);
  }
}
