import { Component, OnInit } from '@angular/core';
import { Injectable } from '@angular/core';
import { BehaviorSubject } from 'rxjs';


@Component({
  selector: 'app-discussionforum1',
  templateUrl: './discussionforum1.component.html',
  styleUrls: ['./discussionforum1.component.css']
})
export class Discussionforum1Component implements OnInit {

  messages: string[] = [];
  newMessage = '';

  sendMessage() {
    if (this.newMessage) {
      this.messages.push(this.newMessage);
      this.newMessage = '';
    }
  }

  constructor() { }

  ngOnInit(): void {
  }

}
