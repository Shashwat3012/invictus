import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { Router } from '@angular/router';
import { UserService } from '../service/user.service';

export interface CommunityInfo {
  fullName: string;
  email: string;
  phoneNo: string;
  role: string;
  gender: string;
  birthDate: string;
}
@Component({
  selector: 'app-community-info',
  templateUrl: './community-info.component.html',
  styleUrls: ['./community-info.component.css']
})
export class CommunityInfoComponent implements OnInit {
  displayedColumns: string[] = [
    'fullName',
    'email',
    'phoneNo',
    'gender',
    'birthDate',
  ];
  dataSource!: MatTableDataSource<CommunityInfo>;
  constructor(private userService: UserService) { }

  ngOnInit(): void {
    this.fetchProduct();
  }

  fetchProduct() {
    this.userService.fetchProfiles().subscribe((response) => {
      this.dataSource = response;
    });
  }
 

  

}

@Component({
  selector: 'app-community-info',
  templateUrl: './addcommunity.html',
  styleUrls: ['./addcommunity.css']
})
export class Addcommunity implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  // openDialog() {
  //   this.router.navigate(['/addcommunity.html']);
  // }

  

}