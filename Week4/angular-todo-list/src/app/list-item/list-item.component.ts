import { Component, OnInit, Input, Output, EventEmitter } from '@angular/core';
import { TaskItem } from '../domain/TaskItem';

@Component({
  selector: 'app-list-item',
  templateUrl: './list-item.component.html',
  styleUrls: ['./list-item.component.css']
})
export class ListItemComponent implements OnInit {

  @Input() item: TaskItem;
  @Output() onSelect: EventEmitter<{}> = new EventEmitter<{}>();
  selected: boolean = false;

  constructor() { }

  ngOnInit() {
  }

  selectMe() {
    this.selected = !this.selected;
    this.onSelect.emit({
      item: this.item,
      selected: this.selected
    })
  }
}
