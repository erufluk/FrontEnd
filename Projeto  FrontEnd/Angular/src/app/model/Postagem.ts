import { Usuario } from "./Usuario"

export class Postagem {
    public id: number
    public titulo: string
    public texto: string
    public tema: string
    public data: Date
    public Usuario: Usuario
    
}