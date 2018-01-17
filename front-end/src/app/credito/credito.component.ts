import { Component, OnInit } from '@angular/core';
import { Credito } from './credito.model';
import { RiscoService } from '../risco/risco.service';
import { CreditoService } from './credito.service';
import { Risco } from '../risco/risco.model';


@Component({
  selector: 'credito',
  templateUrl: './credito.component.html',
  styleUrls: ['./credito.component.css'],
  providers: [RiscoService, CreditoService]
})
export class CreditoComponent implements OnInit {


  riscos: Risco[];
  model = new Credito();


  constructor(
    private riscoService: RiscoService,
    private creditoService: CreditoService
  ) { }


  ngOnInit() {
    this.populeRiscos();
  }

  populeRiscos() {
    this.riscoService.findAll().subscribe(
      riscos => {
        this.riscos = riscos;
      },
      err => {
        console.log(err);
      }

    );
  }

  onSubmit() {

    this.creditoService.save(this.model).subscribe(
      result => {
        if (result) {
          alert('Cadastros Salvo com Sucesso!!!')
          this.model = new Credito();
        }
      }



    );


  }
}