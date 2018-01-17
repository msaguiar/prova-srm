import { Injectable } from '@angular/core';
import { Risco } from "./risco.model";
import { Http, Response } from "@angular/http";
import "rxjs/add/operator/map";
import "rxjs/add/operator/catch";
import { Observable } from "rxjs/Observable";


@Injectable()
export class RiscoService {

  apiUrl = '/api/risco/listar';


  constructor(private http: Http) {
  }

  findAll(): Observable<Risco[]> {
    return this.http.get(this.apiUrl)
      .map((res: Response) => res.json())
      .catch((error: any) => Observable.throw(error.json().error || 'Server error'));
  }
}
