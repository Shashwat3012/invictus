// import { Component, OnInit } from '@angular/core';

import { RowOutlet } from '@angular/cdk/table';
import { Component, Inject, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import {
  MatDialog,
  MatDialogRef,
  MAT_DIALOG_DATA,
} from '@angular/material/dialog';
import { MatSnackBar } from '@angular/material/snack-bar';
import { MatTableDataSource } from '@angular/material/table';
import { Router } from '@angular/router';
import { UserService } from '../service/user.service';
// import { UserService } from '../services/user.service';

export interface ProductInfo {
  uuid: string;
  item: string;
  owner: string;
  price: string;
  filename: string;
  filecontent: string;
  contact: string;
}

@Component({
  selector: 'app-marketplace1',
  templateUrl: './marketplace1.component.html',
  styleUrls: ['./marketplace1.component.css'],
})
export class Marketplace1Component implements OnInit {
  displayedColumns: string[] = [
    'item',
    'owner',
    'contact',
    'price',
    'filecontent',
  ];
  dataSource!: MatTableDataSource<ProductInfo>;

  patientId = '';

  constructor(
    public dialog: MatDialog,
    private userService: UserService,
    private _snackbar: MatSnackBar,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.fetchProduct();
  }

  fetchProduct() {
    this.userService.fetchProdcuts().subscribe((response) => {
      this.dataSource = response;
    });
  }
  
  // openDialog() {
  //   // this.dialog.open(Market_AddProduct, {
  //   //   height: '600px',
  //   //   width: '600px',
  //   //   data:Response
  //   // });
  //    this.router.navigate(['/market_addcommunity']);
  // }

  openDialog() {
    this.dialog.open(MarketPlaceDialogComponent, {
      height: '600px',
      width: '600px',
    });
  }
}

@Component({
  selector: 'app-allergies',
  templateUrl: './market-place-dialog.html',
  styleUrls: ['./marketplace1.component.css'],
})
export class MarketPlaceDialogComponent implements OnInit {
  selectedFiles: any;
  constructor(
    public dialogRef: MatDialogRef<MarketPlaceDialogComponent>,
    private userService: UserService,
    private _snackbar: MatSnackBar
  ) {}

  form: FormGroup = new FormGroup({
    item: new FormControl(''),
    owner: new FormControl(''),
    price: new FormControl(''),
    contact: new FormControl(''),
    file: new FormControl(''),
  });

  ngOnInit(): void {}

  upload(event: Event) {
    console.log(event);
    if (event.target != null) {
      console.log(event.target);
    }
  }
  selectFile(event:any) {
    this.selectedFiles = event.target?.files;
    console.log(this.selectedFiles);
}

  submit() {
    const fileRequest = {
      item: sessionStorage.getItem('item'),
      owner: this.form.get('owner')!.value,
      price: this.form.get('price')!.value,
      contact: this.form.get('contact')!.value,
      filename: this.selectedFiles.item(0).name,
      filecontent: this.selectedFiles.item(0).toString(),
    };
    console.log(fileRequest);
    this.userService.submitFile(fileRequest).subscribe(() => {
      this._snackbar.open('Successfully submitted info', 'Close', {
        duration: 1500,
      });
      this.dialogRef.close();
    });
  }

  close() {
    this.dialogRef.close();
  }
}

  @Component({
    selector: 'app-marketplace1',
    templateUrl: './market_addproduct.html',
    styleUrls: ['./market_addproduct.css']
  })
  export class Market_AddProduct implements OnInit {
    // form: FormGroup = new FormGroup({
    //   itemname: new FormControl(''),
    //   price: new FormControl(''),
    //   owner: new FormControl(''),
    //   content: new FormControl(''),
    //   contact: new FormControl(''),
    //   // diseases: new FormControl(''),
    //   // injuryHistory: new FormControl(''),
    //   // medication: new FormControl(''),
    //   // height: new FormControl(''),
    //   // weight: new FormControl(''),
    //   // nominee1Name: new FormControl(''),
    //   // nominee1Contact: new FormControl(''),
    //   // nominee2Name: new FormControl(''),
    //   // nominee2Contact: new FormControl('')
    // });


      //  constructor(public dialogRef: MatDialogRef<Market_AddProduct>,
      //   @Inject(MAT_DIALOG_DATA) public data: any,
      //   private _snackbar: MatSnackBar) { }
  
    ngOnInit(): void {
    }
    
  
    submit() {
      // const user = {
      //   itemname: this.form.get('itemname')!.value,
      //   // price: sessionStorage.getItem("userId"),
      //   price: this.form.get('price')!.value,
      //   owner: this.form.get('owner')!.value,
      //   content: this.form.get('content')!.value,
      //   contact: this.form.get('contact')!.value,
      //   // bloodGroup: this.form.get('bloodgroup')!.value,
      //   // allergies: this.form.get('allergies')!.value,
      //   // disease: this.form.get('diseases')!.value,
      //   // injuryHistory: this.form.get('injuryHistory')!.value,
      //   // medication: this.form.get('medication')!.value,
      //   // nominee1Name: this.form.get('nominee1Name')!.value,
      //   // nominee1Contact: this.form.get('nominee1Contact')!.value,
      //   // nominee2Name: this.form.get('nominee2Name')!.value,
      //   // nominee2Contact: this.form.get('nominee2Contact')!.value
      // }
    }
      // this.userService.submitPatientData(user).subscribe((response) => {
      //   this._snackbar.open("Successfully submitted info", "Close", {
      //     duration: 1500,
  
      //   });
      // close() {
      //   this.dialogRef.close();
      // }
      // })
    
  }




