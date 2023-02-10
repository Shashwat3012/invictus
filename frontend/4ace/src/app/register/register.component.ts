import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css'],
})
export class RegisterComponent implements OnInit {
  form: FormGroup = new FormGroup({
    fullname: new FormControl(''),
    username: new FormControl(''),
    password: new FormControl(''),
    role: new FormControl(''),
    gender: new FormControl(''),
    email: new FormControl(''),
    dob: new FormControl(''),
    contact: new FormControl(''),
  });
  constructor(
    private router: Router,
    private userService: UserService,
    private _snackBar: MatSnackBar
  ) {}

  ngOnInit(): void {}

  register() {
    const user = {
      fullName: this.form.get('fullname')!.value || '',
      userName: this.form.get('username')!.value || '',
      password: this.form.get('password')!.value || '',
      role: this.form.get('role')!.value || '',
      gender: this.form.get('username')!.value || '',
      phoneNo: this.form.get('contact')!.value || '',
      email: this.form.get('role')!.value || '',
      birthDate: this.form.get('dob')!.value || '',
    };
    this.userService.register(user).subscribe((response) => {
        this._snackBar.open('Register Successful', 'Close', {
          duration: 1500,
        });
      
    });
  }
}
