/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.youtube02;

/**
 *
 * @author carlo
 */
public class Youtube02 {

    public static void main(String[] args) {
            Usuario usuario= new Usuario("carlos");
            Video video = new Video("Aprendiendo java",2400,"https;//youtube.com");
            usuario.subirVideo(video);
            usuario.mostrarInfoUsuario();
            
            Usuario usuario2=new Usuario("Alfonso miguell");
            Comentario comment1=new Comentario("Ya reprobaste chavo:)",usuario2);
            System.out.println("El usuario "+ usuario2.getNombre()+"Pubico el comentario"+ comment1.getContenido());
    }
}
