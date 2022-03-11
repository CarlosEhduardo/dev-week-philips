import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatSortModule } from '@angular/material/sort';
import { MatCardModule } from '@angular/material/card';
import { HttpClientModule } from '@angular/common/http';
import { MatTableModule } from '@angular/material/table';
import { MatToolbarModule } from '@angular/material/toolbar';

import { OcorrenciasRoutingModule } from './ocorrencias-routing.module';
import { OcorrenciasComponent } from './ocorrencias/ocorrencias.component';
import { OcorrenciaService } from './service/ocorrencia.service';
import { RegiaoService } from './service/regiao.service';
import { FaixaEtariaService } from './service/faixa-etaria.service';

@NgModule({
  declarations: [
    OcorrenciasComponent
  ],
  imports: [
    CommonModule,
    OcorrenciasRoutingModule,
    MatSortModule,
    MatCardModule,
    HttpClientModule,
    MatTableModule,
    MatToolbarModule,
  ],
  providers: [
    OcorrenciaService,
    RegiaoService,
    FaixaEtariaService,
  ]
})
export class OcorrenciasModule { }
