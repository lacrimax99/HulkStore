import { CatalogoComponent } from './views/catalogo/catalogo.component';
import { PaginainicioComponent } from './views/paginainicio/paginainicio.component';
import { NotFoundComponent } from './views/not-found/not-found.component';
import { PedidoComponent } from './views/pedido/pedido.component';
import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', component: PaginainicioComponent},
  { path: 'catalogo', component: CatalogoComponent},
  { path: 'pedido', component: PedidoComponent},
  { path: '404', component: NotFoundComponent},
  { path: '**', redirectTo: '/404'}
];

/**
 * Modulo del Router de la aplicacion.
 */
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
