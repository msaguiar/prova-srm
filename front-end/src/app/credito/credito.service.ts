import { Injectable } from '@angular/core';
import { Credito } from "./credito.model";
import { Http, Response } from "@angular/http";
import { Observable } from "rxjs/Observable";
import { APP_BASE_HREF } from '@angular/common';


@Injectable()
export class CreditoService {

  private apiUrl = '/api/credito';

  constructor(private http: Http) {
  }

  save(credito: Credito): Observable<Boolean> {
    return this.http.post(this.apiUrl, credito).map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));


  }
}
