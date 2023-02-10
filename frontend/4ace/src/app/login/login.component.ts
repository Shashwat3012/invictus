import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { MatSnackBar } from '@angular/material/snack-bar';
import { Router } from '@angular/router';
import { UserService } from '../service/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {
  constructor(
    private router: Router,
    private userService: UserService,
    private _snackBar: MatSnackBar
  ) {}

  ngOnInit(): void {}

  form: FormGroup = new FormGroup({
    username: new FormControl(''),
    password: new FormControl(''),
    role: new FormControl(''),
  });

  submit() {
    if (this.form.get('role')!.value != 'Admin') {
      const user = {
        userName: this.form.get('username')!.value || '',
        password: this.form.get('password')!.value || '',
        role: this.form.get('role')!.value || '',
      };
      this.userService.login(user).subscribe((response) => {
        if (response != 'User Not Found!') {
          sessionStorage.setItem('userId', response);
          sessionStorage.setItem('role', user.role);
          this.router.navigate(['/home']);
          this._snackBar.open('Login Successful', 'Close', {
            duration: 1500,
          });
        }
      });
    }
  }

  register() {
    this.router.navigate(['/register']);
  }
}
