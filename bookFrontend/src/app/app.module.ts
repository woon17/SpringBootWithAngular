import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http'; // import and need to add into import section

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BookComponent } from './book/book.component';
import { BookByIdComponent } from './book-by-id/book-by-id.component';
import { UpdateBookComponent } from './update-book/update-book.component';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [AppComponent, BookComponent, BookByIdComponent, UpdateBookComponent],
  imports: [BrowserModule, AppRoutingModule, HttpClientModule, FormsModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
