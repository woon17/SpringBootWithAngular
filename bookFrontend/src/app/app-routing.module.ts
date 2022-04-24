import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AppComponent } from './app.component';
import { BookComponent } from './book/book.component';
import { UpdateBookComponent } from './update-book/update-book.component';

// 1. add router here
const routes: Routes = [{ path: 'update-book/:id' , component: UpdateBookComponent}, { path: 'books' , component: BookComponent}, { path: '' , component: BookComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}
