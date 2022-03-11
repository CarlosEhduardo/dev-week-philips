import { Component, OnDestroy, OnInit } from '@angular/core';
import { Subscription } from 'rxjs';
import { Faixaetaria } from '../model/faixaetaria';
import { Ocorrencia } from '../model/ocorrencia';
import { Regiao } from '../model/regiao';
import { FaixaEtariaService } from '../service/faixa-etaria.service';
import { OcorrenciaService } from '../service/ocorrencia.service';
import { RegiaoService } from '../service/regiao.service';


@Component({
  selector: 'app-ocorrencias',
  templateUrl: './ocorrencias.component.html',
  styleUrls: ['./ocorrencias.component.css']
})
export class OcorrenciasComponent implements OnInit, OnDestroy {

  
  ocorrencia_exame: Ocorrencia[] = [];
  regioes: Regiao[] = [];
  faixaetaria_var: Faixaetaria[] = [];

  readonly subscriptions = new Subscription();

  constructor(
    private ocorrenciaService: OcorrenciaService,
    private regiaoService: RegiaoService,
    private faixaEtariaService: FaixaEtariaService,
    ) { }

  ngOnInit(): void {
    this.ocorrenciaService.listOcorrencias().subscribe(ocorrencias => {this.ocorrencia_exame = ocorrencias});
    this.regiaoService.listRegioes().subscribe(regioes => {this.regioes = regioes});
    this.faixaEtariaService.listFaixaEtaria().subscribe(faixas => {this.faixaetaria_var = faixas});
  }
  ngOnDestroy(): void {
    this.subscriptions.unsubscribe();
  }
  

}
