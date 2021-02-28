import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { UsuarioLogin } from '../model/UsuarioLogin';
import { AuthService } from '../service/auth.service';

@Component({
  selector: 'app-entrar',
  templateUrl: './entrar.component.html',
  styleUrls: ['./entrar.component.css']
})
export class EntrarComponent implements OnInit {

  userLogin: UsuarioLogin=new UsuarioLogin()
  constructor(
    private authService: AuthService,
    private router: Router
  ) { }

  ngOnInit(){
    window.scroll(0,0)
  }
  entrar(){
    this.authService.entrar(this.userLogin).subscribe((resp:UsuarioLogin)=>{
      this.userLogin=resp

      environment.token=this.userLogin.token
      environment.nome=this.userLogin.nome
      environment.foto=this.userLogin.foto

      console.log( environment.token) 
      console.log( environment.id)
      console.log( environment.nome)
      console.log( environment.foto)   

      this.router.navigate(["/inicio"])
    },error=>{
      if(error.status==500){
        alert('Usuário ou senha estão incorretos')
      }
    })
  }
}