import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  role = sessionStorage.getItem('role');
  userId = sessionStorage.getItem('userId');
  constructor(private router: Router) { }

  ngOnInit(): void {
    if (sessionStorage.getItem('role') != null) {
      this.role = sessionStorage.getItem('role');
    }
  }

  logout() {
    sessionStorage.removeItem('userId');
    sessionStorage.removeItem('role');
    this.router.navigate(['/login'])
  }

  profileMethod(str:string){
    if(str == 'home'){
      this.router.navigate(['/home']);
    }
    if(str == 'discussion'){
      this.router.navigate(['/discussionforum']);
    }
    if(str == 'courses'){
      this.router.navigate(['/courses']);
    }
    if(str == 'market-place'){
      this.router.navigate(['/marketplace']);
    }
    if(str == 'community'){
      this.router.navigate(['/community']);
    }
    if(str == 'profile'){
      this.router.navigate(['/profile']);
    }
    if(str == 'survey'){
      this.router.navigate(['/survey']);
    }
    if(str == 'ideas'){
      this.router.navigate(['/idea-wall']);
    }
  }

}

