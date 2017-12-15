import {Component} from '@angular/core';
import {EditorConfig} from './editormd/director/model/editor-config';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  conf = new EditorConfig();
  ts: any;

  onComplete(en: any) {
    this.ts = en;
  }

}
