import { Component } from '@angular/core';
import {EditorConfig} from 'ngx-editor.md';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  conf = new EditorConfig();
  editorInstance: any;

  onComplate(editorInstance: any) {
    this.editorInstance = editorInstance;
  }
}
