import { Component, OnInit } from '@angular/core';
import { MatSnackBar } from '@angular/material/snack-bar';
import { UserService } from '../service/user.service';

export interface Profile {
  uuid: string;
  fullName: string;
  userName: string;
  password: string;
  role: string;
  gender: string;
  phoneNo: string;
  email: string;
}

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css'],
})
export class ProfileComponent implements OnInit {
  userId: string = '';
  profile!: Profile;
  loaded = false;
  constructor(
    private userService: UserService,
    private _snackBar: MatSnackBar
  ) {}

  ngOnInit(): void {
    this.fetchProfile();
  }
  fetchProfile() {
    this.loaded = false;
    this.userId = sessionStorage.getItem('userId') || '';
    this.userService.fetchMyProfile(this.userId).subscribe((response) => {
      console.log(response);
      this.profile = response;
      this.loaded = true;
    });
  }
}
