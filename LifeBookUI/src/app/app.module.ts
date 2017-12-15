import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppComponent} from './app.component';
import {EditorMdModule} from './editormd/editor-md.module';
@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    EditorMdModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
