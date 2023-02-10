import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable()
export class UserService {
  httpOptions: any;
  constructor(private http: HttpClient) {
    this.httpOptions = {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        Accept: '*/*',
      }),
    };
  }

  login(user: any): Observable<any> {
    return this.http.post('http://localhost:8080/login', user, {
      ...this.httpOptions,
      responseType: 'text',
    });
  }

  register(user: any): Observable<any> {
    return this.http.post('http://localhost:8080/register', user, {
      ...this.httpOptions,
      responseType: 'text',
    });
  }

  fetchProfiles(): Observable<any> {
    return this.http.get('http://localhost:8080/community', {
      ...this.httpOptions,
    });
  }

  fetchCourses(): Observable<any> {
    return this.http.get('http://localhost:8080/trainings', {
      ...this.httpOptions,
    });
  }

  fetchProdcuts(): Observable<any> {
    return this.http.get('http://localhost:8080/marketPlace', {
      ...this.httpOptions,
    });
  }

  fetchIdeas(): Observable<any> {
    return this.http.get('http://localhost:8080/marketPlace', {
      ...this.httpOptions,
    });
  }

  fetchMyProfile(userId: string): Observable<any> {
    let queryParams = new HttpParams().append('userId', userId);
    return this.http.get('http://localhost:8080/myProfile', {
      ...this.httpOptions,
      params: queryParams,
    });
  }

  submitFile(file: any): Observable<any> {
    return this.http.post('http://localhost:8080/saveMarketPlace', file, {
      ...this.httpOptions,
      responseType: 'text',
    });
  }
}
